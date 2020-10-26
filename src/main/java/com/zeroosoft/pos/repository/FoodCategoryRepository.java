package com.zeroosoft.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeroosoft.pos.entity.FoodCategoryEntity;

public interface FoodCategoryRepository extends JpaRepository<FoodCategoryEntity,Integer>
{

}
