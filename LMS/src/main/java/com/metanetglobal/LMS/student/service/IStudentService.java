package com.metanetglobal.LMS.student.service;

import java.util.List;

import com.metanetglobal.LMS.student.model.StudentVO;

public interface IStudentService {
	
	public StudentVO findStudentById(int studentId);
	
	public void insertStudent(StudentVO student);
	
	public void deleteStudent(String email);
	
	public void updateStudent(StudentVO student);
}
