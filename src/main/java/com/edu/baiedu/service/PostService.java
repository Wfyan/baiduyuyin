package com.edu.baiedu.service;

import com.edu.baiedu.dao.PbPost;
import com.edu.baiedu.model.AppDto;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.PostDto;

import java.util.List;

public interface PostService {
	void addPost(PbPost postDto);
	int getPostAllNum(String postTitle, String userUUID);
	List<PostDto> selectPostList(String postTitle, Integer pageNo, Integer pageSize, String userUUID);
	void deletePost(String[] postUUID);
	AudioDto selectAudioByUserUUID(String userUUID);
	AppDto selectApp();
}
