package com.coffee.shop.controllers;

import org.springframework.web.servlet.ModelAndView;

public abstract class BaseController {
	
	protected ModelAndView view(String viewName) {
		ModelAndView modelAndView = new ModelAndView(viewName);
		
		return modelAndView;
	}
	
	protected ModelAndView view(String viewName, String modelName, Object model) {
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject(modelName, model);
		
		return modelAndView;
	}
}
