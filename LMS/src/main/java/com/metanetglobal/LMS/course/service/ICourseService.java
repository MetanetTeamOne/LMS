package com.metanetglobal.LMS.course.service;

import java.util.List;

import com.metanetglobal.LMS.course.model.Course;


public interface ICourseService {

	//수강 내역 조회
	List<Course> getCourseList(int studentId);
	//수강 정보 등록
	void insertCourse(Course course);
	//수강 정보 삭제
	//int deleteCourse(int studentId, int lectureId);
	int deleteCourse(int studentId, int courseId);
	//int deleteCourse(CourseVO course);
}
