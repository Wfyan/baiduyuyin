package com.edu.baiedu.service;


import com.edu.baiedu.model.RegisterDto;

public interface PerSetUpService {
	RegisterDto selectRegisterAndUserName(String userUUID);
	void upDateUser(RegisterDto registerDto);
}
