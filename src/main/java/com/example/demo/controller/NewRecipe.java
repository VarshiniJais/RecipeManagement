package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Recipe;
import com.example.demo.RecipeDAO;

@Controller
public class NewRecipe 
{
	@Autowired
    private RecipeDAO Rdao;
	@RequestMapping(value = "/new",method = RequestMethod.GET)
	public String showNewForm(Model model) {
	    Recipe recipe = new Recipe();
	    model.addAttribute("recipe", recipe);
	    return "new_form2";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("recipe") Recipe recipe) 
	{
		Rdao.save(recipe);
	    return "saved";
	}
}
