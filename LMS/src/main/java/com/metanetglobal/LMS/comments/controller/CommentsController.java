package com.metanetglobal.LMS.comments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.metanetglobal.LMS.comments.model.Comments;
import com.metanetglobal.LMS.comments.service.ICommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsController {
	@Autowired
	ICommentsService commentsService;

	@GetMapping("/")
	public void test(){
		System.out.println("CommentsTest");
	}
	
	@GetMapping("/lecture/{lectureCommentId}")
	public List<Comments> getLectureIdComments(@PathVariable int lectureCommentId){
		System.out.println("lectureCommentId : " + lectureCommentId);
		return commentsService.getLectureIdComments(lectureCommentId);
	}
	
	@GetMapping("/commet/{commentsId}")
	public Comments getComments(@PathVariable int commentsId){
		return commentsService.getComments(commentsId);
	}
	
	@PostMapping("/insert")
	public String insertComments(@RequestBody Comments comments) {
		commentsService.insertComments(comments);
		return "ok";
	}
	
	@PatchMapping("/update")
	public String updateComments(@RequestBody Comments comments) {
		commentsService.updateComments(comments);
		return "ok";
	}
	
	@DeleteMapping("/delete/{commentsId}/{studentId}")
	public String deleteComments(@PathVariable int commentsId, @PathVariable int studentId) {
		commentsService.deleteComments(commentsId, studentId);
		return "ok";
	}
}
