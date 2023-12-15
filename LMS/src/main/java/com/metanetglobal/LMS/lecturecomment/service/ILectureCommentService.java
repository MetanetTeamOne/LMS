package com.metanetglobal.LMS.lecturecomment.service;

import java.util.List;

import com.metanetglobal.LMS.lecturecomment.model.LectureComment;

public interface ILectureCommentService {
	List<LectureComment> getLectureComment();
	List<LectureComment> getLectureComment(int lectureId);
	LectureComment getLectureCommentIdLectureComment(int lectureCommentId);
	void insertLectureComment(LectureComment lectureComment);
	void updateLectureComment(LectureComment lectureComment);
	void deleteLectureComment(int lectureCommentId, int studentId);
}
