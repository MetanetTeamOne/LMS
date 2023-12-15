package com.metanetglobal.LMS.student.service;

import java.util.List;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.StudentUpdateDto;
import com.metanetglobal.LMS.student.model.Student;

public interface IStudentService {
	
	public StudentDto findStudentById(String studentId);
	
	public void insertStudent(Student student);
	
	public void deleteStudent(String email);
	
	public void updateStudent(StudentUpdateDto student);
	
	public Student getStudentInfo(String studentId);
	
	public String getPassword(String studentId);
}
