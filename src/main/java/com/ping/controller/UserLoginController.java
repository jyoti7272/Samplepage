package com.ping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import com.ping.entity.User;
import com.ping.service.IUserService;
import com.ping.service.UserService;

public class UserLoginController extends HttpServlet {
	
	private IUserService userService;
	
	public UserLoginController()
	{
		userService = new UserService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User usr1=new User();
		usr1.setUserName(req.getParameter("email"));
		usr1.setPassword(req.getParameter("pwd"));
		
		System.out.println("INPUT USER "+usr1);
		
		User mUser = userService.getUserByUserName(usr1);
		System.out.println("OUTPUT USER " +mUser);
		
		if(mUser != null) 
		{
			RequestDispatcher rd= req.getRequestDispatcher("/jsp/index.jsp");
			rd.forward(req, resp);		
			//System.out.println("congratulation you have entered");
	
			
		} 
		else 
		{      PrintWriter out=resp.getWriter();
		      out.print("<h1>Username and password failed<h1>");
			RequestDispatcher rd= req.getRequestDispatcher("Login.jsp");
			rd.include(req, resp);
			
		}
		
		
	}

}
