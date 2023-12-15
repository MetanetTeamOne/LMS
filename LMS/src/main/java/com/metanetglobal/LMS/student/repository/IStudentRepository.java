package com.metanetglobal.LMS.student.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.student.model.StudentVO;

@Repository
@Mapper
public interface IStudentRepository {

	StudentVO findStudentById(@Param("studentId") int studentId);
	void insertStudent(StudentVO student);
	void deteteStudent(@Param("email") String email);
	void updateStudent(StudentVO student);
}
