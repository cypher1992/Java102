package com.local.lessson.financialclass;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/*
 Implementing Abstraction Class
*/

public abstract class Instrument {

	//creating attributes
	private String name;
	private String identifier;
	private Double price;
	private String assetType;
	private LocalDateTime dateTime;
	
	//creating a constructor but never instantiated as Abstract Class
	public Instrument(String name, String identifier, Double price, String assetType, LocalDateTime dateTime) {
	
		this.name = name;
		this.identifier = identifier;
		this.price = price;
		this.assetType = assetType;
		this.dateTime = dateTime; 
	}

	//Creating setters and getters for getting and setting attributes
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public Map instrumentMap() {
		
		Map<String,Object> instrumentMap = new HashMap<String,Object>();
		
		instrumentMap.put("NAME:", this.getName());
		instrumentMap.put("IDENTIFIER", this.getIdentifier());
		instrumentMap.put("ASSETTYPE", this.getAssetType());
		instrumentMap.put("DATETIME", this.getDateTime());
		instrumentMap.put("PRICE", this.getPrice());
		
		return instrumentMap; 
	}
	
	
	
	
	
}
