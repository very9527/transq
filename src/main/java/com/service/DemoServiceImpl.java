package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.dao.domain.UserObject;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired() @Qualifier("userMapper")
	UserMapper userMapper;


	public UserObject getUserById( int id ) {
//		return userMapper.selectById(id);
		UserObject user = new UserObject();
		user.setId(1);
		return user;
	}
}
