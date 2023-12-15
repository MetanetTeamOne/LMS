package com.metanetglobal.LMS.student.service;

import java.util.List;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.Student;

public interface IStudentService {
	
	public StudentDto findStudentById(String studentId);
	
	public void insertStudent(Student student);
	
	public void deleteStudent(String email);
	
	public void updateStudent(Student student);
	
	public Student getStudentInfo(String studentId);
}
