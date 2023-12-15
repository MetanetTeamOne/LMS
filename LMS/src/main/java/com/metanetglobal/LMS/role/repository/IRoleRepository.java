package com.metanetglobal.LMS.role.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IRoleRepository {
	public String getRoleName(@Param("studentId") String studentId);
}
