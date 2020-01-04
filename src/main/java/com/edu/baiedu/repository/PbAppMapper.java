package com.edu.baiedu.repository;

import com.edu.baiedu.model.AppDto;
import org.apache.ibatis.annotations.Select;

public interface PbAppMapper {
	@Select("select id,appID,apiKey,secretKey from pb_app")
	AppDto selectApp();
}
