package com.metanetglobal.LMS.lecturecomment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.lecturecomment.model.LectureComment;
import com.metanetglobal.LMS.lecturecomment.repository.ILectureCommentRepository;

@Service
public class LectureCommentService implements ILectureCommentService {

	@Autowired
	ILectureCommentRepository lectureCommentRepository;

	@Override
	public List<LectureComment> getLectureComment() {
		return lectureCommentRepository.getLectureComment();
	}
	@Override
	public List<LectureComment> getLectureComment(int lectureId) {
		return lectureCommentRepository.getLectureComment(lectureId);
	}

	@Override
	public LectureComment getLectureCommentIdLectureComment(int lectureCommentId) {
		return lectureCommentRepository.getLectureCommentIdLectureComment(lectureCommentId);
	}

	@Override
	public void insertLectureComment(LectureComment lectureComment) {
		lectureCommentRepository.insertLectureComment(lectureComment);
	}

	@Override
	public void updateLectureComment(LectureComment lectureComment) {
		lectureCommentRepository.updateLectureComment(lectureComment);
	}

	@Override
	public void deleteLectureComment(int lectureCommentId, String studentId) {
		lectureCommentRepository.deleteLectureComment(lectureCommentId, studentId);
	}
	

}
