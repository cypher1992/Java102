package com.local.lessson.financialclass;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

// inherit Instrument via extends
public class Equity extends Instrument {
	
	//define attributes of equity
	private String company;
	private String ticker;
	private Integer volume;
	private Double cost;
	
	//constructors
	
	public Equity(){
	}
	
	public Equity(String name, String identifier, Double price, String assetType, LocalDateTime dateTime,String company, String ticker) {
		super(name, identifier, price, assetType, dateTime);
		this.company = company;
		this.ticker = ticker; 
	}
	
	public Equity(String name, String identifier, Double price, String assetType, LocalDateTime dateTime,String company, String ticker, int volume) {
		super(name, identifier, price, assetType, dateTime);
		this.company = company;
		this.ticker = ticker;
		this.volume = volume;
		this.cost = this.getVolume() * this.getPrice();
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

	public Integer getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {
		if(volume > 0) {
			this.volume = volume;
		}else {
			throw new ArithmeticException("Volume cannot be below 1");
		}
	}
	
	public Double getCost() {
		return this.cost;
	}
	
	public void setCost(Double cost) {
		if(cost > 0.00 ) {
			this.cost = cost;
		}
		else {
			throw new ArithmeticException("Cost cannot be below 0.00");
		}
	}
	
	@Override
	public Map instrumentMap(){
		
		Map<String,Object> instrumentMap = new TreeMap<String,Object>();
		
		instrumentMap.put("NAME", this.getName());
		instrumentMap.put("IDENTIFIER", this.getIdentifier());
		instrumentMap.put("ASSETTYPE", this.getAssetType());
		instrumentMap.put("DATETIME", this.getDateTime());
		instrumentMap.put("PRICE", this.getPrice());
		instrumentMap.put("COMPANY", this.getCompany());
		instrumentMap.put("TICKER", this.getTicker());
		instrumentMap.put("VOLUME",this.getVolume());
		instrumentMap.put("COST",this.getCost());
		
		return instrumentMap; 
		
	}

	@Override
	public String toString() {
		return "Equity [company=" + company + ", ticker=" + ticker + ", toString()=" + super.toString() + "]";
	}
	
	

}
