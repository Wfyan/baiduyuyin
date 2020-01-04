package com.gdou.springboot.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.dto.UserDto;
import com.gdou.springboot.mapper.PbAudioMapper;
import com.gdou.springboot.mapper.PbRegisterMapper;
import com.gdou.springboot.mapper.PbUserMapper;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	@Autowired
	private PbUserMapper pbUserMapper;
	@Autowired
	private PbAudioMapper pbAudioMapper;
	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void addUserRegister(RegisterDto registerDto, UserDto userDto,AudioDto audioDto) {
		// TODO Auto-generated method stub
		pbUserMapper.insertUser(userDto);
		pbRegisterMapper.insertRegister(registerDto);
		pbAudioMapper.insertAudio(audioDto);
	}

	@Override
	public int getUserNumByUserName(String userName) {
		// TODO Auto-generated method stub
		return pbUserMapper.selectUserNumByUserName(userName);
	}



	@Override
	public void changeLoginTimeByUserName(String userName, Date loginTime) {
		// TODO Auto-generated method stub
		pbUserMapper.updateLoginTimeByUserName(userName, loginTime);
	}

	@Override
	public UserDto getUserByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return pbUserMapper.selectUserByUserNameAndPassword(userName, password);
	}

	@Override
	public void updatePasswordByUserName(String userName, String password) {
		// TODO Auto-generated method stub
		pbUserMapper.updatePasswordByUserName(userName, password);
	}

}
