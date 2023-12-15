package com.metanetglobal.LMS.student.model;

import java.sql.Date;

import lombok.Data;

@Data
public class StudentDto {
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String grade;
	private Date admissionYear;
	private String password;
}
