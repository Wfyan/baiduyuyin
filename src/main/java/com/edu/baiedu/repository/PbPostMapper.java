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

	//添加文章
	@Insert("INSERT INTO pb_post (postUUID,userUUID,postTitle,postText,postPageviews,postAudio,postTime) VALUES (#{postUUID},#{userUUID},#{postTitle},#{postText},#{postPageviews},#{postAudio},#{postTime})")
	void insertPost(PostDto postDto);
	//查询文章个数
	@Select("<script>"
			+ "SELECT count(*) FROM pb_post  "
			+ "<if test='postTitle!=null and postTitle != \"\" '>"
			+" WHERE postTitle LIKE CONCAT('%',#{postTitle},'%') "
			+ "</if>"
			+ "<if test='(postTitle!=null and postTitle != \"\") and (userUUID!=null and userUUID != \"\") '>"
			+" AND userUUID=#{userUUID} "
			+ "</if>"
			+ "<if test='(postTitle==null or postTitle == \"\") and (userUUID!=null and userUUID != \"\") '>"
			+" WHERE userUUID=#{userUUID} "
			+ "</if>"
			+ "</script>")
	int selectPostAllNum(@Param("postTitle") String postTitle, @Param("userUUID") String userUUID);
	
	//查询文章列表
	@Select("<script>"
			+ "SELECT a.postUUID,c.userName,IFNULL(f.cmTime,'') as cmTime,IFNULL(f.commentNum,0) as commentNum,a.userUUID,a.postTitle,a.postPageviews,a.postTime FROM (pb_post as a LEFT JOIN (SELECT b.userName,b.userUUID FROM pb_user as b ) as c ON a.userUUID=c.userUUID)  LEFT JOIN (SELECT COUNT(*) AS commentNum,e.postUUID,max(e.cmTime) AS cmTime FROM post_bar.pb_comment as e GROUP BY e.postUUID ) AS f ON f.postUUID=a.postUUID  "
			+ "<if test='postTitle!=null and postTitle != \"\" '>"
			+" WHERE a.postTitle LIKE CONCAT('%',#{postTitle},'%')"
			+ "</if>"
			+ "<if test='(postTitle==null or postTitle == \"\") and (userUUID!=null and userUUID != \"\") '>"
			+" WHERE a.userUUID=#{userUUID}"
			+ "</if>"
			+ "<if test='(postTitle!=null and postTitle != \"\") and (userUUID!=null and userUUID != \"\") '>"
			+" AND a.userUUID=#{userUUID}"
			+ "</if>"
			
			+" ORDER BY f.cmTime DESC"
			+" LIMIT #{startNo},#{pageSize}"
			+ "</script>")
	List<PostDto> selectPostList(@Param("postTitle") String postTitle, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("userUUID") String userUUID);
	//删除文章
	@Delete("<script>"
			+"DELETE FROM pb_post WHERE postUUID in"
			+ "<foreach item='item' index='index' collection='postUUID' open='(' separator=',' close=')'>"
	        +       "#{item}"
	        + "</foreach>"
			+"</script>")
	void deletePost(@Param("postUUID") String[] postUUID);
	
	@Delete("<script>"
			+"DELETE FROM pb_post WHERE userUUID in"
			+ "<foreach item='item' index='index' collection='userUUID' open='(' separator=',' close=')'>"
	        +       "#{item}"
	        + "</foreach>"
			+"</script>")
	void deletePostByUserUUID(@Param("userUUID") String[] userUUID);
	
	
	@Select("SELECT * FROM pb_post as a WHERE postUUID=#{postUUID}  ")
	PostDto selectPostByPostUUID(@Param("postUUID") String postUUID);
	
	@Update("UPDATE pb_post SET postPageviews=#{postPageviews} WHERE postUUID=#{postUUID}")
	void updatePostPageviews(@Param("postUUID") String postUUID, @Param("postPageviews") int postPageviews);
}
