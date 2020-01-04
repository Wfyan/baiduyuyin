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
	
	@Select("SELECT * FROM pb_register WHERE userUUID=#{userUUID}")
	RegisterDto selectRegister(@Param("userUUID") String userUUID);
    
	@Select("SELECT a.regUUID,a.regAge,a.regEmial,a.regSex,a.regUUID,a.userUUID,b.userName FROM pb_register a,pb_user b WHERE a.userUUID=b.userUUID AND a.userUUID=#{userUUID}")
	RegisterDto selectRegisterAndUserName(@Param("userUUID") String userUUID);

	void upDateRegisterByRegUUID(RegisterDto registerDto);
	
	@Select("SELECT regPhoto FROM pb_register WHERE userUUID=#{userUUID}")
	String selectRegPhotoByUserUUID(@Param("userUUID") String userUUID);
	
/*	@Update("UPDATE pb_register SET regPhoto=#{regPhoto} WHERE userUUID=#{userUUID} ")
	void upDateRegPhotoByRegUUID(RegisterDto registerDto);*/
	
	@Select("<script>"
			+ "SELECT b.regUUID,b.userUUID,b.regSex,b.regAge,b.regEmial,b.regTime,a.userName,a.loginTime,a.admin FROM pb_register b,pb_user a WHERE a.userUUID=b.userUUID"
			+ "<if test='userName!=null and userName != \"\" '>"
			+" AND a.userName LIKE CONCAT('%',#{userName},'%')"
			+ "</if>"
			+" AND a.userUUID != #{userUUID}"
			+" ORDER BY b.regTime DESC"
			+" LIMIT #{startNo},#{pageSize}"
			+ "</script>")
	List<RegisterDto> selectRegList(@Param("userName") String userName, @Param("startNo") Integer pageNo, @Param("pageSize") Integer pageSize, @Param("userUUID") String userUUID);

	void deleteRegByUserUUID(@Param("userUUID") String[] userUUID);
	
	
/*	@Update("<script>"
			+ "UPDATE pb_register SET regSex=#{regSex},regAge=#{regAge},regEmial=#{regEmial}"
			+ " WHERE userUUID=#{userUUID}"
			+ "</script>")
	void updateRegByUserUUID(RegisterDto registerDto);*/
}
