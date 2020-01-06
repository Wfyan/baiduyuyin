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
	
	List<CommentDto> selectCommentHotsByPostUUID(@Param("postUUID") String postUUID);

	List<CommentDto> selectAllCommentByPostUUID(@Param("postUUID") String postUUID);
	
	List<CommentDto> selectMyCommentByUserUUID(@Param("userUUID") String userUUID, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize);
	
	int selectMyCommentNumByUserUUID(@Param("userUUID") String userUUID);
	
	String selectCmTextByCmUUID(@Param("cmUUID") String cmUUID);
	
/*	@Update("UPDATE pb_comment SET cmText = #{cmText},cmTime=#{cmTime} WHERE cmUUID = #{cmUUID}")
	void updateCmByCmUUID(CommentDto commentDto);*/
}
