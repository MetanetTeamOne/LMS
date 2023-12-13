package com.metanetglobal.LMS.lecture.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LectureVO {

	private int lectureId;
	private String lectureName;
	private String lectureLocation;
	private String lectureTime;
	private int lectureCredit;
	private int professorId;
	private int studentId;
	private int majorId;
	
}
