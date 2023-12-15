package com.metanetglobal.LMS.lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.lecture.model.Lecture;
import com.metanetglobal.LMS.lecture.repository.ILectureRepository;

@Service
public class LectureService implements ILectureService{

	@Autowired
	ILectureRepository lectureRepository;

	@Override
	public List<Lecture> getLectureList() {
		return lectureRepository.getLectureList();
	}

	@Override
	public List<Lecture> getLectureList(int majorId) {
		return lectureRepository.getLectureList(majorId);
	}
	


}
