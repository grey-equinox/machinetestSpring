package com.ashwin.demo.service;

import com.ashwin.demo.entity.User;

public interface IUserService {
	
	//Custom Method using JPQL-in User Repository
	public User findUserByNameAndPassword(String userName, String password);

}
