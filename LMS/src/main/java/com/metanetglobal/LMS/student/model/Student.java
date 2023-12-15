package com.metanetglobal.LMS.student.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Student {
	private String studentId;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String grade;
	private Date admissionYear;
	private String role;
	private String password;
	private int majorId;
}
