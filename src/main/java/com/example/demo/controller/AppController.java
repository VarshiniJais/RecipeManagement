package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
class AppController 
{
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String viewFrontPage(Model model) 
	{
	    return "Login";
	}
	@RequestMapping(value = {"/home"}, method ={ RequestMethod.GET, RequestMethod.POST })
	public String viewHomePage(Model model) 
	{
	    return "Home";
	}
}

