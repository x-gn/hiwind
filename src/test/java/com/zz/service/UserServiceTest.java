package com.zz.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zz.baseTest.SpringTestCase;
import com.zz.domain.User;

/**
 * 功能概要：UserService单元测试
 * 
 * @author zz
 * @since
 */
public class UserServiceTest extends SpringTestCase {
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);

	@Test
	public void selectUserByIdTest() {
		User user = userService.selectUserById(7);
		logger.debug("查找结果" + user);
	}

}