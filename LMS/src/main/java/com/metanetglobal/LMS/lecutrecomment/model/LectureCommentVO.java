package com.metanetglobal.LMS.lecutrecomment.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class LectureCommentVO {
	private int lectureCommentId;
	private String lectureCommentContent;
	private int lectureStarScore;
	private int studentId;
	private int lectureId;
}
