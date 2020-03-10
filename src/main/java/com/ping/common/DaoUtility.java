package com.ping.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DaoUtility {

	private static Connection connection;

	public static Connection getConnection() {
		System.out.println("CONNECTION");
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			connection = DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/bhanu","root","bhanu");
		} catch (Exception e) {
		}
		return connection;
	}
}
