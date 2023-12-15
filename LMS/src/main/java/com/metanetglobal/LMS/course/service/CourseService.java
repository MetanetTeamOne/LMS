package com.metanetglobal.LMS.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.course.model.Course;
import com.metanetglobal.LMS.course.repository.ICourseRepository;


@Service
public class CourseService implements ICourseService{

	@Autowired
	ICourseRepository courseRepository;
	
	@Override
	public List<Course> getCourseList(String studentId) {
		//System.out.println("--CourseService---");
		return courseRepository.getCourseList(studentId);
	}

	@Override
	public void insertCourse(Course course) {
//		System.out.println("==========insertCourse===========");
//		System.out.println("course>>>"+course);
		courseRepository.insertCourse(course);
	}

//	@Override
//	public int deleteCourse(CourseVO course) {
//		return courseRepository.deleteCourse(course);
//	}

//	@Override
//	public int deleteCourse(int studentId, int lectureId) {
//		return courseRepository.deleteCourse(studentId, lectureId);
//	}

	@Override
	public int deleteCourse(String studentId, int courseId) {
//		System.out.println("=====deleteCourseService====");
//		System.out.println("studentId >> "+studentId);
//		System.out.println("courseId >> "+courseId);
		return courseRepository.deleteCourse(studentId, courseId);
	}



}
