package com.edu.baiedu.service.impl;

import com.edu.baiedu.dao.PbPost;
import com.edu.baiedu.repository.*;
import com.edu.baiedu.model.AppDto;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.PostDto;
import com.edu.baiedu.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
	public void addPost(PbPost postDto) {
		// TODO Auto-generated method stub
		pbPostMapper.insertSelective(postDto);
	}
	@Override
	public int getPostAllNum(String postTitle,String userUUID) {
		// TODO Auto-generated method stub
		return pbPostMapper.selectPostAllNum(postTitle,userUUID);
	}
	@Override
	public List<PostDto> selectPostList(String postTitle, Integer pageNo, Integer pageSize, String userUUID) {
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
