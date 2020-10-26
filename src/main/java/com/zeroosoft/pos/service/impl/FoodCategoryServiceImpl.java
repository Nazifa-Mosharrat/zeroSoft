package com.zeroosoft.pos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeroosoft.pos.dto.FoodCategory;
import com.zeroosoft.pos.entity.FoodCategoryEntity;
import com.zeroosoft.pos.repository.FoodCategoryRepository;
import com.zeroosoft.pos.service.FoodCategoryService;

@Service
public class FoodCategoryServiceImpl implements FoodCategoryService {
	@Autowired FoodCategoryRepository foodCategoryRepository;
	public void addFoodCategory(FoodCategory foodCategory) {
		FoodCategoryEntity foodCategoryEntity=new FoodCategoryEntity();
		BeanUtils.copyProperties(foodCategory, foodCategoryEntity);
		foodCategoryRepository.save(foodCategoryEntity);
		
	}
}
