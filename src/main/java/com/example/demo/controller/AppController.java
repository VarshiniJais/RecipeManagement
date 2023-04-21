package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Recipe;
import com.example.demo.RecipeDAO;
import com.example.demo.recipeHistoryDAO;
import com.example.demo.Users;


@Controller
class AppController 
{
	@Autowired
    private RecipeDAO Rdao;
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String viewFrontPage(Model model) 
	{
	    return "Login";
	}
	@RequestMapping(value = {"/home"}, method ={ RequestMethod.GET, RequestMethod.POST })
	public String viewHomePage(@RequestParam("userID") int userID, @RequestParam("userName") String userName,Model model) 
	{
		Users user= Users.getUser();
		user.setUserId(userID);
		user.setUserName(userName);
		System.out.println(user.getUserName());
	    return "Home";
	}
	@RequestMapping(value = {"/history"}, method = RequestMethod.GET)
	public String viewHistoryPage(Model model) 
	{
		Users user= Users.getUser();
		List<Recipe> listRecipe = Rdao.get(user.getUserId());
		(model).addAttribute("listRecipe", listRecipe);
	    return "userRecipe";
	}
	@RequestMapping(value = {"/fav"}, method = RequestMethod.GET)
	public String viewFavPage(Model model) 
	{
		Users user= Users.getUser();
		List<Recipe> listRecipe = Rdao.get_fav(user.getUserId());
		(model).addAttribute("listRecipe", listRecipe);
	    return "userFav";
	}
}

