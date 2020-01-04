package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbComment;
import com.edu.baiedu.dao.PbCommentExample;
import com.edu.baiedu.model.CommentDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PbCommentMapper {

	int countByExample(PbCommentExample example);

	int deleteByExample(PbCommentExample example);

	int deleteByPrimaryKey(String cmuuid);

	int insert(PbComment record);

	int insertSelective(PbComment record);

	List<PbComment> selectByExampleWithBLOBs(PbCommentExample example);

	List<PbComment> selectByExample(PbCommentExample example);

	PbComment selectByPrimaryKey(String cmuuid);

	int updateByExampleSelective(@Param("record") PbComment record, @Param("example") PbCommentExample example);

	int updateByExampleWithBLOBs(@Param("record") PbComment record, @Param("example") PbCommentExample example);

	int updateByExample(@Param("record") PbComment record, @Param("example") PbCommentExample example);

	int updateByPrimaryKeySelective(PbComment record);

	int updateByPrimaryKeyWithBLOBs(PbComment record);

	int updateByPrimaryKey(PbComment record);

	void deleteCommentByPostUUID(@Param("postUUID") String[] postUUID);

	void deleteCommentByCmUUID(@Param("cmUUID") String[] cmUUID);

	void deleteCommentByUserUUID(@Param("userUUID") String[] userUUID);
	
/*	@Insert("INSERT INTO pb_comment (cmUUID,postUUID,userUUID,cmText,cmAudio,cmTime) VALUES (#{cmUUID},#{postUUID},#{userUUID},#{cmText},#{cmAudio},#{cmTime})")
	void insertComment(CommentDto commentDto);*/
	
	@Select("SELECT a.cmUUID,a.postUUID,a.userUUID,a.cmText,a.cmAudio,a.cmTime,COUNT(b.cmPrUUID) cmPrNum,c.userName,d.regTime,d.regPhoto FROM post_bar.pb_comment a,post_bar.pb_comment_praise b,post_bar.pb_user c,post_bar.pb_register d WHERE a.postUUID=#{postUUID} AND c.userUUID=a.userUUID AND d.userUUID=a.userUUID AND a.cmUUID=b.cmUUID GROUP BY a.cmUUID,d.regTime,d.regPhoto ORDER BY cmPrNum DESC LIMIT 0,5")
	List<CommentDto> selectCommentHotsByPostUUID(@Param("postUUID") String postUUID);

	@Select("SELECT a.cmUUID,a.postUUID,a.userUUID,a.cmText,a.cmAudio,a.cmTime,c.userName,d.regTime,d.regPhoto,IFNULL(t.cmPrNum,0) cmPrNum FROM (post_bar.pb_comment a,post_bar.pb_user c,post_bar.pb_register d) LEFT JOIN(SELECT COUNT(*) cmPrNum,b.cmUUID FROM post_bar.pb_comment_praise b GROUP BY b.cmUUID ) t ON t.cmUUID=a.cmUUID  WHERE a.postUUID=#{postUUID} AND c.userUUID=a.userUUID AND d.userUUID=a.userUUID  GROUP BY a.cmUUID,d.regTime,d.regPhoto,t.cmPrNum ORDER BY a.cmTime DESC")
	List<CommentDto> selectAllCommentByPostUUID(@Param("postUUID") String postUUID);
	
	@Select("SELECT a.cmUUID,a.postUUID,a.userUUID,a.cmText,a.cmAudio,a.cmTime,b.postTitle FROM pb_comment a,pb_post b WHERE a.postUUID=b.postUUID AND a.userUUID=#{userUUID} ORDER BY a.cmTime DESC  LIMIT #{startNo},#{pageSize}")
	List<CommentDto> selectMyCommentByUserUUID(@Param("userUUID") String userUUID, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize);
	
	@Select("SELECT count(*) FROM pb_comment WHERE userUUID=#{userUUID} ")
	int selectMyCommentNumByUserUUID(@Param("userUUID") String userUUID);
	
	@Select("SELECT cmText FROM pb_comment WHERE cmUUID=#{cmUUID}")
	String selectCmTextByCmUUID(@Param("cmUUID") String cmUUID);
	
/*	@Update("UPDATE pb_comment SET cmText = #{cmText},cmTime=#{cmTime} WHERE cmUUID = #{cmUUID}")
	void updateCmByCmUUID(CommentDto commentDto);*/
}
