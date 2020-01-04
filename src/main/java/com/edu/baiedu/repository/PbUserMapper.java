package com.edu.baiedu.repository;


import com.edu.baiedu.dao.PbUser;
import com.edu.baiedu.dao.PbUserExample;
import com.edu.baiedu.model.UserDto;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface PbUserMapper {

	int countByExample(PbUserExample example);

	int deleteByExample(PbUserExample example);

	int deleteByPrimaryKey(String useruuid);

	int insert(PbUser record);

	int insertSelective(PbUser record);

	List<PbUser> selectByExample(PbUserExample example);

	PbUser selectByPrimaryKey(String useruuid);

	int updateByExampleSelective(@Param("record") PbUser record, @Param("example") PbUserExample example);

	int updateByExample(@Param("record") PbUser record, @Param("example") PbUserExample example);

	int updateByPrimaryKeySelective(PbUser record);

	int updateByPrimaryKey(PbUser record);

	@Insert("INSERT INTO pb_user (userUUID,userName,password,loginTime,admin) VALUES (#{userUUID},#{userName},#{password},#{loginTime},#{admin})")
	void insertUser(UserDto userDto);
	
	@Select("SELECT count(*) FROM pb_user WHERE userName=#{userName}")
	int selectUserNumByUserName(@Param("userName") String userName);
	
	
	@Select("SELECT * FROM pb_user WHERE userName=#{userName} and password=#{password}")
	UserDto selectUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
	
	@Update("UPDATE pb_user SET loginTime=#{loginTime} WHERE userName=#{userName}")
	void updateLoginTimeByUserName(@Param("userName") String userName, @Param("loginTime") Date loginTime);
	
	@Select("SELECT * FROM pb_user WHERE userUUID=#{userUUID}")
	UserDto selectUserByUserUUID(@Param("userUUID") String userUUID);
	
	@Update("UPDATE pb_user SET userName=#{userName} WHERE userUUID=#{userUUID}")
	void updateUserNameByUserUUID(@Param("userName") String userName, @Param("userUUID") String userUUID);
	
	@Update("UPDATE pb_user SET password=#{password} WHERE userName=#{userName}")
	void updatePasswordByUserName(@Param("userName") String userName, @Param("password") String password);

	@Select("<script>"
			+ "SELECT count(*) FROM pb_user  WHERE "
			+ "<if test='userName!=null and userName != \"\" '>"
			+" userName LIKE CONCAT('%',#{userName},'%')  AND "
			+ "</if>"
			+ " userUUID != #{userUUID}"
			+ "</script>")
	int selectUserAllNum(@Param("userName") String userName, @Param("userUUID") String userUUID);
	
	@Delete("<script>"
			+"DELETE FROM pb_user WHERE userUUID in"
			+ "<foreach item='item' index='index' collection='userUUID' open='(' separator=',' close=')'>"
	        +       "#{item}"
	        + "</foreach>"
			+"</script>")
	void deleteUserByUserUUID(@Param("userUUID") String[] userUUID);
	
	@Update("<script>"
			+ "UPDATE pb_user SET userName=#{userName},admin=#{admin}"
			+ "<if test='password!=null and password != \"\" '>"
			+ ",password=#{password}"
			+ "</if>"
			+ " WHERE userUUID=#{userUUID}"
			+ "</script>")
	void updateUserByUserUUID(UserDto userDto);

}
