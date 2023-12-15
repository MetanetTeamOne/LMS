package com.metanetglobal.LMS.lecture.service;

import java.util.List;

import com.metanetglobal.LMS.lecture.model.Lecture;

public interface ILectureService {

	//전체 강의 목록 조회
	List<Lecture> getLectureList();
	//학과별 강의 목록 조회
	List<Lecture> getLectureList(int majorId);
	
}
