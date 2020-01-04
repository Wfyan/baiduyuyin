package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbApp;
import com.edu.baiedu.dao.PbAppExample;
import com.edu.baiedu.model.AppDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PbAppMapper {
	int countByExample(PbAppExample example);

	int deleteByExample(PbAppExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(PbApp record);

	int insertSelective(PbApp record);

	List<PbApp> selectByExample(PbAppExample example);

	PbApp selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") PbApp record, @Param("example") PbAppExample example);

	int updateByExample(@Param("record") PbApp record, @Param("example") PbAppExample example);

	int updateByPrimaryKeySelective(PbApp record);

	int updateByPrimaryKey(PbApp record);

	/**
	 * 查询百度语音合成API所需信息
	 * @return
	 */
	AppDto selectApp();

}
