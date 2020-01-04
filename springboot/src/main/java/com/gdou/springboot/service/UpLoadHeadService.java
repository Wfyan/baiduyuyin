package com.gdou.springboot.service;

import com.gdou.springboot.dto.RegisterDto;

public interface UpLoadHeadService {
	String selectRegPhotoByUserUUID(String userUUID);
	void upDateRegPhotoByRegUUID(RegisterDto registerDto);
}
