package com.metanetglobal.LMS.student.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.metanetglobal.LMS.role.repository.IRoleRepository;
import com.metanetglobal.LMS.student.service.IStudentService;

@Component
public class StudentUserDetailsService implements UserDetailsService{
	@Autowired
	private IStudentService studentService; 
	
	@Autowired
	private IRoleRepository roleRepository; 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student studentInfo = studentService.getStudentInfo(username);
		System.out.println(username + "loaduser");
		System.out.println(studentInfo);
		
		if(studentInfo == null) {
			throw new UsernameNotFoundException("["+username+"]사용자가 존재하지 않습니다.");
		}
		
		
		String request_login_user_roleName = roleRepository.getRoleName(username);
		
		System.out.println("username : " + username + "rolename : " + request_login_user_roleName);
		
//		String[] roles = {"ROLE_USER", "ROLE_ADMIN"};
		
		String[] roles = {request_login_user_roleName};

		List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList(roles);
		
		System.out.println("authorities : " + authorities);
		// 암호화되지 않은 pwd를 사용할 경우 "{noop}"+pwd로 표기한다..
		return new StudentUserDetails(studentInfo.getStudentId()
				, studentInfo.getPassword()
				, authorities, studentInfo.getEmail());
	}
	
}