/**
 * 
 */
package com.mycat.mycat_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycat.mycat_demo.entity.User;
import com.mycat.mycat_demo.service.UserService;

/**
 * @author Administrator
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/saveUser" , method = RequestMethod.GET)
	@ResponseBody
	public Long saveUser(User user){
		//user.setId(6000000L);
		userService.insert(user);
		return user.getId();
	}
	
	@RequestMapping(value = "/queryUserList" , method = RequestMethod.GET)
	@ResponseBody
	public List<User> queryUserList(){
		return userService.queryUserList(null);
	}
}
