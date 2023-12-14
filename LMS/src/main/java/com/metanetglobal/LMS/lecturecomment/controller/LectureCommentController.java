package com.metanetglobal.LMS.lecturecomment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/lecture/{lecutreId}")
	public List<LectureComment> getLectureComment(int lectureId) {
		return lectureCommentService.getLectureComment(lectureId);
	}
	
	@GetMapping("/{lectureCommentId}")
	public LectureComment getLectureCommentIdLectureComment(int lectureCommentId) {
		return lectureCommentService.getLectureCommentIdLectureComment(lectureCommentId);
		
	}

	@PostMapping("/insert")
	public void insertLectureComment(LectureComment lectureComment) {
		lectureCommentService.insertLectureComment(lectureComment);
	}
	
	@PutMapping("/update")
	public void updateLectureComment(LectureComment lectureComment) {
		lectureCommentService.updateLectureComment(lectureComment);
	}
	
	@DeleteMapping("/delete/{lectureCommentId}/{studentId}")
	public void deleteLectureComment(@PathVariable int lectureCommentId, @PathVariable int studentId) {
		lectureCommentService.deleteLectureComment(lectureCommentId, studentId);
	}

}
