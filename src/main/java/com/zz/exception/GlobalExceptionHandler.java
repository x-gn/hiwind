package com.zz.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 捕获异常统一处理
 * @description TODO
 * @author chen.gs
 * @create date 2016年4月28日
 * @modified by 
 * @modify date
 * @version v1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	private final static Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	private final static String EXPTION_MSG_KEY = "message";
	
	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	public void handleBizExp(HttpServletRequest request, Exception ex){
		LOG.info("Business exception handler  " + ex.getMessage() );
		request.getSession(true).setAttribute(EXPTION_MSG_KEY, ex.getMessage());
	}
	
	@ExceptionHandler(SQLException.class)
	public ModelAndView handSql(Exception ex){
		LOG.info("SQL Exception " + ex.getMessage());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", ex.getMessage());
		mv.setViewName("sql_error");
		return mv;
	}

}
