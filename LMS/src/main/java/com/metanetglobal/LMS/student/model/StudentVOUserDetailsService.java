package com.metanetglobal.LMS.student.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.metanetglobal.LMS.student.service.IStudentService;

@Component
public class StudentVOUserDetailsService implements UserDetailsService{
	@Autowired
	private IStudentService studentService; 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		StudentDto studentInfo = studentService.findStudentById(username);
		System.out.println(username + "loaduser");
		System.out.println(studentInfo);
		
		if(studentInfo == null) {
			throw new UsernameNotFoundException("["+username+"]사용자가 존재하지 않습니다.");
		}
		
		String[] roles = {"ROLE_USER", "ROLE_ADMIN"};
		List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(roles);
		
		return new StudentVOUserDetails(studentInfo.getName()
				, "{noop}"+studentInfo.getPassword()
				, authorities, studentInfo.getEmail());
	}
	
}