package com.metanetglobal.LMS.lecturecomment.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class LectureComment {
	private int lectureCommentId;
	private String lectureCommentContent;
	private int lectureCommentStarScore;
	private int courseId;
	private int lectureId;
	private String studentId;
	private Date lectureCommentWriteDate;
}
