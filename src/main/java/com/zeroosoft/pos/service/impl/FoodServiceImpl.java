package com.zeroosoft.pos.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeroosoft.pos.dto.Food;
import com.zeroosoft.pos.entity.FoodEntity;
import com.zeroosoft.pos.repository.FoodRepository;
import com.zeroosoft.pos.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	@Autowired FoodRepository foodRepository;
	public void addFood(Food food) {
		FoodEntity foodEntity = new FoodEntity();
        BeanUtils.copyProperties(food, foodEntity);
        foodRepository.save(foodEntity);
	}
 @Override
	public List<Food> getfoodList() {
		List<FoodEntity> foodEntities=foodRepository.findAll();
		List <Food> foodList=new ArrayList<Food>();
		
		if(!foodEntities.isEmpty()) {
			for(FoodEntity tempFoodEntity:foodEntities) {
				Food food=new Food();
				BeanUtils.copyProperties(tempFoodEntity, food);
				foodList.add(food);
			}
			
			
			return foodList;
		}
		else
			return Collections.emptyList();
	}
	
}
