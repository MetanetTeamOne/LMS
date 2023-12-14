package com.metanetglobal.LMS.major.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metanetglobal.LMS.major.model.MajorVO;
import com.metanetglobal.LMS.major.repository.IMajorRepository;

@Service
public class MajorService implements IMajorService {
	@Autowired
	IMajorRepository majorRepository;

	@Override
	public List<MajorVO> findAllMajorList() {
		return majorRepository.findAllMajorList();
	}
}
