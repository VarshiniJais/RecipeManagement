package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.MealPlan;
import com.example.demo.MealPlanTimeDAO;

@Component
public class TimeSearchPage extends SearchFactory {
	public List<MealPlan> list(float calory, String mealTime) 
	{
        MealPlanTimeDAO MTdao = new MealPlanTimeDAO();
        return MTdao.list(calory, mealTime);
    }

	public MealPlanTimeDAO createSearchPage(MealPlanTimeDAO dao) {
		// TODO Auto-generated method stub
		return dao;
	}
}