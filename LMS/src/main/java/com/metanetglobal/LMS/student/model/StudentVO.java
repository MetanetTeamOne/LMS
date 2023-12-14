package com.metanetglobal.LMS.student.model;

import lombok.Data;

@Data
public class StudentVO {
	private int studentId;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String grade;
	private String admissionYear;
	private String role;
	private String password;
	private int majorId;
}
