package com.gdou.springboot.service;

import java.util.List;

import com.gdou.springboot.dto.AppDto;
import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.dto.PostDto;

public interface PostService {
	void addPost(PostDto postDto);
	int getPostAllNum(String postTitle,String userUUID);
	List<PostDto> selectPostList(String postTitle,Integer pageNo, Integer pageSize,String userUUID);
	void deletePost(String[] postUUID);
	AudioDto selectAudioByUserUUID(String userUUID);
	AppDto selectApp();
}
