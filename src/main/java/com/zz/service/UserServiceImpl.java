package com.zz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zz.dao.UserDao;
import com.zz.domain.User;

/**
 * 功能概要：UserService实现类
 * 
 * @author zz
 * @since xx
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);

	}

}