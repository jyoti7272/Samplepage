package com.ping.dao;

import java.util.List;

import com.ping.entity.User;


public interface IUserDao {
	public boolean saveUser(User user);
	public List<User> getUser();  // <category> create category generic type
	public User getUserByUserName(User user);
	
}
