package com.edu.baiedu.service;


import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.model.AudioDto;

public interface AudioSetUpService {
	void updateAudioByAuSetUUID(PbAudio audioDto);
}
