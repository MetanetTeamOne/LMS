package com.metanetglobal.LMS.lecutrecomment.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.lecutrecomment.model.LectureCommentVO;

@Repository
@Mapper
public interface ILectureCommentRepository {
	List<LectureCommentVO> getLectureAllComment();
	LectureCommentVO getLectureLectureIdComment(int lectureId);
	LectureCommentVO getLectureStudentIdCommnet(int studentId);
	void insertLectureComment(LectureCommentVO lectureCommentVO);
	void updateLectureComment(LectureCommentVO lectureCommentVO);
	void deleteLectureComment(int lectureCommentId, int studentId);
}
