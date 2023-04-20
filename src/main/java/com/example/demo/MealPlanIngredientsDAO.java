package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;

@Repository
@Transactional
public
class MealPlanIngredientsDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<MealPlan> list(float cal, String ingredient) 
	{   //SELECT * FROM recipes WHERE recipes.recipeId IN (SELECT DISTINCT recipeId FROM recipe_ingredients WHERE ingredientName = '" + ingredient + "') AND calory < " + cal
		//SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE calory < 200 AND Tags.tag=Recipes.tag AND recipeId IN (Select recipeId from recipeIngredients,Ingredients WHERE Ingredients.intsName='Salt' AND Ingredients.intsId=recipeIngredients.intsId);
		String sql = "SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE calory < "+cal+ " AND Tags.tag=Recipes.tag AND recipeId IN (Select recipeId from recipeIngredients,Ingredients WHERE Ingredients.intsName='"+ingredient+"' AND Ingredients.intsId=recipeIngredients.intsId)";
	    List<MealPlan> listRecipeIngredient = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(MealPlan.class));
	    return listRecipeIngredient;
	}

}
