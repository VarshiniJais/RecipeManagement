package com.example.demo;

public class recipeHistory 
{
	int userID;
	int recipeId;
	
	public recipeHistory(int userID, int recipeId) 
	{
		super();
		this.userID = userID;
		this.recipeId = recipeId;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
}
