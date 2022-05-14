package com.ashwin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.demo.dao.IUserRepository;
import com.ashwin.demo.entity.User;

@Service
public class UserService implements IUserService {

	//Field injection
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public User findUserByNameAndPassword(String userName, String password) {
		
		User user = userRepository.findUserByUsernameAndPassword(userName, password);
		
		//condition check
		if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
			return user;
		}else {
			return null;
		}	
	}

}
