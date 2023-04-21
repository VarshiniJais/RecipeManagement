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
public class RecipeDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Recipe> list(String name) 
	{
		String sql = "SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE recipeName = '" + name + "' AND Tags.tag=Recipes.tag";
	    List<Recipe> listRecipe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Recipe.class));
	    return listRecipe;
	}
	  
	public void save(Recipe recipe) 
	{
		Users user=Users.getUser();
		recipeHistory obj=new recipeHistory(user.getUserId(),recipe.getRecipeId());
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor.withTableName("Recipes").usingColumns("recipeId", "recipeName", "recipeDescription","instructions","prepTime","calory","cookTime","tag");
	    BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(recipe);
	    insertActor.execute(param);
	    SimpleJdbcInsert insertActor2 = new SimpleJdbcInsert(jdbcTemplate);
	    insertActor2.withTableName("recipeHistory").usingColumns("userID", "recipeId");
	    BeanPropertySqlParameterSource parame = new BeanPropertySqlParameterSource(obj);
	    insertActor2.execute(parame);
	}
	  
	public List<Recipe> get(int userId) 
	{
		String sql = "SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE Tags.tag=Recipes.tag and recipeId IN (SELECT recipeId from recipeHistory where userID="+userId+")";
	    List<Recipe> listRecipe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Recipe.class));
	    return listRecipe;
	}
	  
	public List<Recipe> get_fav(int userId) 
	{
		String sql = "SELECT recipeId, recipeName,recipeDescription,instructions,prepTime,calory,cookTime,Tags.tag,tagName FROM RECIPES,Tags WHERE Tags.tag=Recipes.tag and recipeId IN (SELECT recipeId from recipeFav where userID="+userId+")";
	    List<Recipe> listRecipe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Recipe.class));
	    return listRecipe;
	}
	  
	public void delete(int recipeId) 
	{
	}
}
