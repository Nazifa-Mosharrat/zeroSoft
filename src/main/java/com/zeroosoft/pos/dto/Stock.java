package com.zeroosoft.pos.dto;



public class Stock {
	
	private Long		StockEntryId;
	
	private Integer		productId;
	
	private String		warehouseName;//where this stock will be entered
	
	private String		quantityType;
	
	private String		unitName;
	
	private Double		quantity;
	
	private Double		totalPrice;
	
	private	String		stockEntryDate;
	
	private Integer		foodId;
	
	private Food		food;
	
	
		
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public Long getStockEntryId() {
		return StockEntryId;
	}

	public void setStockEntryId(Long stockEntryId) {
		StockEntryId = stockEntryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	
	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	
	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStockEntryDate() {
		return stockEntryDate;
	}

	public void setStockEntryDate(String stockEntryDate) {
		this.stockEntryDate = stockEntryDate;
	}

	@Override
	public String toString() {
		return "Stock [StockEntryId=" + StockEntryId + ", productId=" + productId + ", warehouseName=" + warehouseName
				+ ", quantityType=" + quantityType + ", unitName=" + unitName + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", stockEntryDate=" + stockEntryDate + "]";
	}

	
	
	
}
