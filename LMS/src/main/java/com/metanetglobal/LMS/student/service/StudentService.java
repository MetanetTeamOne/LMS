package com.metanetglobal.LMS.student.service;

import java.util.List;

import javax.security.auth.Subject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.student.controller.StudentContorller;
import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.StudentFormDto;
import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.repository.IStudentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
public class StudentService implements IStudentService {
	@Autowired
	IStudentRepository studentRepository;
	private static Logger logger = LoggerFactory.getLogger(StudentService.class.getName());
	

	public StudentDto findStudentById(int studentId) {
		logger.info("서비스");
		logger.info("studentId {}",studentId);
		return studentRepository.findStudentById(studentId);
	}
	
	public void insertStudent(StudentVO student) {
		studentRepository.insertStudent(student);
	}
	
	public void deleteStudent(String email) {
		studentRepository.deteteStudent(email);
	}
	
	public void updateStudent(StudentVO student) {
		studentRepository.updateStudent(student);
	}

}
