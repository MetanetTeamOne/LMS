package com.metanetglobal.LMS.lecture.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.lecture.model.Lecture;
import com.metanetglobal.LMS.lecture.service.ILectureService;

@RestController
@RequestMapping("/lecture")
public class LectureController {

	@Autowired
	ILectureService lectureService;
	
	@GetMapping("/")
	public List<Lecture> getLectureList(Principal principal){
		System.out.println("====LectureController getLectureList====");
		String session_isCheck_userid = principal.getName();		
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return lectureService.getLectureList();
		}
		return null;
	}
	
	@GetMapping("/{majorId}")
	public List<Lecture> getLectureList(@PathVariable int majorId, Principal principal){
		System.out.println("====LectureController getLectureList====");
		String session_isCheck_userid = principal.getName();		
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return lectureService.getLectureList(majorId);
		}
		return null;
	}
	
}
