package com.metanetglobal.LMS.comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.comments.model.Comments;

@Service
public class CommentsService implements ICommentsService {
	
	@Autowired
	ICommentsService commentService;

	@Override
	public List<Comments> getLectureIdComments(int lectureCommentId) {
		return commentService.getLectureIdComments(lectureCommentId);
	}

	@Override
	public Comments getComments(int commentsId) {
		return commentService.getComments(commentsId);
	}

	@Override
	public void insertComments(Comments comments) {
		commentService.insertComments(comments);
	}

	@Override
	public void updateComments(Comments comments) {
		commentService.updateComments(comments);
	}

	@Override
	public void deleteComments(int commentsId, int studentId) {
		commentService.deleteComments(commentsId, studentId);
	}
	
}
