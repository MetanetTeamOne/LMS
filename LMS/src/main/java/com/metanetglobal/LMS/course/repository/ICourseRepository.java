package com.metanetglobal.LMS.course.repository;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.course.model.Course;


@Repository
@Mapper
public interface ICourseRepository {

	//수강 내역 조회
	List<Course> getCourseList(@Param("studentId") String studentId);
	//수강 정보 등록
	void insertCourse(Course course);
	//수강 정보 삭제
	//int deleteCourse(int studentId, int lectureId);
	int deleteCourse(@Param("studentId") String studentId, @Param("courseId") int courseId);
	//int deleteCourse(CourseVO course);
}
