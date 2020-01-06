package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbPost;
import com.edu.baiedu.dao.PbPostExample;
import com.edu.baiedu.model.PostDto;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface PbPostMapper {

	int countByExample(PbPostExample example);

	int deleteByExample(PbPostExample example);

	int deleteByPrimaryKey(String postuuid);

	int insert(PbPost record);

	int insertSelective(PbPost record);

	List<PbPost> selectByExampleWithBLOBs(PbPostExample example);

	List<PbPost> selectByExample(PbPostExample example);

	PbPost selectByPrimaryKey(String postuuid);

	int updateByExampleSelective(@Param("record") PbPost record, @Param("example") PbPostExample example);

	int updateByExampleWithBLOBs(@Param("record") PbPost record, @Param("example") PbPostExample example);

	int updateByExample(@Param("record") PbPost record, @Param("example") PbPostExample example);

	int updateByPrimaryKeySelective(PbPost record);

	int updateByPrimaryKeyWithBLOBs(PbPost record);

	int updateByPrimaryKey(PbPost record);

/*	//添加文章
	@Insert("INSERT INTO pb_post (postUUID,userUUID,postTitle,postText,postPageviews,postAudio,postTime) VALUES (#{postUUID},#{userUUID},#{postTitle},#{postText},#{postPageviews},#{postAudio},#{postTime})")
	void insertPost(PostDto postDto);*/
	//查询文章个数
	int selectPostAllNum(@Param("postTitle") String postTitle, @Param("userUUID") String userUUID);
	
	//查询文章列表
	List<PostDto> selectPostList(@Param("postTitle") String postTitle, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("userUUID") String userUUID);

	//删除文章
	void deletePost(@Param("postUUID") String[] postUUID);

	void deletePostByUserUUID(@Param("userUUID") String[] userUUID);

	PostDto selectPostByPostUUID(@Param("postUUID") String postUUID);

	void updatePostPageviews(@Param("postUUID") String postUUID, @Param("postPageviews") int postPageviews);
}
