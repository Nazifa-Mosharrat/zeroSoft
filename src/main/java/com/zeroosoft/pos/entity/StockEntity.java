package com.zeroosoft.pos.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zeroosoft.pos.dto.Food;

@Entity
@Table(name="stockentry")
public class StockEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stockEntryId")
	private Long		StockEntryId;
	
	@Column(name="productId")
	private Integer		productId;

	@Column(name="warehouseName")
	private String		warehouseName;//where this stock will be entered

	@Column(name="quantityType")
	private String		quantityType;

	@Column(name="unitName")
	private String		unitName;

	@Column(name="quantity")
	private Double		quantity;

	@Column(name="totalPrice")
	private Double		totalPrice;
	
	@Column(name="stockEntryDate")
	private	String		stockEntryDate;

	@Column(name="entryUserName")
	private String		entryUserName;

	@Column(name="updateUserName")
	private String		updateUserName;

	@Column(name="entryIpAddress")
	private String		entryIpAddress;

	@Column(name="updateIpAddress")
	private String		updateIpAddress;

	@Column(name="serverEntryTime")
	private Timestamp	serverEntryTime;

	@Column(name="serverUpdateTime")
	private Timestamp   serverUpdateTime;

	@Column(name="systemEntryTime")
	private String	systemEntryTime;

	@Column(name="systemUpdateTime")
	private String   systemUpdateTime;

	@Column(name="entryMacAdd")
	private String	 entryMacAdd;
	
	@Column(name="foodId")
	private Integer		foodId;
	

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

	public String getEntryUserName() {
		return entryUserName;
	}

	public void setEntryUserName(String entryUserName) {
		this.entryUserName = entryUserName;
	}

	public String getUpdateUserName() {
		return updateUserName;
	}

	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}

	public String getEntryIpAddress() {
		return entryIpAddress;
	}

	public void setEntryIpAddress(String entryIpAddress) {
		this.entryIpAddress = entryIpAddress;
	}

	public String getUpdateIpAddress() {
		return updateIpAddress;
	}

	public void setUpdateIpAddress(String updateIpAddress) {
		this.updateIpAddress = updateIpAddress;
	}

	public Timestamp getServerEntryTime() {
		return serverEntryTime;
	}

	public void setServerEntryTime(Timestamp serverEntryTime) {
		this.serverEntryTime = serverEntryTime;
	}

	public Timestamp getServerUpdateTime() {
		return serverUpdateTime;
	}

	public void setServerUpdateTime(Timestamp serverUpdateTime) {
		this.serverUpdateTime = serverUpdateTime;
	}

	public String getSystemEntryTime() {
		return systemEntryTime;
	}

	public void setSystemEntryTime(String systemEntryTime) {
		this.systemEntryTime = systemEntryTime;
	}

	public String getSystemUpdateTime() {
		return systemUpdateTime;
	}

	public void setSystemUpdateTime(String systemUpdateTime) {
		this.systemUpdateTime = systemUpdateTime;
	}

	
	public String getEntryMacAdd() {
		return entryMacAdd;
	}

	public void setEntryMacAdd(String entryMacAdd) {
		this.entryMacAdd = entryMacAdd;
	}

	@Override
	public String toString() {
		return "StockEntity [StockEntryId=" + StockEntryId + ", productId=" + productId + ", warehouseName="
				+ warehouseName + ", quantityType=" + quantityType + ", unitName=" + unitName + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", stockEntryDate=" + stockEntryDate + ", entryUserName="
				+ entryUserName + ", updateUserName=" + updateUserName + ", entryIpAddress=" + entryIpAddress
				+ ", updateIpAddress=" + updateIpAddress + ", serverEntryTime=" + serverEntryTime
				+ ", serverUpdateTime=" + serverUpdateTime + ", systemEntryTime=" + systemEntryTime
				+ ", systemUpdateTime=" + systemUpdateTime + ", entryMacAdd=" + entryMacAdd + "]";
	}
	
	
 
	
}
