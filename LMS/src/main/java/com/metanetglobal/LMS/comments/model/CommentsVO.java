package com.metanetglobal.LMS.comments.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class CommentsVO {
	private int commentsId;
	private int lectureCommentId;
	private String commentsContent;
}
