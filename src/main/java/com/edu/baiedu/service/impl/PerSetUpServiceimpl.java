package com.edu.baiedu.service.impl;

import com.edu.baiedu.repository.PbRegisterMapper;
import com.edu.baiedu.repository.PbUserMapper;
import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.service.PerSetUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
