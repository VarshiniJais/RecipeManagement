package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.MealPlan;
import com.example.demo.MealPlanTimeDAO;

@Component
public abstract class SearchFactory 
{
	public abstract  MealPlanTimeDAO createSearchPage(MealPlanTimeDAO dao);
	public abstract List<MealPlan> list(float calory, String mealTime);
}