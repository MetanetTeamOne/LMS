package com.metanetglobal.LMS.lecturecomment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.lecturecomment.model.LectureComment;
import com.metanetglobal.LMS.lecturecomment.service.ILectureCommentService;

@RestController
@RequestMapping("/lecturecomment")
public class LectureCommentController {
	@Autowired
	ILectureCommentService lectureCommentService;
	
	@GetMapping("/")
	public List<LectureComment> getLectureComment(){
		return lectureCommentService.getLectureComment();
	}
	
	@GetMapping("/{lectureId}")
	public List<LectureComment> getLectureComment(@PathVariable int lectureId) {
		return lectureCommentService.getLectureComment(lectureId);
	}
	
	@GetMapping("/lecture/{lectureCommentId}")
	public LectureComment getLectureCommentIdLectureComment(@PathVariable int lectureCommentId) {
		return lectureCommentService.getLectureCommentIdLectureComment(lectureCommentId);
		
	}

	@PostMapping("/insert")
	public String insertLectureComment(@RequestBody LectureComment lectureComment) {
		lectureCommentService.insertLectureComment(lectureComment);
		return "ok";
	}
	
	@PatchMapping("/update")
	public String updateLectureComment(@RequestBody LectureComment lectureComment) {
		lectureCommentService.updateLectureComment(lectureComment);
		return "ok";
	}
	
	@DeleteMapping("/delete/{lectureCommentId}/{studentId}")
	public String deleteLectureComment(@PathVariable int lectureCommentId, @PathVariable int studentId) {
		lectureCommentService.deleteLectureComment(lectureCommentId, studentId);
		return "ok";
	}

}
