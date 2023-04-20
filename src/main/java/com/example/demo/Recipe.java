package com.example.demo;

public class Recipe 
{
	public int recipeId;//n
	public String recipeName;//n
	public String recipeDescription;//n
	public String instructions;
	public int prepTime;//n
	public float calory;
	public int cookTime;//n
	public int tag;
	public String tagName;
	
	public Recipe()
	{
		
	}
	
	protected Recipe(int recipeId, String recipeName, String recipeDescription, String instructions, int prepTime, float calory, int cookTime, int tag, String tagName)
	{
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.recipeDescription = recipeDescription;
		this.instructions = instructions;
		this.prepTime = prepTime;
		this.calory = calory;
		this.cookTime = cookTime;
		this.tag = tag;
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeDescription() {
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public int getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}

	public float getCalory() {
		return calory;
	}

	public void setCalory(float calory) {
		this.calory = calory;
	}

	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
	
}