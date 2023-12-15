package com.metanetglobal.LMS.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.course.model.Course;
import com.metanetglobal.LMS.course.service.ICourseService;


@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	ICourseService courseService;
	
	@GetMapping("")
	public void test(){
		System.out.println("test");
	} 
	
	@GetMapping("/{studentId}")
	public List<Course> getCourseList(@PathVariable int studentId){
		System.out.println(studentId);
		
		List<Course> courseList = courseService.getCourseList(studentId);
//		System.out.println("getCourseList==========studentId=========");
//		System.out.println("courseList>>"+courseList);
//		System.out.println("studentId>>"+studentId);
		return courseList;
	} 
	
	@PostMapping("/insert")
	public void insertCourse(@RequestBody Course course) {
		//System.out.println("=======insert controller=======");
		System.out.println("course>>>"+course);
		courseService.insertCourse(course);
	}
	
//	@DeleteMapping("/delete")
//	public int deleteCourse(@RequestBody CourseVO course) {
//		System.out.println("=======delete controller=======");
//		return courseService.deleteCourse(course);
//	}

	
	@DeleteMapping("/delete/{studentId}/{courseId}")
	public int deleteCourse(@PathVariable int studentId, @PathVariable int courseId) {
		System.out.println("=======delete controller=======");
		return courseService.deleteCourse(studentId, courseId);
	}

	
}
