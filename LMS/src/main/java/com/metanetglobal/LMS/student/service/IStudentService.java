package com.metanetglobal.LMS.student.service;

import java.util.List;

import com.metanetglobal.LMS.student.model.StudentVO;

public interface IStudentService {

	public List<StudentVO> findAllStudents();
	
	public StudentVO findStudentById(int studentId);
	
	public void insertStudent(StudentVO student);
	
	public void deleteStudentById(int studentId);
	
	public void updateStudent(StudentVO student);
}
