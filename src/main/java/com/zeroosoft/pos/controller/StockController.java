package com.zeroosoft.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zeroosoft.pos.dto.Stock;
import com.zeroosoft.pos.service.FoodService;
import com.zeroosoft.pos.service.StockService;

@Controller
public class StockController {
	@Autowired StockService stockService;
	@Autowired FoodService  foodService;
	@GetMapping("/")
	public String showStockEntryScreen2(Model model) {
		return "add-stock";
	}

	@GetMapping("add-stock-entry.html")
	public String showStockEntryScreen(Model model) {
		Stock stock=new Stock();
		model.addAttribute("stock", stock);
		model.addAttribute("foodList",foodService.getfoodList());
		return "add-stock-entry";
	}  
	
	@PostMapping("save-add-stock-entry")
	public String saveStockEntryScreen(Model model, Stock stock) {
		System.out.println("StockController:stockEntry Before call save: "+stock);
		stockService.stockEntrySave(stock);		
		model.addAttribute("stock", new Stock());
		return "redirect:add-stock-entry.html" ;
	}
	
	@GetMapping("list-stock-entry.html")
	public String showStockEntryAllList(Model model) {
		model.addAttribute("stockEntryList", stockService.getStockAllList());
		return"list-stock-entry";
	}
}
