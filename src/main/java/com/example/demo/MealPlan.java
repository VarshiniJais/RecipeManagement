package com.example.demo;

public class MealPlan 
{
	public int recipeId;
	public String recipeName;
	public String recipeDescription;
	public String instructions;
	public int prepTime;
	public float calory;
	public int cookTime;
	public int tag;
	public String tagName;
	//public String ingredientName;
	
	protected MealPlan()
	{
		
	}
	
	protected MealPlan(int recipeId, String recipeName, String recipeDescription, String instructions, int prepTime, float calory, int cookTime, int tag, String tagName)// String ingredientName)
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
		//this.ingredientName = ingredientName;
	}

	public int getRecipeId() 
	{
		return recipeId;
	}

	public void setRecipeId(int recipeId) 
	{
		this.recipeId = recipeId;
	}

	public String getRecipeName() 
	{
		return recipeName;
	}

	public void setRecipeName(String recipeName) 
	{
		this.recipeName = recipeName;
	}

	public String getRecipeDescription() 
	{
		return recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) 
	{
		this.recipeDescription = recipeDescription;
	}

	public String getInstructions() 
	{
		return instructions;
	}

	public void setInstructions(String instructions) 
	{
		this.instructions = instructions;
	}

	public int getPrepTime() 
	{
		return prepTime;
	}

	public void setPrepTime(int prepTime) 
	{
		this.prepTime = prepTime;
	}

	public float getCalory() 
	{
		return calory;
	}

	public void setCalory(float calory) 
	{
		this.calory = calory;
	}

	public int getCookTime() 
	{
		return cookTime;
	}

	public void setCookTime(int cookTime) 
	{
		this.cookTime = cookTime;
	}

	public int getTag() 
	{
		return tag;
	}

	public void setTag(int tag) 
	{
		this.tag = tag;
	}
	public String gettagName() 
	{
		return tagName;
	}

	public void settagName(String tagName) 
	{
		this.tagName = tagName;
	}
	/**public String getIngredientName() 
	{
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) 
	{
		this.ingredientName = ingredientName;
	}**/
}
