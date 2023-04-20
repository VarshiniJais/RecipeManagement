package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Ingredients;
import com.example.demo.IngredientsDAO;
import com.example.demo.Recipe;
import com.example.demo.RecipeDAO;


@Controller
public class SearchRecipe 
{
	@Autowired
    private RecipeDAO Rdao;
	@Autowired
	private IngredientsDAO Idao;
	@RequestMapping(value = {"/elements"})
	public String viewSearchVal(Model model) 
	{
	    return "element";
	}
	@RequestMapping(value = {"/search"}, method = RequestMethod.GET)
	public String viewSearchPage(@RequestParam("recipeName") String recipeName, Model model) 
	{
	    List<Recipe> listRecipe = Rdao.list(recipeName);
	    (model).addAttribute("listRecipe", listRecipe);
	    return "search";
	}
	@RequestMapping(value = "/shopping",method = { RequestMethod.GET, RequestMethod.POST })
	public String showShoppingList(@RequestParam("recipeId") String recipeId, Model model) 
	{
		System.out.println("Recipe Id : "+recipeId);
	    List<Ingredients> IngredientsList = Idao.list(recipeId);
	    (model).addAttribute("IngredientsList", IngredientsList);
	    return "IngDetails";
	}

}
