package com.hj.hoMEnu.service;

import org.springframework.stereotype.Service;

import com.hj.hoMEnu.dto.UserDto;

@Service
public interface UserService {
	
	//회원가입
	public int join(UserDto userDto);
	
	//중복확인, 회원 조회, 로그인
	public UserDto getUser(UserDto userDto);
	
	//탈퇴
	public int dropUser(UserDto userDto);

	//정보 수정
	public int modifyUser(UserDto userDto);

	//비밀번호 암호화
	public void securityPwd(UserDto userDto);
}
