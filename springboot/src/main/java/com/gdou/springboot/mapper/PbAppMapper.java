package com.gdou.springboot.mapper;

import org.apache.ibatis.annotations.Select;

import com.gdou.springboot.dto.AppDto;

public interface PbAppMapper {
	@Select("select id,appID,apiKey,secretKey from pb_app")
	AppDto selectApp();
}
