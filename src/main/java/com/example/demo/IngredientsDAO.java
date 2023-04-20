package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class IngredientsDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Ingredients> list(String recipeId) 
	{
		String sql = "Select recipeId,recipeIngredients.intsId,intsName,unit, amount from Ingredients, recipeIngredients where recipeIngredients.intsId = Ingredients.intsId and recipeId= ' "+recipeId+"'";
	    List<Ingredients> listIng = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Ingredients.class));
	    System.out.println(listIng.get(0));
	    return listIng;
	}
	public void save(Ingredients ingredients) 
	{
	}
	public Ingredients get() 
	{
		return null;
	}
	  
	public void update() 
	{
	}
	  
	public void delete() 
	{
	}
}
