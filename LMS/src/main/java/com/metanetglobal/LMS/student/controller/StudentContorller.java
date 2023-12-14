package com.metanetglobal.LMS.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.service.StudentService;

@RestController
public class StudentContorller {
	@Autowired
	StudentService studentService;

	@GetMapping("/student/list")
	public List<StudentVO> findAllStudent(){
		List<StudentVO> list = studentService.findAllStudents();
		return list;
	}
	
	@GetMapping("/student/list/{studentId}")
	public StudentVO findStudentById(@PathVariable("studentId") int studentId) {
		StudentVO student = studentService.findStudentById(studentId);
		return student;
	}
	
	@GetMapping("/student/insert")
	public String insertForm() {
		return  "ok";
	}
	
	@PostMapping("/student/insert")
	public StudentVO insertStudent(@RequestBody StudentVO student) {
		studentService.insertStudent(student);
		return student;
	}
	
	@GetMapping("/student/update/{studentId}")
	public StudentVO updateForm(@PathVariable("studentId") int studentId) {
		StudentVO student = studentService.findStudentById(studentId);
		return student;
	}
	
	@PostMapping("/student/update")
	public StudentVO updateStudent(@RequestBody StudentVO student){
		studentService.updateStudent(student);
		return student;
	}
}
