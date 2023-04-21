package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class recipeHistoryDAO 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void check(int id, String names)
	{
		/**Users user=Users.getUser();
		String sql= "SELECT userName from users where userID="+id;
		Users user = jdbcTemplate.queryForObject(sql, new Object[]{id}, BeanPropertyRowMapper.newInstance(Users.class));**/
	}
}
