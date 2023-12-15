package com.metanetglobal.LMS.student.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.StudentUpdateDto;
import com.example.myapp.member.model.Member;
import com.metanetglobal.LMS.student.model.Student;
import com.metanetglobal.LMS.student.service.IStudentService;

import jakarta.servlet.http.HttpSession;

@RestController
public class StudentContorller {
	@Autowired
	IStudentService studentService;	
	
	private static Logger logger = LoggerFactory.getLogger(StudentContorller.class.getName());
	
	@GetMapping("/mypage") //회원정보 조회
	public StudentDto findStudentById(@RequestBody Map<String, String> map) {
		StudentDto student = studentService.findStudentById(map.get("studentId"));
		logger.info("studentId={}", map.get("studentId"));
		logger.info("student={}", student);
		return student;
	}
	
	@PostMapping("/signin") //회원가입
	public String insertStudent(@RequestBody Student student) {
		logger.info(student.getPassword());
		studentService.insertStudent(student);
		return "ok";
	}
	
//	@PostMapping(value="/member/insert")
//	public String insertMember(@Validated Member member, BindingResult result, String csrfToken, HttpSession session, Model model) {
//		if(csrfToken==null || "".equals(csrfToken)) {
//			throw new RuntimeException("CSRF 토큰이 없습니다.");
//		}else if(!csrfToken.equals(session.getAttribute("csrfToken"))) {
//			throw new RuntimeException("잘 못된 접근이 감지되었습니다.");
//		}
//		if(result.hasErrors()) {
//			model.addAttribute("member", member);
//			return "member/form";
//		}
//		try {
//			if(!member.getPassword().equals(member.getPassword2())) {
//				model.addAttribute("member", member);
//				model.addAttribute("message", "MEMBER_PW_RE");
//				return "member/form";
//			}
//			PasswordEncoder pwEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//			String encodedPw = pwEncoder.encode(member.getPassword());
//			member.setPassword(encodedPw);
//			memberService.insertMember(member);
//		}catch(DuplicateKeyException e) {
//			member.setUserid(null);
//			model.addAttribute("member", member);
//			model.addAttribute("message", "ID_ALREADY_EXIST");
//			return "member/form";
//		}
//		session.invalidate();
//		return "home";
//	}
	
	
	@PatchMapping("/mypage/update") //회원 정보 수정
	public String updateStudent(@RequestBody StudentUpdateDto student){
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
