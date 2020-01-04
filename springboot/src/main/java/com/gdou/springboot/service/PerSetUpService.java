package com.gdou.springboot.service;

import com.gdou.springboot.dto.RegisterDto;

public interface PerSetUpService {
	RegisterDto selectRegisterAndUserName(String userUUID);
	void upDateUser(RegisterDto registerDto);
}
