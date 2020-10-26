package com.zeroosoft.pos.service;

import java.util.List;

import com.zeroosoft.pos.dto.Stock;


public interface StockService {

	public void stockEntrySave(Stock stock);
	
	List<Stock> getStockAllList();
	
	Stock getStockById(Long stockEntryId);
}
