package com.local.lessson.financialclass;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

// inherit Instrument via extends
public class Equity extends Instrument {
	
	//define attributes of equity
	private String company;
	private String ticker; 
	
	public Equity(String name, String identifier, Double price, String assetType, LocalDateTime dateTime,String company, String ticker) {
		super(name, identifier, price, assetType, dateTime);
		this.company = company;
		this.ticker = ticker; 
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	@Override
	public Map instrumentMap(){
		
		Map<String,Object> instrumentMap = new HashMap<String,Object>();
		
		instrumentMap.put("NAME:", this.getName());
		instrumentMap.put("IDENTIFIER", this.getIdentifier());
		instrumentMap.put("ASSETTYPE", this.getAssetType());
		instrumentMap.put("DATETIME", this.getDateTime());
		instrumentMap.put("PRICE", this.getPrice());
		instrumentMap.put("COMPANY", this.getCompany());
		instrumentMap.put("TICKER", this.getTicker());
		
		return instrumentMap; 
		
	}
	
	

}