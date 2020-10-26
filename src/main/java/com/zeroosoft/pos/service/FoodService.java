package com.zeroosoft.pos.service;

import java.util.List;

import com.zeroosoft.pos.dto.Food;

public interface FoodService {
    public void addFood(Food food);
    public List<Food> getfoodList();
}
