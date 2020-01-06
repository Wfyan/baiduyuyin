package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbPostPraise;
import com.edu.baiedu.dao.PbPostPraiseExample;
import com.edu.baiedu.model.PostPraiseDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PbPostPraiseMapper {

	int countByExample(PbPostPraiseExample example);

	int deleteByExample(PbPostPraiseExample example);

	int deleteByPrimaryKey(String popruuid);

	int insert(PbPostPraise record);

	int insertSelective(PbPostPraise record);

	List<PbPostPraise> selectByExample(PbPostPraiseExample example);

	PbPostPraise selectByPrimaryKey(String popruuid);

	int updateByExampleSelective(@Param("record") PbPostPraise record, @Param("example") PbPostPraiseExample example);

	int updateByExample(@Param("record") PbPostPraise record, @Param("example") PbPostPraiseExample example);

	int updateByPrimaryKeySelective(PbPostPraise record);

	int updateByPrimaryKey(PbPostPraise record);

	void deletePostPraise(@Param("postUUID") String[] postUUID);

	void deletePostPraiseByUserUUID(@Param("userUUID") String[] userUUID);

	List<PostPraiseDto> selectPraiseByPostUUID(@Param("postUUID") String postUUID);
	
/*	@Insert("INSERT INTO pb_post_praise (poPrUUID,postUUID,userUUID) VALUES (#{poPrUUID},#{postUUID},#{userUUID})")
	void insertPraise(PostPraiseDto pbPostPraiseDto);*/

	int selectPraiseNum(@Param("postUUID") String postUUID);
}
