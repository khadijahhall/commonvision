package com.hireme.dao;
import java.sql.*;
import java.sql.Connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public abstract class DAOAbstract<T> implements DAOinterface<T>{

	public Connection getConnection() throws SQLException{
		MysqlDataSource db = new MysqlDataSource();
		 try{
			 db.setServerName("localhost");
			 db.setDatabaseName("mydb");
			 db.setUser("root");
			 db.setPassword("0105");
		 } catch (Exception e){
			 e.printStackTrace();
			 
		 }
		 return db.getConnection();
	}
	public void closeConnection(Connection conn){
		if(conn != null)
			try{
				conn.close();
			} catch (SQLException e){
				e.printStackTrace();
				conn = null;
			}
	}
}