package com.edu.baiedu.service;


import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.model.UserDto;

import java.util.Date;

public interface LoginService {
	void addUserRegister(RegisterDto registerDto, UserDto userDto, AudioDto audioDto);
	
	int getUserNumByUserName(String userName);
	
	UserDto getUserByUserNameAndPassword(String userName, String password);
	
	void changeLoginTimeByUserName(String userName, Date loginTime);
	
	void updatePasswordByUserName(String userName, String password);
}
