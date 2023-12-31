package com.metanetglobal.LMS.course.controller;

import java.security.Principal;
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
	public List<Course> getCourseList(@PathVariable String studentId, Principal principal){
		
		System.out.println(studentId);
		String session_isCheck_userid = principal.getName();		
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			List<Course> courseList = courseService.getCourseList(studentId);
//			System.out.println("getCourseList==========studentId=========");
//			System.out.println("courseList>>"+courseList);
//			System.out.println("studentId>>"+studentId);
			return courseList;
		}
		return null;
	} 
	
	@PostMapping("/insert")
	public void insertCourse(@RequestBody Course course, Principal principal) {
		//System.out.println("=======insert controller=======");
		System.out.println("course>>>"+course);
		String session_isCheck_userid = principal.getName();		
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			courseService.insertCourse(course);
		}
	}
	
//	@DeleteMapping("/delete")
//	public int deleteCourse(@RequestBody CourseVO course) {
//		System.out.println("=======delete controller=======");
//		return courseService.deleteCourse(course);
//	}

	
	@DeleteMapping("/delete/{studentId}/{courseId}")
	public int deleteCourse(@PathVariable String studentId, @PathVariable int courseId, Principal principal) {
		System.out.println("=======delete controller=======");
		String session_isCheck_userid = principal.getName();		
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return courseService.deleteCourse(studentId, courseId);
		}
		return -1;
	}
}
