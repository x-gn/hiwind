package com.zz.controller;  
  
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.zz.domain.User;
import com.zz.service.UserService;  
  
/** 
 * 功能概要：UserController 
 *  
 * @author zz 
 * @since  xx
 */  
@Controller  
public class UserController {  
	
	private final static Logger LOG = LoggerFactory.getLogger(UserController.class);

	
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/")    
    public ModelAndView getIndex(String id){      
        ModelAndView mav = new ModelAndView("index");   
        int sid =1;
        if(!id.isEmpty()){
        	 sid = Integer.parseInt(id);
        	}
        User user = userService.selectUserById(sid); 
        System.out.println("id is:"+user.getUserName());
        mav.addObject("user", user);   
        LOG.info(String.format("id=%s,%s", sid,sid));
        return mav;    
    }  
    
    @RequestMapping("/login")
    public String addUser2(HttpServletRequest request) throws SQLException {
        String username=request.getParameter("name");
        String password=request.getParameter("pwd");
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        throw new SQLException("出错鸟。。。。。。。。。");  
        //return "/index";
    }
    @RequestMapping("/showajax")
    public String toAjax() {  
        //return "/page/ajax";
        return "ajax";
    }  
    
    @RequestMapping(value = "json", method = RequestMethod.GET)  
    @ResponseBody
    public void  ajax(PrintWriter printWriter,int id) {  
    	 User user = userService.selectUserById(id);  
        System.out.println(user);  
        String jsonString = JSON.toJSONString(user, SerializerFeature.PrettyFormat);  
        //PrintWriter pw = new PrintWriter();
        printWriter.write(jsonString);  
        printWriter.flush();  
        printWriter.close();  
        //return new ModelAndView(jsonString);
    } 
    
     
}  