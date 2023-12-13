package com.metanetglobal.LMS.lecutrecomment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.lecutrecomment.model.LectureCommentVO;

@Service
public interface ILectureCommentService {
	public List<LectureCommentVO> getLectureAllComment();
	public LectureCommentVO getLectureLectureIdComment(int lectureId);
	public LectureCommentVO getLectureStudentIdCommnet(int studentId);
	public void insertLectureComment(LectureCommentVO lectureCommentVO);
	public void updateLectureComment(LectureCommentVO lectureCommentVO);
	public void deleteLectureComment(int lectureCommentId, int studentId);
}
