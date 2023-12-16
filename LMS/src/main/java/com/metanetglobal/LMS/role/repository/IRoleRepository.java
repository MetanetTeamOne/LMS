package com.metanetglobal.LMS.role.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.metanetglobal.LMS.role.model.Role;

@Repository
@Mapper
public interface IRoleRepository {
	public String getRoleName(@Param("studentId") String studentId);
	
	public void deleteRole(@Param("studentId") String studentId);
	
	public void insertRole(@Param("role") Role role);
}
