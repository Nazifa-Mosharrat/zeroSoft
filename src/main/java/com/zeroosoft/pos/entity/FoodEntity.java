package com.zeroosoft.pos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "food")
public class FoodEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="foodid")
	private Integer foodId;
	@Column(name="foodname")
	private String  foodName;
	@Column(name="fooddescription")
	private String  foodDescription;

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodDescription() {
		return foodDescription;
	}

	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}



}

