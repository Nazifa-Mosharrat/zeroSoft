package com.zeroosoft.pos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foodCategory")
public class FoodCategoryEntity {
	@Id
	@GeneratedValue
	   private Integer foodCategoryId;
	   private String foodCategoryName;
	public Integer getFoodCategoryId() {
		return foodCategoryId;
	}
	public void setFoodCategoryId(Integer foodCategoryId) {
		this.foodCategoryId = foodCategoryId;
	}
	public String getFoodCategoryName() {
		return foodCategoryName;
	}
	public void setFoodCategoryName(String foodCategoryName) {
		this.foodCategoryName = foodCategoryName;
	}
}
