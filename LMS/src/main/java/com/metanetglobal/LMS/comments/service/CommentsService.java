package com.metanetglobal.LMS.comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.comments.model.Comments;
import com.metanetglobal.LMS.comments.repository.ICommentsRepository;

@Service
public class CommentsService implements ICommentsService {
	
	@Autowired
	ICommentsRepository commentsRepository;

	@Override
	public List<Comments> getLectureIdComments(int lectureCommentId) {
		return commentsRepository.getLectureIdComments(lectureCommentId);
	}

	@Override
	public Comments getComments(int commentsId) {
		return commentsRepository.getComments(commentsId);
	}

	@Override
	public void insertComments(Comments comments) {
		commentsRepository.insertComments(comments);
	}

	@Override
	public void updateComments(Comments comments) {
		commentsRepository.updateComments(comments);
	}

	@Override
	public void deleteComments(int commentsId, String studentId) {
		commentsRepository.deleteComments(commentsId, studentId);
	}
	
}
