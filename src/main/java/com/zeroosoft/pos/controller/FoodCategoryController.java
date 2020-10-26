package com.zeroosoft.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zeroosoft.pos.dto.FoodCategory;
import com.zeroosoft.pos.service.FoodCategoryService;

@Controller
public class FoodCategoryController {
	@Autowired
	FoodCategoryService foodCategoryService;

	@GetMapping("add-food-category.html")
	public String addFoodCategory(Model model) {
		FoodCategory foodCategory = new FoodCategory();
		model.addAttribute("foodCategory", foodCategory);
		return "product/add-food-category";

	}

	@PostMapping("food-category-save.html")
	public String saveFoodCategory(@ModelAttribute FoodCategory foodCategory, Model model) {
		foodCategoryService.addFoodCategory(foodCategory);
		
		FoodCategory foodCategory1 = new FoodCategory();
		model.addAttribute("foodCategory", foodCategory1);
		
		return "redirect:add-food-category.html";

	}
}