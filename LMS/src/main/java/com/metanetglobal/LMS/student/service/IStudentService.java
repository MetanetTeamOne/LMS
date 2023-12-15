package com.metanetglobal.LMS.student.service;

import java.util.List;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.StudentFormDto;
import com.metanetglobal.LMS.student.model.StudentVO;

public interface IStudentService {
	
	public StudentDto findStudentById(int studentId);
	
	public void insertStudent(StudentVO student);
	
	public void deleteStudent(String email);
	
	public void updateStudent(StudentVO student);
}
