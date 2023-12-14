package com.metanetglobal.LMS.student.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.student.model.StudentVO;

@Repository
@Mapper
public interface IStudentRepository {

	List<StudentVO> findAllStudents();
	StudentVO findStudentById(int studentId);
	void insertStudent(StudentVO student);
	void deteteStudentById(int studentId);
	void updateStudent(StudentVO student);
}
