package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbRegister;
import com.edu.baiedu.dao.PbRegisterExample;
import com.edu.baiedu.model.RegisterDto;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface PbRegisterMapper {

	int countByExample(PbRegisterExample example);

	int deleteByExample(PbRegisterExample example);

	int deleteByPrimaryKey(String reguuid);

	int insert(PbRegister record);

	int insertSelective(PbRegister record);

	List<PbRegister> selectByExample(PbRegisterExample example);

	PbRegister selectByPrimaryKey(String reguuid);

	int updateByExampleSelective(@Param("record") PbRegister record, @Param("example") PbRegisterExample example);

	int updateByExample(@Param("record") PbRegister record, @Param("example") PbRegisterExample example);

	int updateByPrimaryKeySelective(PbRegister record);

	int updateByuserUUIDSelective(RegisterDto record);

	int updateByPrimaryKey(PbRegister record);

/*	@Insert("INSERT INTO pb_register (regUUID,userUUID,regSex,regAge,regEmial,regPhoto,regTime) VALUES (#{regUUID},#{userUUID},#{regSex},#{regAge},#{regEmial},#{regPhoto},#{regTime})")
	void insertRegister(RegisterDto registerDto);*/
	
	RegisterDto selectRegister(@Param("userUUID") String userUUID);
    
	RegisterDto selectRegisterAndUserName(@Param("userUUID") String userUUID);

	void upDateRegisterByRegUUID(RegisterDto registerDto);
	
	String selectRegPhotoByUserUUID(@Param("userUUID") String userUUID);
	
/*	@Update("UPDATE pb_register SET regPhoto=#{regPhoto} WHERE userUUID=#{userUUID} ")
	void upDateRegPhotoByRegUUID(RegisterDto registerDto);*/

	List<RegisterDto> selectRegList(@Param("userName") String userName, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("userUUID") String userUUID);

	void deleteRegByUserUUID(@Param("userUUID") String[] userUUID);
	
	
/*	@Update("<script>"
			+ "UPDATE pb_register SET regSex=#{regSex},regAge=#{regAge},regEmial=#{regEmial}"
			+ " WHERE userUUID=#{userUUID}"
			+ "</script>")
	void updateRegByUserUUID(RegisterDto registerDto);*/
}
