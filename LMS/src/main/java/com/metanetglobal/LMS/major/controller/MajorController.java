package com.metanetglobal.LMS.major.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.metanetglobal.LMS.major.model.MajorVO;
import com.metanetglobal.LMS.major.service.IMajorService;

@Controller
public class MajorController {
	@Autowired
	IMajorService majorService;

	@GetMapping("/major/list")
	public List<MajorVO> findAllMajorList(){
		List<MajorVO> findAllMajorList = majorService.findAllMajorList();
		return findAllMajorList;
	}
}
