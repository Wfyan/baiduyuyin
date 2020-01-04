package com.edu.baiedu.controller;

import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.service.LoginService;
import com.edu.baiedu.service.PerSetUpService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value="/perSetUpController")
//个人设置
public class PerSetUpController extends BasicController{
	
	@Autowired
	@Qualifier("perSetUpService")
	private PerSetUpService perSetUpService;
	
	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;
	@ModelAttribute
	@RequestMapping(value="/selectPerSetUp")
	public void selectPerSetUp(HttpServletResponse response, HttpServletRequest request){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			String userUUID=(String)session.getAttribute("id");
			RegisterDto  registerDto=perSetUpService.selectRegisterAndUserName(userUUID);
			
			json.put("registerDto", registerDto);
		}
		this.writeJson(json.toString(), response);
	}
	
	@ModelAttribute
	@RequestMapping(value="/updatePerSetUp")
	public void updatePerSetUp(HttpServletResponse response, HttpServletRequest request, String regUUID, String userName, String regSex, int regAge, String regEmial, String oldName){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		json.put("error", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			if((!oldName.equals(userName)) && loginService.getUserNumByUserName(userName)!=0){
				json.put("error", "用户名已存在");
			}else{
				String userUUID=(String)session.getAttribute("id");
				RegisterDto registerDto=new RegisterDto();
				registerDto.setRegAge(regAge);
				registerDto.setRegEmial(regEmial);
				registerDto.setRegSex(regSex);
				registerDto.setUserName(userName);
				registerDto.setUserUUID(userUUID);
				registerDto.setRegUUID(regUUID);
				perSetUpService.upDateUser(registerDto);
				//audioSetUpService.updateAudioByAuSetUUID(audioDto);
				session.invalidate();
			}
			
			
		}
		this.writeJson(json.toString(), response);
	}
}
