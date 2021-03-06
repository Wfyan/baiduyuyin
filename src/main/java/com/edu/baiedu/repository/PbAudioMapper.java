package com.edu.baiedu.repository;

import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.dao.PbAudioExample;
import com.edu.baiedu.model.AudioDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PbAudioMapper {

	int countByExample(PbAudioExample example);

	int deleteByExample(PbAudioExample example);

	int deleteByPrimaryKey(String ausetuuid);

	int insert(PbAudio record);

	int insertSelective(PbAudio record);

	List<PbAudio> selectByExample(PbAudioExample example);

	PbAudio selectByPrimaryKey(String ausetuuid);

	int updateByExampleSelective(@Param("record") PbAudio record, @Param("example") PbAudioExample example);

	int updateByExample(@Param("record") PbAudio record, @Param("example") PbAudioExample example);

	int updateByPrimaryKeySelective(PbAudio record);

	int updateByPrimaryKey(PbAudio record);

	AudioDto selectAudioByUserUUID(@Param("userUUID") String userUUID);
	
/*	@Update("UPDATE pb_audio SET auSetSpd = #{auSetSpd},auSetPit=#{auSetPit},auSetVol=#{auSetVol},auSetVoiPer=#{auSetVoiPer} WHERE auSetUUID = #{auSetUUID}")
	void updateAudioByAuSetUUID(AudioDto audioDto);*/

	void deleteAudioByUserUUID(@Param("userUUID") String[] userUUID);
}
