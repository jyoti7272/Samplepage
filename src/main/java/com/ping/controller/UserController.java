package com.ping.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ping.entity.User;
import com.ping.service.IUserService;
import com.ping.service.UserService;

public class UserController extends HttpServlet{

	//private ICategoryService categoryService;
	private IUserService userService;

	public UserController() {

		userService = new UserService();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("pwd");
		String email = req.getParameter("email");

		User usr = new User(userName, password, email);
		if(userService.saveUser(usr)) {
			System.out.println("Inserted");

		} else {
			System.out.println("Not Inserted");
		}


	}

}
