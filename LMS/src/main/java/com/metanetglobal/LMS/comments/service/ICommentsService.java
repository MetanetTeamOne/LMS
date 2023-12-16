package com.metanetglobal.LMS.comments.service;

import java.util.List;

import com.metanetglobal.LMS.comments.model.Comments;

public interface ICommentsService {
	List<Comments> getLectureIdComments(int lectureCommentId);
	Comments getComments(int commentsId);
	void insertComments(Comments comments);
	void updateComments(Comments comments);
	void deleteComments(int commentsId, String studentId);
}
