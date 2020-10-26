package com.zeroosoft.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.zeroosoft.pos.dto.Food;
import com.zeroosoft.pos.service.FoodService;

@Controller

public class FoodController {
	@Autowired
	FoodService foodService;

	@GetMapping("add-food.html")
	public String addProductPage(Model model) {
		Food food = new Food();
		model.addAttribute("food", food);
		return "product/add-food";
	}

	@PostMapping("food-save.html")
	public String saveProduct(@ModelAttribute Food food, Model model) {
		foodService.addFood(food);
        
		Food food1 = new Food();
		model.addAttribute("food", food1);
		
		return "redirect:add-food.html";

	}
	@GetMapping("food-list.html")
	public String showFoodList(Model model) {
		model.addAttribute("foodlist", foodService.getfoodList());
		return "product/food-list";
		
	}
}
