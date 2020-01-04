package com.gdou.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdou.springboot.basic.controller.BasicController;
import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.service.AudioSetUpService;
import com.gdou.springboot.service.PostService;

import net.sf.json.JSONObject;
@Controller
@RequestMapping(value="/audioSetUpController")
//语音设置控制器
public class AudioSetUpController extends BasicController{
	
	@Autowired
	@Qualifier("postService")
	private PostService postService;
	
	@Autowired
	@Qualifier("audioSetUpService")
	private AudioSetUpService audioSetUpService;
	
	@ModelAttribute
	@RequestMapping(value="/selectAudioSetUp")
	public void selectAudioSetUp(HttpServletResponse response,HttpServletRequest request){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			String userUUID=(String)session.getAttribute("id");
			AudioDto auidoDto=postService.selectAudioByUserUUID(userUUID);
			json.put("auidoDto", auidoDto);
		}
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/updateAudioSetUp")
	public void updateAudioSetUp(HttpServletResponse response,HttpServletRequest request,String auSetUUID,int auSetVoiPer,int auSetSpd,int auSetPit,int auSetVol){
		
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			AudioDto audioDto=new AudioDto();
			audioDto.setAuSetPit(auSetPit);
			audioDto.setAuSetSpd(auSetSpd);
			audioDto.setAuSetUUID(auSetUUID);
			audioDto.setAuSetVoiPer(auSetVoiPer);
			audioDto.setAuSetVol(auSetVol);
			audioSetUpService.updateAudioByAuSetUUID(audioDto);
		}
		this.writeJson(json.toString(), response);
	}
}
