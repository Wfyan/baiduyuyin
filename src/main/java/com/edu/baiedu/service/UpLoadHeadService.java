package com.edu.baiedu.service;

import com.edu.baiedu.model.RegisterDto;

public interface UpLoadHeadService {
	String selectRegPhotoByUserUUID(String userUUID);
	void upDateRegPhotoByRegUUID(RegisterDto registerDto);
}
