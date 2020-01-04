package com.gdou.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.mapper.PbRegisterMapper;

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
