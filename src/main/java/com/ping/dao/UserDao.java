package com.ping.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.ping.common.DaoUtility;
import com.ping.entity.User;

public class UserDao implements IUserDao {

	private static final boolean True = false;
	private final DaoUtility m_daoUtility;

	public UserDao() {
		m_daoUtility = new DaoUtility();
	}
	public boolean saveUser(User user) {
		boolean status = false;
		try {
			Connection connection = DaoUtility.getConnection();
			Statement statement = connection.createStatement();
			String query = "INSERT INTO user(user_name,pwd,email) values('"+user.getUserName()+"','"+user.getPassword()+"', '"+user.getEmail()+"')";
			System.out.println("QUERY "+query);
			status = statement.execute(query);

			System.out.println("Status "+status);
		} catch (Exception e) {
		}
		return status;
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	public User getUserByUserName(User user) {
		User returnedUser = null;
		try {
			Connection connection = m_daoUtility.getConnection();
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM user where email = '"+user.getUserName()+"' and pwd = '"+user.getPassword()+"'";
			ResultSet rs = statement.executeQuery(query);
			System.out.println("SQL "+query);
			
			if (rs.next())
			{
				returnedUser = new User();
				returnedUser.setUserName(rs.getString("user_name"));
				returnedUser.setPassword(rs.getString("pwd"));
				returnedUser.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
		}
		return returnedUser;
	}

}
