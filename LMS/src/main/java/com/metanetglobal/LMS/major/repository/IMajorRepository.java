package com.metanetglobal.LMS.major.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.major.model.MajorVO;

@Repository
@Mapper
public interface IMajorRepository {

	public List<MajorVO> findAllMajorList();
	public MajorVO findMajorById(int majorId);
}
