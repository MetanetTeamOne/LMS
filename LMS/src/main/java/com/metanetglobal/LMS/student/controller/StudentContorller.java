package com.metanetglobal.LMS.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.service.StudentService;

@Controller
public class StudentContorller {
	@Autowired
	StudentService studentService;

	@GetMapping("/student/list")
	public String findAllStudent(Model model){
		List<StudentVO> list = studentService.findAllStudents();
		model.addAttribute("list", list);
		return "/student/list";
	}
	
	@GetMapping("/student/list/{studentId}")
	public String findStudentById(@PathVariable("studentId") int studentId, Model model) {
		StudentVO student = studentService.findStudentById(studentId);
		model.addAttribute("student", student);
		return "/student/info";
	}
	
	@GetMapping("/student/insert")
	public String insertForm() {
		return  "/student/insert";
	}
	
	@PostMapping("/student/insert")
	public String insertStudent(StudentVO student) {
		studentService.insertStudent(student);
		return "/student/list";
	}
	
	@GetMapping("/student/update/{studentId}")
	public String updateForm(@PathVariable("studentId") int studentId, Model model) {
		StudentVO student = studentService.findStudentById(studentId);
		model.addAttribute("student",student);
		return "/stuent/update";
		
	}
}
