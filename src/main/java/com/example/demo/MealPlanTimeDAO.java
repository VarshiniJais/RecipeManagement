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
class MealPlanTimeDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<MealPlan> list(float cal, String time) 
	{
		//"SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE calory <"+cal+" AND Tags.tagName='"+time+"'";
		String sql = "SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Recipes.tag,tagName FROM Recipes INNER JOIN Tags ON Recipes.tag = Tags.tag WHERE Recipes.calory <"+cal+" AND Tags.tagName='"+time+"';";
	    List<MealPlan> listRecipeTime = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(MealPlan.class));
	    return listRecipeTime;
	}

}
