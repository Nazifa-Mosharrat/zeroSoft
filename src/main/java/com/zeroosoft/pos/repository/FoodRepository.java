package com.zeroosoft.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeroosoft.pos.entity.FoodEntity;
@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer>{

}
