package com.metanetglobal.LMS.lecture.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.lecture.model.Lecture;
import com.metanetglobal.LMS.major.model.MajorVO;

@Repository
@Mapper
public interface ILectureRepository {
	//전체 강의 목록 조회
	List<Lecture> getLectureList();
	//학과별 강의 목록 조회
	List<Lecture> getLectureList(int majorId);
}
