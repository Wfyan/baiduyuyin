package com.gdou.springboot.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.aip.speech.TtsResponse;
import com.gdou.springboot.basic.controller.BasicController;
import com.gdou.springboot.dto.AppDto;
import com.gdou.springboot.dto.AudioDto;
import com.gdou.springboot.dto.CommentDto;
import com.gdou.springboot.service.CommentService;
import com.gdou.springboot.service.PostService;
import com.gdou.springboot.util.AudioSynthesis;

import net.sf.json.JSONObject;
@Controller
@RequestMapping(value="/myCommentController")
//我的评论控制器
public class MyCommentController extends BasicController{
	
	@Autowired
	@Qualifier("commentService")
	private CommentService commentService;
	@Autowired
	@Qualifier("postService")
	private PostService postService;
	@ModelAttribute
	@RequestMapping(value="/selectMyCommentByUserUUID")
	public void selectMyCommentByUserUUID(HttpServletResponse response,HttpServletRequest request,int pageIndex,int everyPageDataCount){
		HttpSession session=request.getSession();
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			json.put("postAllNum", 0);
			json.put("allPage", 0);
			json.put("pageIndex", 0);
			json.put("myCommentlist", "");
			
			String userUUID=(String)session.getAttribute("id");
			
			int postAllNum=commentService.selectMyCommentNumByUserUUID(userUUID);
			json.put("postAllNum", postAllNum);
			if (postAllNum > 0){
				// 总页数变量
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
				
				List<CommentDto> myCommentlist=commentService.selectMyCommentByUserUUID(userUUID, pageIndex*everyPageDataCount , everyPageDataCount);
				json.put("myCommentlist", myCommentlist);
			}
			
		}
		this.writeJson(json.toString(), response);
	}
	
	@ModelAttribute
	@RequestMapping(value="/getCommentByCmUUID")
	public void getCommentByCmUUID(HttpServletResponse response,HttpServletRequest request,String cmUUID){
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			String cmText=commentService.selectCmTextByCmUUID(cmUUID);
			json.put("cmText",cmText);
		}
		this.writeJson(json.toString(), response);
	}
	@ModelAttribute
	@RequestMapping(value="/editCom")
	public void editCom(HttpServletResponse response,HttpServletRequest request,String cmUUID,String cmText){
		JSONObject json=new JSONObject();
		json.put("message", "");
		if(sessionTimeout(request)){
			json.put("message", "页面过期，请重新登录");
		}else{
			HttpSession session=request.getSession();
			CommentDto commentDto=new CommentDto();
			commentDto.setCmUUID(cmUUID);
			commentDto.setCmText(cmText);
			commentDto.setCmTime(this.getStringDate(new Date()));
			commentService.updateCmByCmUUID(commentDto);
			
			String userUUID=(String)session.getAttribute("id");
			String text=this.removeHtmlTag(cmText);
			if(text.length()>1024){
				text=text.substring(0,1024);
			}
			AudioDto audioDto =postService.selectAudioByUserUUID(userUUID);
			int spd=audioDto.getAuSetSpd();
			int pit=audioDto.getAuSetPit();
			int vol=audioDto.getAuSetVol();
			int per=audioDto.getAuSetVoiPer();
			
			AppDto appDto=postService.selectApp();
			String APP_ID=appDto.getAppID();
			String API_KEY=appDto.getApiKey();
			String SECRET_KEY=appDto.getSecretKey();
			AudioSynthesis audioSynthesis=AudioSynthesis.getInstance(APP_ID, API_KEY, SECRET_KEY);
			TtsResponse res=audioSynthesis.synthesis(text, spd, pit, vol, per);
			byte[] data = res.getData();
			
			String path=request.getServletContext().getRealPath("/")+"audio\\" ;
	       
	        
	        File uploadDir = new File(path);
	        if (!uploadDir.exists() && !uploadDir.isDirectory()) {// 检查目录
				uploadDir.mkdirs();
			}

	        path+=cmUUID+".mp3";
	        
			OutputStream out = null;
	        InputStream is = null;
			try {
				out = new FileOutputStream(path);
				is = new ByteArrayInputStream(data);
				byte[] buff = new byte[1024];
		        int len = 0;
		        while((len=is.read(buff))!=-1){
		            out.write(buff, 0, len);
		        }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(is!=null){
					try {
						is.close();
				       
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(out!=null){
					try {
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				 
			}
			
			
		}
		this.writeJson(json.toString(), response);
	}
}
