package com.metanetglobal.LMS.lecturecomment.controller;

import java.security.Principal;
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
	public List<LectureComment> getLectureComment(Principal principal){
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return lectureCommentService.getLectureComment();
		}
		return null;
	}
	
	@GetMapping("/{lectureId}")
	public List<LectureComment> getLectureComment(@PathVariable int lectureId, Principal principal) {
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return lectureCommentService.getLectureComment(lectureId);
		}
		return null;
	}
	
	@GetMapping("/lecture/{lectureCommentId}")
	public LectureComment getLectureCommentIdLectureComment(@PathVariable int lectureCommentId, Principal principal) {
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			return lectureCommentService.getLectureCommentIdLectureComment(lectureCommentId);
		}
		return null;
	}

	@PostMapping("/insert")
	public String insertLectureComment(@RequestBody LectureComment lectureComment, Principal principal) {
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			
			System.out.println(lectureComment);
			lectureCommentService.insertLectureComment(lectureComment);
			return "ok";
		}
		return "fail";
	}
	
	@PatchMapping("/update")
	public String updateLectureComment(@RequestBody LectureComment lectureComment, Principal principal) {
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			lectureCommentService.updateLectureComment(lectureComment);
			return "ok";
		}
		return "fail";
	}
	
	@DeleteMapping("/delete/{lectureCommentId}/{studentId}")
	public String deleteLectureComment(@PathVariable int lectureCommentId, @PathVariable String studentId, Principal principal) {
		String session_isCheck_userid = principal.getName();
		if(session_isCheck_userid != null && !session_isCheck_userid.equals("")) {
			lectureCommentService.deleteLectureComment(lectureCommentId, studentId);
			return "ok";
		}
		return "fail";
	}

}
