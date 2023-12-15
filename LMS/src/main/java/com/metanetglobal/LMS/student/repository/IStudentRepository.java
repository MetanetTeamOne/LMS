package com.metanetglobal.LMS.student.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.student.model.StudentDto;
import com.metanetglobal.LMS.student.model.StudentFormDto;
import com.metanetglobal.LMS.student.model.StudentVO;
import com.metanetglobal.LMS.student.service.StudentService;

@Repository
@Mapper
public interface IStudentRepository {


	StudentDto findStudentById(@Param("studentId") int studentId);
	void insertStudent(@Param("student") StudentVO student);
	void deteteStudent(@Param("email") String email);
	void updateStudent(@Param("student") StudentVO student);

}