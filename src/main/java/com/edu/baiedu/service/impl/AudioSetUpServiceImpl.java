package com.edu.baiedu.service.impl;


import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.repository.PbAudioMapper;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.service.AudioSetUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("audioSetUpService")
public class AudioSetUpServiceImpl implements AudioSetUpService {
	@Autowired
	private PbAudioMapper pbAudioMapper;
	@Override
	public void updateAudioByAuSetUUID(PbAudio audioDto) {
		// TODO Auto-generated method stub
		pbAudioMapper.updateByPrimaryKeySelective(audioDto);
	}

	

}
