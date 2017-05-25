package com.zz.service;

//import org.springframework.stereotype.Service;  

import com.zz.domain.User;

/**
 * 功能概要：UserService接口类
 * 
 * @author zz
 * @since zz
 */
public interface UserService {
	User selectUserById(Integer userId);

}