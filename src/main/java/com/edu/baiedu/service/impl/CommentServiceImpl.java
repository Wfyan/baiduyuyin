package com.edu.baiedu.service.impl;

import com.edu.baiedu.dao.PbComment;
import com.edu.baiedu.dao.PbCommentPraise;
import com.edu.baiedu.dao.PbPostPraise;
import com.edu.baiedu.repository.*;
import com.edu.baiedu.model.*;
import com.edu.baiedu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
	public void insertPraise(PbPostPraise pbPostPraiseDto) {
		// TODO Auto-generated method stub
		pbPraiseMapper.insertSelective(pbPostPraiseDto);
	}
	@Override
	public int selectPraiseNum(String postUUID) {
		// TODO Auto-generated method stub
		return pbPraiseMapper.selectPraiseNum(postUUID);
	}
	@Override
	public void insertComment(PbComment commentDto) {
		// TODO Auto-generated method stub
		pbCommentMapper.insertSelective(commentDto);
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
	public void insertPraise(PbCommentPraise CommentPraiseDto) {
		// TODO Auto-generated method stub
		pbCommentPraiseMapper.insertSelective(CommentPraiseDto);
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
	public void updateCmByCmUUID(PbComment commentDto) {
		// TODO Auto-generated method stub
		pbCommentMapper.updateByPrimaryKeySelective(commentDto);
	}



}
