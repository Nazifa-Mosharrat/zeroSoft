package com.zeroosoft.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zeroosoft.pos.entity.StockEntity;

@Repository
public interface StockRepository extends JpaRepository<StockEntity, Long>{

}
