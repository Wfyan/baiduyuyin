package com.gdou.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.dto.UserDto;
import com.gdou.springboot.mapper.PbAudioMapper;
import com.gdou.springboot.mapper.PbCommentMapper;
import com.gdou.springboot.mapper.PbCommentPraiseMapper;
import com.gdou.springboot.mapper.PbPostMapper;
import com.gdou.springboot.mapper.PbPostPraiseMapper;
import com.gdou.springboot.mapper.PbRegisterMapper;
import com.gdou.springboot.mapper.PbUserMapper;

@Service("userManageService")
public class UserManageServiceImpl implements UserManageService {
	@Autowired
	private PbUserMapper pbUserMapper;
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	
	@Autowired
	private PbAudioMapper pbAudioMapper;
	
	@Autowired
	private PbCommentMapper pbCommentMapper;
	
	@Autowired
	private PbCommentPraiseMapper pbCommentPraiseMapper;
	
	@Autowired
	private PbPostMapper pbPostMapper;
	@Autowired
	private PbPostPraiseMapper pbPraiseMapper;
	
	@Override
	public int getUserAllNum(String userName, String userUUID) {
		// TODO Auto-generated method stub
		return pbUserMapper.selectUserAllNum(userName, userUUID);
	}
	@Override
	public List<RegisterDto> selectRegList(String userName, Integer pageNo, Integer pageSize, String userUUID) {
		// TODO Auto-generated method stub
		return pbRegisterMapper.selectRegList(userName, pageNo, pageSize, userUUID);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void deleteUser(String[] userUUID) {
		// TODO Auto-generated method stub
		pbAudioMapper.deleteAudioByUserUUID(userUUID);
		pbCommentMapper.deleteCommentByUserUUID(userUUID);
		pbCommentPraiseMapper.deleteCommentPraiseByUserUUID(userUUID);
		pbPostMapper.deletePostByUserUUID(userUUID);
		pbPraiseMapper.deletePostPraiseByUserUUID(userUUID);
		pbRegisterMapper.deleteRegByUserUUID(userUUID);
		pbUserMapper.deleteUserByUserUUID(userUUID);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void updateUser(UserDto userDto, RegisterDto registerDto) {
		// TODO Auto-generated method stub
		pbUserMapper.updateUserByUserUUID(userDto);
		pbRegisterMapper.updateRegByUserUUID(registerDto);
	}

}
