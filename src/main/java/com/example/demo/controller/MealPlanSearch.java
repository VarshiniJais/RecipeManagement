package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.MealPlan;
import com.example.demo.MealPlanIngredientsDAO;
import com.example.demo.MealPlanTimeDAO;

@Controller
public class MealPlanSearch 
{
	@Autowired
	private MealPlanTimeDAO MTdao;
	@Autowired
	private MealPlanIngredientsDAO MIdao;
	@RequestMapping(value = {"/mealplan"}, method = RequestMethod.GET)
	public String viewEnterMealPlan(Model model) 
	{
	    return "mealplan";
	}
	@RequestMapping(value = {"/mealplantime"}, method = RequestMethod.GET)
	public String viewMealPlanTime(Model model) 
	{
	    return "mealplantime";
	}
	@RequestMapping(value = {"/mealplaningredient"}, method = RequestMethod.GET)
	public String viewMealPlanIngredient(Model model) 
	{
	    return "mealplaningredient";
	}
	@RequestMapping(value = {"/searchtime"}, method = RequestMethod.GET)
	public String viewSearchPageTime(@RequestParam("calory") float calory, @RequestParam("mealTime") String mealTime, Model model) 
	{
	    List<MealPlan> listRecipeTime = MTdao.list(calory, mealTime);
	    (model).addAttribute("listRecipeTime", listRecipeTime);
	    return "searchtime";
	}
	@RequestMapping(value = {"/searchingredient"}, method = RequestMethod.GET)
	public String viewSearchPageIngredient(@RequestParam("calory") float calory, @RequestParam("ingredientName") String ingredientName, Model model) 
	{
	    List<MealPlan> listRecipeIngredient = MIdao.list(calory, ingredientName);
	    (model).addAttribute("listRecipeIngredient", listRecipeIngredient);
	    System.out.println(listRecipeIngredient.get(0).getTag());
	    return "searchIngredient";

	}
}
