package com.gdou.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdou.springboot.basic.controller.BasicController;
import com.gdou.springboot.dto.PostDto;
import com.gdou.springboot.service.PostService;

import net.sf.json.JSONObject;
@Controller
@RequestMapping(value="/myPostController")
public class MyPostController extends BasicController{
	@Autowired
	@Qualifier("postService")
	private PostService postService;
	
	
	@ModelAttribute
	@RequestMapping(value="/getMyPostList")
	public void getMyPostList(HttpServletResponse response,HttpServletRequest request,String postTitle,int pageIndex,int everyPageDataCount){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			String userUUID=(String)session.getAttribute("id");
			json.put("postAllNum", 0);
			json.put("allPage", 0);
			json.put("pageIndex", 0);
			json.put("postList", "");
			
			
			int postAllNum=postService.getPostAllNum(postTitle,userUUID);
			json.put("postAllNum", postAllNum);
			
			if (postAllNum > 0) {
//				// 总页数变量
				int allPage = 1;
				// 计算总页数
				if ((postAllNum % everyPageDataCount) == 0) {
					allPage = postAllNum / everyPageDataCount;
				} else {
					allPage = postAllNum / everyPageDataCount + 1;
				}
				// 防止页码越界
				if (pageIndex < 0) {
					pageIndex = 0;
				} else if (pageIndex >= allPage) {
					pageIndex = allPage - 1;
				}
				
				
				json.put("allPage", allPage);
				json.put("pageIndex", pageIndex);
		
				List<PostDto> list=postService.selectPostList(postTitle, pageIndex*everyPageDataCount , everyPageDataCount,userUUID);
				
				json.put("postList", list);
			}
		
		}
		
//		JsonConfig jsonConfig = new JsonConfig();
//		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
//		JSONObject jsonObject = JSONObject.fromObject(json,jsonConfig);
		
		this.writeJson(json.toString(), response);
	}
}
