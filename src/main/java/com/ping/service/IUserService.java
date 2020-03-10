package com.ping.service;

import java.util.List;

import com.ping.entity.User;

public interface IUserService {
	public boolean saveUser(User user);
	public List<User> getUsers();
	public User getUserByUserName(User user);
}
