package com.edu.baiedu.controller;

import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.dao.PbUser;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.model.UserDto;
import com.edu.baiedu.service.LoginService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;


@Controller
@RequestMapping(value="/loginController")
public class LoginController extends BasicController{
	
	@Autowired
	@Qualifier("loginService")
	private LoginService loginService;
	
	@ModelAttribute
	@RequestMapping(value="/login")
	public void login(HttpServletResponse response, HttpServletRequest request, String userName, String password){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		String md5Password=this.md5(password);
		UserDto userDto=loginService.getUserByUserNameAndPassword(userName, md5Password);
		if(userDto==null){
			json.put("message", "用户名或密码错误");
		}else{
			session.setAttribute("username", userDto.getUserName());
			session.setAttribute("admin", userDto.getAdmin());
			session.setAttribute("id", userDto.getUserUUID());
			Date datetime=this.getDate();
			if(userDto.getLoginTime()==null){
				session.setAttribute("dateTiem", datetime);
			}else{
				session.setAttribute("dateTime", userDto.getLoginTime());
			}
			
			loginService.changeLoginTimeByUserName(userName, datetime);
			json.put("admin", userDto.getAdmin());
		}
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/getAdmin")
	public void getAdmin(HttpServletResponse response, HttpServletRequest request){
		HttpSession session=request.getSession();
		
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			json.put("admin", (String)session.getAttribute("admin"));
		}
		
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/addRegister")
	public void addRegister(HttpServletResponse response, HttpServletRequest request, String userName, String password, String regSex, int regAge, String regEmial){
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(loginService.getUserNumByUserName(userName)!=0){
			json.put("message", "用户名已存在");
		}else{
			
			String userUUID=this.getUUID();
			String md5Password=this.md5(password);
			String regTime=this.getStringDate(new Date());
			String regUUID=this.getUUID();
			String admin="0";
			String photoAir="/postbar/headPhoto/default/default.jpg";
			String auSetUUID=this.getUUID();
			int auSetPit=5;
			int auSetSpd=5;
			int auSetVol=5;
			int auSetVoiPer=0;
			RegisterDto registerDto=new RegisterDto();
			registerDto.setRegAge(regAge);
			registerDto.setRegEmial(regEmial);
			registerDto.setRegSex(regSex);
			registerDto.setRegTime(regTime);
			registerDto.setRegUUID(regUUID);
			registerDto.setUserUUID(userUUID);
			registerDto.setRegPhoto(photoAir);
			PbUser userDto=new PbUser();
			userDto.setPassword(md5Password);
			userDto.setUsername(userName);
			userDto.setUseruuid(userUUID);
			userDto.setAdmin(admin);
			
			PbAudio audioDto=new PbAudio();
			audioDto.setAusetpit(auSetPit);
			audioDto.setAusetspd(auSetSpd);
			audioDto.setAusetuuid(auSetUUID);
			audioDto.setAusetvoiper(auSetVoiPer);
			audioDto.setAusetvol(auSetVol);
			audioDto.setUseruuid(userUUID);
			loginService.addUserRegister(registerDto, userDto,audioDto);
		}
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/loginOut")
	public void loginOut(HttpServletResponse response, HttpServletRequest request){
		JSONObject json=new JSONObject();
		HttpSession session=request.getSession();
		session.invalidate();
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/editPassword")
	public void editPassword(HttpServletResponse response, HttpServletRequest request, String oldPassword, String newPassword){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		json.put("error", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			String userName=(String)session.getAttribute("username");
			oldPassword=this.md5(oldPassword);
			newPassword=this.md5(newPassword);
			UserDto userDto=loginService.getUserByUserNameAndPassword(userName, oldPassword);
			if(userDto==null){
				json.put("error", "当前密码输入错误");
			}else{
				loginService.updatePasswordByUserName(userName, newPassword);
			}
		}
		this.writeJson(json.toString(), response);
	}
}
