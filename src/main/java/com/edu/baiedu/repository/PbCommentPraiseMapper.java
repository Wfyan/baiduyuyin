package com.edu.baiedu.repository;


import com.edu.baiedu.dao.PbCommentPraise;
import com.edu.baiedu.dao.PbCommentPraiseExample;
import com.edu.baiedu.model.CommentPraiseDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface PbCommentPraiseMapper {

	int countByExample(PbCommentPraiseExample example);

	int deleteByExample(PbCommentPraiseExample example);

	int deleteByPrimaryKey(String cmpruuid);

	int insert(PbCommentPraise record);

	int insertSelective(PbCommentPraise record);

	List<PbCommentPraise> selectByExample(PbCommentPraiseExample example);

	PbCommentPraise selectByPrimaryKey(String cmpruuid);

	int updateByExampleSelective(@Param("record") PbCommentPraise record, @Param("example") PbCommentPraiseExample example);

	int updateByExample(@Param("record") PbCommentPraise record, @Param("example") PbCommentPraiseExample example);

	int updateByPrimaryKeySelective(PbCommentPraise record);

	int updateByPrimaryKey(PbCommentPraise record);

	void deleteCommentPraiseByPostUUID(@Param("postUUID") String[] postUUID);

	void deleteCommentPraiseByUserUUID(@Param("userUUID") String[] userUUID);

	void deleteCommentPraiseByCmUUID(@Param("cmUUID") String[] cmUUID);
	
	@Select("<script>SELECT COUNT(*) FROM pb_comment_praise WHERE"
			+ "<if test='userUUID!=null and userUUID != \"\" '>"
			+ " userUUID=#{userUUID} AND "
			+ "</if>"
			+ " cmUUID=#{cmUUID} AND postUUID=#{postUUID}</script>")
	int selectCommentNumByParameter(@Param("postUUID") String postUUID, @Param("cmUUID") String cmUUID, @Param("userUUID") String userUUID);

/*	@Insert("INSERT INTO pb_comment_praise (cmPrUUID,postUUID,userUUID,cmUUID) VALUES (#{cmPrUUID},#{postUUID},#{userUUID},#{cmUUID})")
	void insertPraise(CommentPraiseDto CommentPraiseDto);*/

}
