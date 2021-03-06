package com.local.lessson.financialclass.interfacexchange;

import java.util.Map;
import java.util.TreeMap;

import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.Instrument;

public class NYSE implements Exchange{
	
	private static NYSE INSTANCE;
	private  Map<String,Equity> activeStocks = new TreeMap<String,Equity>();
	private  Map<String,Equity> inactiveStocks = new TreeMap<String,Equity>();
	private  Map<String,Equity> testStocksListing = null;
	
	
	 private NYSE(){
		this.activeStocks = activeStocks;
		this.inactiveStocks = inactiveStocks;
	} 
	
	public static NYSE getInstance(){
		if(INSTANCE == null) {
			INSTANCE = new NYSE();
		}
		return INSTANCE;
	}
	
	public Map<String, Equity> getActiveStocks() {
		return activeStocks;
	}

	public void setActiveStocks(Map<String, Equity> activeStocks) {
		this.activeStocks = activeStocks;
	}

	public Map<String, Equity> getInactiveStocks() {
		return inactiveStocks;
	}

	public void setInactiveStocks(Map<String, Equity> inactiveStocks) {
		this.inactiveStocks = inactiveStocks;
	}
	
	public Map<String, Equity> getTestStocksListing() {
		return testStocksListing;
	}

	public void setTestStocksListing(Map<String, Equity> testStocksListing) {
		this.testStocksListing = testStocksListing;
	}

	@Override
	public Map<String, Equity> listing() {
		return this.activeStocks;
	}

	@Override
	public void add(Map<String,Equity> tgtMap,String ticker, Equity equity) {
		try {
				if(!(ticker.equals(null) || equity.equals(null) )) {
					tgtMap.put(ticker, equity); 
					this.setActiveStocks(tgtMap);
				}
		}catch(NullPointerException e) {
			System.out.println("Ticker or Equity can not be null");
		}
	}

	@Override
	public void remove(Map<String,Equity> tgtList,String ticker) {
		try {
			if(tgtList.containsKey(ticker)) {
				tgtList.remove(ticker);
			}else {
				System.out.println("Ticker does not exist.");
			}
		}catch(NullPointerException e) {
			System.out.println("Ticker or Listing cannot be null");
		}
	} 
	


}
