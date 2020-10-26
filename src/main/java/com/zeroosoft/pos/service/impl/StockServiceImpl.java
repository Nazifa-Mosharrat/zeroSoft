package com.zeroosoft.pos.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeroosoft.pos.dto.Food;
import com.zeroosoft.pos.dto.Stock;
import com.zeroosoft.pos.entity.FoodEntity;
import com.zeroosoft.pos.entity.StockEntity;
import com.zeroosoft.pos.repository.FoodRepository;
import com.zeroosoft.pos.repository.StockRepository;
import com.zeroosoft.pos.service.StockService;

@Service
public class StockServiceImpl implements StockService{

	private HttpServletRequest request;
	@Autowired StockRepository stockRepository;
	@Autowired FoodRepository foodRepository;
	
	@Override
	public void stockEntrySave(Stock stock) {
		UserTrack userTrack=new UserTrack();
		StockEntity stockEntity=new StockEntity();
		BeanUtils.copyProperties(stock, stockEntity);
		// for user track
		Timestamp serverTime = new Timestamp(System.currentTimeMillis());
		stockEntity.setServerEntryTime(serverTime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime systemEntryTime = LocalDateTime.now();  
		stockEntity.setSystemEntryTime(dtf.format(systemEntryTime));
		
		stockEntity.setEntryIpAddress(userTrack.getIpAddress());
        stockEntity.setEntryMacAdd(userTrack.getMACAddress(userTrack.getIpAddress()));
        
		System.out.println("StockServiceImpl:stockEntry Before save: "+stockEntity);
		stockRepository.save(stockEntity);
		
	}

	@Override
	public List<Stock> getStockAllList() {
		List<Stock> stockList=new ArrayList<>();
		List<StockEntity> stockEntityList=stockRepository.findAll();
		
		if(stockEntityList!=null) {
			for(StockEntity stockEntity:stockEntityList) {
				Food food=new Food();
				FoodEntity foodEntity=foodRepository.findById(stockEntity.getFoodId()).get();
				BeanUtils.copyProperties(foodEntity, food);
				Stock stock=new Stock();
				BeanUtils.copyProperties(stockEntity, stock);
				stock.setFood(food);
				stockList.add(stock);
			}
			
			return stockList;
		}
		else return null;
		
	}

	@Override
	public Stock getStockById(Long stockEntryId) {
		Stock stock=new Stock();
		StockEntity stockEntity=stockRepository.findById(stockEntryId).get();
		BeanUtils.copyProperties(stockEntity, stock);
		return stock;
	}

}
