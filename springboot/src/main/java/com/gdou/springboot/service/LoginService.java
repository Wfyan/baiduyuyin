package com.gdou.springboot.service;


import java.util.Date;


import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.dto.UserDto;

public interface LoginService {
	void addUserRegister(RegisterDto registerDto,UserDto userDto,AudioDto audioDto);
	
	int getUserNumByUserName(String userName);
	
	UserDto getUserByUserNameAndPassword(String userName,String password);
	
	void changeLoginTimeByUserName(String userName,Date loginTime);
	
	void updatePasswordByUserName(String userName,String password);
}
