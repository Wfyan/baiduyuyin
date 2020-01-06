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

	int selectUserNumByUserName(@Param("userName") String userName);

	UserDto selectUserByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

	void updateLoginTimeByUserName(@Param("userName") String userName, @Param("loginTime") Date loginTime);

	UserDto selectUserByUserUUID(@Param("userUUID") String userUUID);

	void updateUserNameByUserUUID(@Param("userName") String userName, @Param("userUUID") String userUUID);

	void updatePasswordByUserName(@Param("userName") String userName, @Param("password") String password);

	int selectUserAllNum(@Param("userName") String userName, @Param("userUUID") String userUUID);

	void deleteUserByUserUUID(@Param("userUUID") String[] userUUID);
	
/*	@Update("<script>"
			+ "UPDATE pb_user SET userName=#{userName},admin=#{admin}"
			+ "<if test='password!=null and password != \"\" '>"
			+ ",password=#{password}"
			+ "</if>"
			+ " WHERE userUUID=#{userUUID}"
			+ "</script>")
	void updateUserByUserUUID(UserDto userDto);*/

}
