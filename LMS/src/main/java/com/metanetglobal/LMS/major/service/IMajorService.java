package com.metanetglobal.LMS.major.service;

import java.util.List;

import com.metanetglobal.LMS.major.model.MajorVO;

public interface IMajorService {

	public List<MajorVO> findAllMajorList();
	public MajorVO findMajorById(int majorId);
}
