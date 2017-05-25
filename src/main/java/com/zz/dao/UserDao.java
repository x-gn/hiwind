package com.zz.dao;

import com.zz.domain.User;

/**
 * 功能概要：User的DAO类
 * 
 * @author zz
 * @since xx
 */
public interface UserDao {
	/**
	 * 
	 * @author zz
	 * @since xx
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);

}