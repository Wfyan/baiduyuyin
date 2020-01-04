package com.edu.baiedu.service;


import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.dao.PbRegister;
import com.edu.baiedu.dao.PbUser;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.model.UserDto;

import java.util.Date;

public interface LoginService {
	void addUserRegister(PbRegister registerDto, PbUser userDto, PbAudio audioDto);
	
	int getUserNumByUserName(String userName);
	
	UserDto getUserByUserNameAndPassword(String userName, String password);
	
	void changeLoginTimeByUserName(String userName, Date loginTime);
	
	void updatePasswordByUserName(String userName, String password);
}
