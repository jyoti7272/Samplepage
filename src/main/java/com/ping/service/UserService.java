package com.ping.service;

import java.util.List;

import com.ping.dao.IUserDao;
import com.ping.dao.UserDao;
import com.ping.entity.User;

public class UserService implements IUserService {

	private IUserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	public boolean saveUser(User user) {
		return userDao.saveUser(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	public User getUserByUserName(User user) {
		return userDao.getUserByUserName(user);
	}

	
}
