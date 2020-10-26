package com.zeroosoft.pos.dto;

public class FoodCategory {
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

	@Override
	public String toString() {
		return "FoodCategory [foodCategoryId=" + foodCategoryId + ", foodCategoryName=" + foodCategoryName + "]";
	}

}
