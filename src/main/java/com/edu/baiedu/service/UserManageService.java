package com.edu.baiedu.service;

import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.model.UserDto;

import java.util.List;

public interface UserManageService {
	int getUserAllNum(String userName, String userUUID);
	List<RegisterDto> selectRegList(String userName, Integer pageNo, Integer pageSize, String userUUID);
	void deleteUser(String[] userUUID);
	void updateUser(UserDto userDto, RegisterDto registerDto);
}
