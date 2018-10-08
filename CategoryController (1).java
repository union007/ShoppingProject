package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shopbackend.model.Category;
import com.niit.shopbackend.repository.CategoryRepository;

@Controller
public class CategoryController {
	@Autowired
	CategoryRepository categoryRepository;

	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String categoryAdd(@ModelAttribute("cat") Category category)
	{
		categoryRepository.addCategory(category);
		return "redirect:/category";
	}
}









