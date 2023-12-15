package com.metanetglobal.LMS.lecture.controller;

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
	public List<Lecture> getLectureList(){
		System.out.println("====LectureController getLectureList====");
		return lectureService.getLectureList();
	}
	
	@GetMapping("/{majorId}")
	public List<Lecture> getLectureList(@PathVariable int majorId){
		System.out.println("====LectureController getLectureList====");
		return lectureService.getLectureList(majorId);
	}
	
}
