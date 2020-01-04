package com.edu.baiedu.service;


import com.edu.baiedu.model.*;

import java.util.List;

public interface CommentService {
	PostDto selectPostByPostUUID(String postUUID);
	UserDto selectUserByUserUUID(String userUUID);
	void updatePostPageviews(String postUUID, int postPageviews);
	RegisterDto selectRegister(String userUUID);
	List<PostPraiseDto> selectPraiseByPostUUID(String postUUID);
	void insertPraise(PostPraiseDto pbPostPraiseDto);
	int selectPraiseNum(String postUUID);
	
	void insertComment(CommentDto commentDto);
	
	List<CommentDto> selectCommentHotsByPostUUID(String postUUID);
	List<CommentDto> selectAllCommentByPostUUID(String postUUID);
	int selectCommentNumByParameter(String postUUID, String cmUUID, String userUUID);
	void insertPraise(CommentPraiseDto CommentPraiseDto);
	
	void deleteComment(String[] cmUUID);
	
	List<CommentDto> selectMyCommentByUserUUID(String userUUID, Integer pageNo, Integer pageSize);
	
	int selectMyCommentNumByUserUUID(String userUUID);
	
	String selectCmTextByCmUUID(String cmUUID);
	
	void updateCmByCmUUID(CommentDto commentDto);
}
