package com.metanetglobal.LMS.student.controller;

import java.util.Map;


import org.slf4j.Logger;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.Student;
import com.metanetglobal.LMS.student.service.IStudentService;

import jakarta.servlet.http.HttpSession;




@RestController
public class StudentContorller {
	@Autowired
	IStudentService studentService;	
	

	private static Logger logger = LoggerFactory.getLogger(StudentContorller.class.getName());
	
	@GetMapping("/loginSuccess") //로그인 성공 메시지 출력
	public String loginOk() {
		return "loginSuccess!!!";
	}
	
	@PostMapping("/login")
	public String login(String studentId, String password, HttpSession session) {
		Student student = studentService.getStudentInfo(studentId);
		
		if(student != null) {
			logger.info("student {}", student);
			String pw = student.getPassword();
			if(pw.equals(password)) {//비밀번호 일치할 경우
				session.setMaxInactiveInterval(600);
				session.setAttribute("studentId", studentId);
				session.setAttribute("name", student.getName());
				session.setAttribute("email", student.getEmail());
			} else {
				session.invalidate();
				return "잘못된 비밀번호 입니다.";
			}
		}else { //아이디가 없음
			session.invalidate();
			return "유저가 없습니다.";
		}
		return "로그인 성공";
	}
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "로그아웃 완료";
	}
	
	@GetMapping("/mypage") //회원정보 조회
	public StudentDto findStudentById(@RequestBody Map<String, String> map) {
		String Id = map.get("studentId");
		StudentDto student = studentService.findStudentById(Id);
		logger.info("studentId={}", map.get("studentId"));
		logger.info("student={}", student);
		return student;
	}
	
	@PostMapping("/signin") //회원가입
	public String insertStudent(@RequestBody Student student) {
		studentService.insertStudent(student);
		return "ok";
	}
	
	
	@PatchMapping("/mypage/update")
	public String updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
		return "ok";
	}
	
	@DeleteMapping("/mypage/delete") //회원 정보 삭제
	public String deleteStudent(@RequestBody Map<String, String> map) {
		String email = map.get("email");
		logger.info("email {}", email);
		studentService.deleteStudent(email);
		return "ok";
	}
}
