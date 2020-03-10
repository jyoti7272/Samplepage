package com.ping.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ping.common.HibernateUtility;
import com.ping.entity.User;

public class Main1 {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtility.buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		/*
		 * User user = new User(); user.setUserName("dilip");
		 * user.setPassword("fdlaskjfla"); user.setEmail("ldjasafas");
		 * 
		 * 
		 * session.save(user);
		 */
		
		User b = (User) session.get(User.class, "dilip");
		System.out.println(b);
		session.getTransaction().commit();
	}
}
