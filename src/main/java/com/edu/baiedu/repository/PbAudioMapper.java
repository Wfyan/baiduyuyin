package com.edu.baiedu.repository;

import com.edu.baiedu.model.AudioDto;
import org.apache.ibatis.annotations.*;

public interface PbAudioMapper {
	@Insert("INSERT INTO pb_audio (auSetUUID,userUUID,auSetSpd,auSetPit,auSetVol,auSetVoiPer) VALUES (#{auSetUUID},#{userUUID},#{auSetSpd},#{auSetPit},#{auSetVol},#{auSetVoiPer})")
	void insertAudio(AudioDto audioDto);
	
	@Select("SELECT auSetUUID,userUUID,auSetSpd,auSetPit,auSetVol,auSetVoiPer FROM pb_audio  WHERE userUUID=#{userUUID}  ")
	AudioDto selectAudioByUserUUID(@Param("userUUID") String userUUID);
	
	@Update("UPDATE pb_audio SET auSetSpd = #{auSetSpd},auSetPit=#{auSetPit},auSetVol=#{auSetVol},auSetVoiPer=#{auSetVoiPer} WHERE auSetUUID = #{auSetUUID}")
	void updateAudioByAuSetUUID(AudioDto audioDto);
	
	@Delete("<script>"
			+"DELETE FROM pb_audio WHERE userUUID in"
			+ "<foreach item='item' index='index' collection='userUUID' open='(' separator=',' close=')'>"
	        +       "#{item}"
	        + "</foreach>"
			+"</script>")
	void deleteAudioByUserUUID(@Param("userUUID") String[] userUUID);
}
