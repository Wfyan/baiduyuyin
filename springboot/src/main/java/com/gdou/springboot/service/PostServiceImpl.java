package com.gdou.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gdou.springboot.dto.AppDto;
import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.dto.PostDto;
import com.gdou.springboot.mapper.PbAppMapper;
import com.gdou.springboot.mapper.PbAudioMapper;
import com.gdou.springboot.mapper.PbCommentMapper;
import com.gdou.springboot.mapper.PbCommentPraiseMapper;
import com.gdou.springboot.mapper.PbPostMapper;
import com.gdou.springboot.mapper.PbPostPraiseMapper;
@Service("postService")
public class PostServiceImpl implements PostService {
	@Autowired
	private PbPostMapper pbPostMapper;
	@Autowired
	private PbPostPraiseMapper pbPraiseMapper;
	@Autowired
	private PbCommentMapper pbCommentMapper;
	@Autowired
	private PbAudioMapper pbAudioMapper;
	
	@Autowired
	private PbCommentPraiseMapper pbCommentPraiseMapper;
	@Autowired
	private PbAppMapper pbAppMapper;
	@Override
	public void addPost(PostDto postDto) {
		// TODO Auto-generated method stub
		pbPostMapper.insertPost(postDto);
	}
	@Override
	public int getPostAllNum(String postTitle,String userUUID) {
		// TODO Auto-generated method stub
		return pbPostMapper.selectPostAllNum(postTitle,userUUID);
	}
	@Override
	public List<PostDto> selectPostList(String postTitle, Integer pageNo, Integer pageSize,String userUUID) {
		// TODO Auto-generated method stub
		return pbPostMapper.selectPostList(postTitle, pageNo, pageSize,userUUID);
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED ,rollbackFor={RuntimeException.class, Exception.class})
	public void deletePost(String[] postUUID) {
		// TODO Auto-generated method stub
		pbCommentPraiseMapper.deleteCommentPraiseByPostUUID(postUUID);
		pbPraiseMapper.deletePostPraise(postUUID);
		pbCommentMapper.deleteCommentByPostUUID(postUUID);
		pbPostMapper.deletePost(postUUID);
		
	}
	@Override
	public AudioDto selectAudioByUserUUID(String userUUID) {
		// TODO Auto-generated method stub
		return pbAudioMapper.selectAudioByUserUUID(userUUID);
	}
	@Override
	public AppDto selectApp() {
		// TODO Auto-generated method stub
		return pbAppMapper.selectApp();
	}

}
