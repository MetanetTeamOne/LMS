package com.metanetglobal.LMS.student.controller;

import java.util.List;

import org.mybatis.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.service.IStudentService;




@RestController
public class StudentContorller {
	@Autowired
	IStudentService studentService;	
	
	@GetMapping("/mypage")
	public StudentVO findStudentById(@RequestBody int studentId) {
		StudentVO student = studentService.findStudentById(studentId);
		return student;
	}
	
	@PostMapping("/signin")
	public String insertStudent(@RequestBody StudentVO student) {
		studentService.insertStudent(student);
		return "ok";
	}
	
	
	@PatchMapping("/mypage/update")
	public String updateStudent(@RequestBody StudentVO student){
		studentService.updateStudent(student);
		return "ok";
	}
	
	@DeleteMapping("/mypage/delete")
	public String deleteStudent(@RequestBody String email) {
		studentService.deleteStudent(email);
		return "ok";
	}
}
