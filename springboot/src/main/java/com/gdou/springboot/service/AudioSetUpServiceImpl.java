package com.gdou.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.mapper.PbAudioMapper;
@Service("audioSetUpService")
public class AudioSetUpServiceImpl implements AudioSetUpService {
	@Autowired
	private PbAudioMapper pbAudioMapper;
	@Override
	public void updateAudioByAuSetUUID(AudioDto audioDto) {
		// TODO Auto-generated method stub
		pbAudioMapper.updateAudioByAuSetUUID(audioDto);
	}

	

}
