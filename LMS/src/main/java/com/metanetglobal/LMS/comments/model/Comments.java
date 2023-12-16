package com.metanetglobal.LMS.comments.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class Comments {
	private int commentsId;
	private int lectureCommentId;
	private String commentsContent;
	private String studentId;
	private Date commentWriteDate;
}
