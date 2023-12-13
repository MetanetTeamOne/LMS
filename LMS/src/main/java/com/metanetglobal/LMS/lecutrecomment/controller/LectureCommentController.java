package com.metanetglobal.LMS.lecutrecomment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.lecutrecomment.model.LectureCommentVO;
import com.metanetglobal.LMS.lecutrecomment.service.ILectureCommentService;

@RestController
@RequestMapping("/lectureComment")
public class LectureCommentController {
	@Autowired
	ILectureCommentService lectureCommentService;
	
	@GetMapping("/list")
	public List<LectureCommentVO> getLectureAllComment(){
		return null;
		
	}
	
	@GetMapping("/list/{lecutreId}")
	public LectureCommentVO getLectureLectureIdComment(int lectureId) {
		return null;
		
	}
	
	@GetMapping("/list/{studentId}")
	public LectureCommentVO getLectureStudentIdCommnet(int studentId) {
		return null;
		
	}
	
	@PostMapping("/insert")
	public void insertLectureComment(LectureCommentVO lectureCommentVO) {
		
	}
	
	@PutMapping("/update")
	public void updateLectureComment(LectureCommentVO lectureCommentVO) {
		
	}
	
	@DeleteMapping("/delete/{lectureCommentId}")
	public void deleteLectureComment(int lectureCommentId, int studentId) {
		
	}

}
