package com.metanetglobal.LMS.student.model;

import lombok.Data;

@Data
public class StudentVO {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	private String studentPhoneNumber;
	private String studentGrade;
	private String studentAdmissionYear;
	private int majorId;
}
