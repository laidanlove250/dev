/**
 * 
 */
package com.mycat.mycat_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mycat.mycat_demo.entity.User;
import com.mycat.mycat_demo.mapper.UserMapper;

/**
 * @author Administrator
 *
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	@Transactional(propagation = Propagation.REQUIRED , rollbackFor = Exception.class)
	public Integer insert(User user){
		return userMapper.insert(user);
	} 
	
	public List<User> queryUserList(User user){
		return userMapper.querUserList(user);
	}
}
