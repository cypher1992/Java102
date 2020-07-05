package com.src.yahoofinancstock.yahoo_stock_api;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;


public class StockData 
{
	private Map<String,Object> stats = new TreeMap<String,Object>();
	private String ticker; 
	
	public StockData(String ticker){
		this.ticker = ticker;
	}
	
	public Map getStockStats(){
		
		Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding()
		
		stats.put("OUTSTANDINGSHARES", outstandingShares);		
		return stats;
		
	}
	
  
}
