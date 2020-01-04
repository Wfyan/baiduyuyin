package com.edu.baiedu.service;


import com.edu.baiedu.dao.PbComment;
import com.edu.baiedu.dao.PbCommentPraise;
import com.edu.baiedu.dao.PbPostPraise;
import com.edu.baiedu.model.*;

import java.util.List;

public interface CommentService {
	PostDto selectPostByPostUUID(String postUUID);
	UserDto selectUserByUserUUID(String userUUID);
	void updatePostPageviews(String postUUID, int postPageviews);
	RegisterDto selectRegister(String userUUID);
	List<PostPraiseDto> selectPraiseByPostUUID(String postUUID);
	void insertPraise(PbPostPraise pbPostPraiseDto);
	int selectPraiseNum(String postUUID);
	
	void insertComment(PbComment commentDto);
	
	List<CommentDto> selectCommentHotsByPostUUID(String postUUID);
	List<CommentDto> selectAllCommentByPostUUID(String postUUID);
	int selectCommentNumByParameter(String postUUID, String cmUUID, String userUUID);
	void insertPraise(PbCommentPraise CommentPraiseDto);
	
	void deleteComment(String[] cmUUID);
	
	List<CommentDto> selectMyCommentByUserUUID(String userUUID, Integer pageNo, Integer pageSize);
	
	int selectMyCommentNumByUserUUID(String userUUID);
	
	String selectCmTextByCmUUID(String cmUUID);
	
	void updateCmByCmUUID(PbComment commentDto);
}
