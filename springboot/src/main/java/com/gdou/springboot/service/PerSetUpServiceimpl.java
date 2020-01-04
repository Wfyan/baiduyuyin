package com.gdou.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.mapper.PbRegisterMapper;
import com.gdou.springboot.mapper.PbUserMapper;
@Service("perSetUpService")
public class PerSetUpServiceimpl implements PerSetUpService {
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	
	@Autowired
	private PbUserMapper pbUserMapper;
	@Override
	public RegisterDto selectRegisterAndUserName(String userUUID) {
		// TODO Auto-generated method stub
		return pbRegisterMapper.selectRegisterAndUserName(userUUID);
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void upDateUser(RegisterDto registerDto) {
		// TODO Auto-generated method stub
		pbRegisterMapper.upDateRegisterByRegUUID(registerDto);
		pbUserMapper.updateUserNameByUserUUID(registerDto.getUserName(),registerDto.getUserUUID());
	}

}
