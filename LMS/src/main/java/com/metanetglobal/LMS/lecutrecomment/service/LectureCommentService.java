package com.metanetglobal.LMS.lecutrecomment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.metanetglobal.LMS.lecutrecomment.model.LectureCommentVO;
import com.metanetglobal.LMS.lecutrecomment.repository.ILectureCommentRepository;

public class LectureCommentService implements ILectureCommentService {

	@Autowired
	ILectureCommentRepository lectureCommentRepository;
	
	@Override
	public List<LectureCommentVO> getLectureAllComment() {
		return lectureCommentRepository.getLectureAllComment()
;	}

	@Override
	public LectureCommentVO getLectureLectureIdComment(int lectureId) {
		return lectureCommentRepository.getLectureLectureIdComment(lectureId);
	}

	@Override
	public LectureCommentVO getLectureStudentIdCommnet(int studentId) {
		return lectureCommentRepository.getLectureStudentIdCommnet(studentId);
	}

	@Override
	public void insertLectureComment(LectureCommentVO lectureCommentVO) {
		lectureCommentRepository.insertLectureComment(lectureCommentVO);
		
	}

	@Override
	public void updateLectureComment(LectureCommentVO lectureCommentVO) {
		lectureCommentRepository.updateLectureComment(lectureCommentVO);
	}

	@Override
	public void deleteLectureComment(int lectureCommentId, int studentId) {
		lectureCommentRepository.deleteLectureComment(lectureCommentId, studentId);
	}

}
