package com.edu.baiedu.service.impl;

import com.edu.baiedu.dao.PbAudio;
import com.edu.baiedu.dao.PbUser;
import com.edu.baiedu.repository.PbAudioMapper;
import com.edu.baiedu.repository.PbRegisterMapper;
import com.edu.baiedu.repository.PbUserMapper;
import com.edu.baiedu.model.AudioDto;
import com.edu.baiedu.model.RegisterDto;
import com.edu.baiedu.model.UserDto;
import com.edu.baiedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

//用户登录实现类对象
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	//注入Mapper对象
	@Autowired
	private PbUserMapper pbUserMapper;
	//注入注册dao
	@Autowired
	private PbRegisterMapper pbRegisterMapper;
	//注入语音dao
	@Autowired
	private PbAudioMapper pbAudioMapper;
  //根据用户名和密码查询用户实现
	@Override
	public UserDto getUserByUserNameAndPassword(String userName, String password) {
		// 调用dao根据用户名和密码查询用户  生成一个dao接口的代理对象
		System.out.println("登录请求查询用户获得代理对象:"+pbUserMapper.getClass().getName());
		return pbUserMapper.selectUserByUserNameAndPassword(userName, password);
		
	}
   //根据用户名修改用户登录时间
	@Override
	public void changeLoginTimeByUserName(String userName, Date loginTime) {
		// 根据用户名修改用户登录时间
		pbUserMapper.updateLoginTimeByUserName(userName, loginTime);
		
	}
	//判断注册的用户是否存在
	@Override
	public int getUserNumByUserName(String userName) {
		return pbUserMapper.selectUserNumByUserName(userName);
	}
	//注册用户    事务要传播  主要是多张表操作的方法 都要进行事务控制  在实际开发中事务线切到service层  事务传播 就会把我们的事务从servcie层传播到dao层
	//Spring aop 在我们项目中就是实现事务控制
	@Override
	@Transactional(propagation= Propagation.REQUIRED,rollbackFor= {RuntimeException.class,Exception.class})
	public void addUserRegister(RegisterDto registerDto, PbUser userDto, PbAudio audioDto) {
		//用户数据数据添加  对应的是用户表
		pbUserMapper.insertSelective(userDto);
		//用户注册表数据
		pbRegisterMapper.insertRegister(registerDto);
	    //int i=1/0; 模拟事务的回滚
		//用于语音表数据添加
		pbAudioMapper.insertSelective(audioDto);
		
	}
	//修改密码方法实现
	@Override
	public void updatePasswordByUserName(String username, String newPassword) {
		// 调用dao修改密码
		pbUserMapper.updatePasswordByUserName(username,newPassword);
		
	}

}
