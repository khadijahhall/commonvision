package com.hireme.now;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User(String userName){
		this.userName = userName;
	}
	public User(String userName, String password){
		this.userName= userName;
		this.password= password;
	}
	public User (String userName, String password, String email, String firstName, String lastName){
		this.userName= userName;
		this.password= password;
		this.email= email;
		this.firstName= firstName;
		this.lastName= lastName;
		
}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int hashCode() {
	    final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + ((userName == null) ? 0 : userName.hashCode());
	    return result;
	  }
	public String toString() {
	    return this.getClass().getName() + ":" + 
	      " Username=" + this.getUserName() +
	      " Password=" + this.getPassword() + 
	      " Email=" + this.getEmail() +
	      " First Name="+ this.getFirstName()+
	      " Last Name="+ this.getLastName();
	  }


}
