package com.gdou.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdou.springboot.dto.PostPraiseDto;
import com.gdou.springboot.dto.CommentDto;
import com.gdou.springboot.dto.CommentPraiseDto;
import com.gdou.springboot.dto.PostDto;
import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.dto.UserDto;
import com.gdou.springboot.mapper.PbCommentMapper;
import com.gdou.springboot.mapper.PbCommentPraiseMapper;
import com.gdou.springboot.mapper.PbPostMapper;
import com.gdou.springboot.mapper.PbPostPraiseMapper;
import com.gdou.springboot.mapper.PbRegisterMapper;
import com.gdou.springboot.mapper.PbUserMapper;
@Service("commentService")
public class CommentServiceImpl implements CommentService {
	@Autowired
	private PbPostMapper pbPostMapper;
	@Autowired
	private PbUserMapper pbUserMapper;
	
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	
	@Autowired
	private PbPostPraiseMapper pbPraiseMapper;
	
	@Autowired
	private PbCommentMapper pbCommentMapper;
	
	@Autowired
	private PbCommentPraiseMapper pbCommentPraiseMapper;
	@Override
	public PostDto selectPostByPostUUID(String postUUID) {
		// TODO Auto-generated method stub
		return pbPostMapper.selectPostByPostUUID(postUUID);
	}
	@Override
	public UserDto selectUserByUserUUID(String userUUID) {
		// TODO Auto-generated method stub
		return pbUserMapper.selectUserByUserUUID(userUUID);
	}
	@Override
	public void updatePostPageviews(String postUUID, int postPageviews) {
		// TODO Auto-generated method stub
		pbPostMapper.updatePostPageviews(postUUID, postPageviews);
	}
	@Override
	public RegisterDto selectRegister(String userUUID) {
		// TODO Auto-generated method stub
		return pbRegisterMapper.selectRegister(userUUID);
	}
	@Override
	public List<PostPraiseDto> selectPraiseByPostUUID(String postUUID) {
		// TODO Auto-generated method stub
		return pbPraiseMapper.selectPraiseByPostUUID(postUUID);
	}
	@Override
	public void insertPraise(PostPraiseDto pbPostPraiseDto) {
		// TODO Auto-generated method stub
		pbPraiseMapper.insertPraise(pbPostPraiseDto);
	}
	@Override
	public int selectPraiseNum(String postUUID) {
		// TODO Auto-generated method stub
		return pbPraiseMapper.selectPraiseNum(postUUID);
	}
	@Override
	public void insertComment(CommentDto commentDto) {
		// TODO Auto-generated method stub
		pbCommentMapper.insertComment(commentDto);
	}
	@Override
	public List<CommentDto> selectCommentHotsByPostUUID(String postUUID) {
		// TODO Auto-generated method stub
		return pbCommentMapper.selectCommentHotsByPostUUID(postUUID);
	}
	@Override
	public List<CommentDto> selectAllCommentByPostUUID(String postUUID) {
		// TODO Auto-generated method stub
		return pbCommentMapper.selectAllCommentByPostUUID(postUUID);
	}
	@Override
	public int selectCommentNumByParameter(String postUUID, String cmUUID, String userUUID) {
		// TODO Auto-generated method stub
	
		return pbCommentPraiseMapper.selectCommentNumByParameter(postUUID, cmUUID, userUUID);
	
		
	}
	@Override
	public void insertPraise(CommentPraiseDto CommentPraiseDto) {
		// TODO Auto-generated method stub
		pbCommentPraiseMapper.insertPraise(CommentPraiseDto);
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void deleteComment(String[] cmUUID) {
		// TODO Auto-generated method stub
		pbCommentPraiseMapper.deleteCommentPraiseByCmUUID(cmUUID);
		pbCommentMapper.deleteCommentByCmUUID(cmUUID);
	}
	@Override
	public List<CommentDto> selectMyCommentByUserUUID(String userUUID, Integer pageNo, Integer pageSize) {
		// TODO Auto-generated method stub
		return pbCommentMapper.selectMyCommentByUserUUID(userUUID, pageNo, pageSize);
	}
	@Override
	public int selectMyCommentNumByUserUUID(String userUUID) {
		// TODO Auto-generated method stub
		return pbCommentMapper.selectMyCommentNumByUserUUID(userUUID);
	}
	@Override
	public String selectCmTextByCmUUID(String cmUUID) {
		// TODO Auto-generated method stub
		return pbCommentMapper.selectCmTextByCmUUID(cmUUID);
	}
	@Override
	public void updateCmByCmUUID(CommentDto commentDto) {
		// TODO Auto-generated method stub
		pbCommentMapper.updateCmByCmUUID(commentDto);
	}



}
