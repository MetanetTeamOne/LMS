package com.metanetglobal.LMS.student.model;

import lombok.Data;

@Data
public class StudentUpdateDto {

	private String studentId;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String password;
}
