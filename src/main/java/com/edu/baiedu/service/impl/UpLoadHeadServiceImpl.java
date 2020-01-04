package com.edu.baiedu.service.impl;

import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.repository.PbRegisterMapper;
import com.edu.baiedu.service.UpLoadHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("upLoadHeadService")
public class UpLoadHeadServiceImpl implements UpLoadHeadService {
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	@Override
	public String selectRegPhotoByUserUUID(String userUUID) {
		// TODO Auto-generated method stub
		return pbRegisterMapper.selectRegPhotoByUserUUID(userUUID);
	}
	@Override
	public void upDateRegPhotoByRegUUID(RegisterDto registerDto) {
		// TODO Auto-generated method stub
		pbRegisterMapper.upDateRegPhotoByRegUUID(registerDto);
	}

}
