package com.gdou.springboot.service;

import java.util.List;


import com.gdou.springboot.dto.RegisterDto;
import com.gdou.springboot.dto.UserDto;

public interface UserManageService {
	int getUserAllNum(String userName,String userUUID);
	List<RegisterDto> selectRegList(String userName,Integer pageNo, Integer pageSize,String userUUID);
	void deleteUser(String[] userUUID);
	void updateUser(UserDto userDto,RegisterDto registerDto);
}
