package com.metanetglobal.LMS.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentContorller {
	@Autowired
	IStudentService studentService;

	@GetMapping("/list")
	public List<StudentVO> findAllStudent(){
		List<StudentVO> list = studentService.findAllStudents();
		return list;
	}
	
	@GetMapping("/list/{studentId}")
	public StudentVO findStudentById(@PathVariable("studentId") int studentId) {
		StudentVO student = studentService.findStudentById(studentId);
		return student;
	}
	
	@GetMapping("/signin")
	public String insertForm() {
		return  "ok";
	}
	
	@PostMapping("/signin")
	public StudentVO insertStudent(@RequestBody StudentVO student) {
		studentService.insertStudent(student);
		return student;
	}
	
	@GetMapping("/mypage/update")
	public StudentVO updateForm(@PathVariable("studentId") int studentId) {
		StudentVO student = studentService.findStudentById(studentId);
		return student;
	}
	
	@PostMapping("/mypage/update")
	public StudentVO updateStudent(@RequestBody StudentVO student){
		studentService.updateStudent(student);
		return student;
	}
}
