package com.hireme.now;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.hireme.dao.DAOAbstract;


public class UserDAO extends DAOAbstract<User>{

	@Override
	public User add(User user) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		try {
			con = getConnection();
			stmnt = con.createStatement();
		
			String sql = "INSERT INTO User (FirstName, LastName, UserName, Email, Password)" +
			" VALUES ("
			+" '" + user.getFirstName() +"', "
			+" '" + user.getLastName() +"', "
			+" '" + user.getUserName() +"', "
			+" '" + user.getEmail()+"',"
			+" '" + user.getPassword() +"')";
			
			System.out.println(sql);
			stmnt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = stmnt.getGeneratedKeys();
			while(rs.next()){
				user.setId(rs.getInt(1));
			}
			rs.close();
			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}


	@Override
	public int delete(User user) {
		Connection con=null;
		Statement stmnt=null;
		int i = -1;
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "DELETE FROM user WHERE user.id = " + user.getId();
			i = stmnt.executeUpdate(sql);

			stmnt.close();
			closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public Collection<User> find(User user) {
		Connection con=null;
		Statement stmnt=null;
		ResultSet rs = null;
		int colCount = 0;
		Collection<User> users = new ArrayList<User>();
		try {
			con = getConnection();
			stmnt = con.createStatement();
			String sql = "SELECT userId, firstName, lastName, userName, password, email  FROM user WHERE ";

			if(user.getId() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " id = '" + user.getId() + "' " ;
				colCount++;
			}

			if(user.getFirstName() != null && user.getFirstName().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " firstname LIKE '" + user.getFirstName() +  "'" ;
				colCount++;
			}
			if(user.getLastName() != null && user.getLastName() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " lname LIKE '" + user.getLastName()  + "' " ;
				colCount++;
			}
			if(user.getUserName() != null && user.getUserName() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " userName LIKE '" + user.getUserName()  + "' " ;
				colCount++;
			}
			if(user.getPassword() != null && user.getPassword() .length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " password LIKE '" + user.getPassword()  + "' " ;
				colCount++;
			}
			if(user.getEmail() != null && user.getEmail().length() > 0){
				sql += (colCount > 0 ) ? " and " :"";
				sql += " email LIKE '" + user.getEmail()+ "' " ;
				colCount++;
			}
			
			
			
			rs = stmnt.executeQuery(sql);
			while(rs.next()){
				User myuser= new User();
				user.setId(rs.getInt("userId"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setUserName(rs.getString("userName"));
			

				users.add(myuser);
			}

			rs.close();
			stmnt.close();
			closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	}
	
	
	 


