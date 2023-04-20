package com.example.demo;

public class Users 
{
	int userId;
	String userName;
	//singleton
	private static Users obj = new Users();
	private Users()
	{}
	public static Users getUser()
	{
		return obj;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
