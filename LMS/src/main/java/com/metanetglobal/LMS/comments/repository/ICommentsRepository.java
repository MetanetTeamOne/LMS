package com.metanetglobal.LMS.comments.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.comments.model.Comments;

@Repository
@Mapper
public interface ICommentsRepository {
	List<Comments> getLectureIdComments(int lectureCommentId);
	Comments getComments(int commentsId);
	void insertComments(Comments comments);
	void updateComments(Comments comments);
	void deleteComments(int commentsId, int studentId);
}
