package com.local.lessons.persistence.stocks;
import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.quotes.stock.StockStats;

public class Stock {

	private BigDecimal roe;
	private String ticker;
	
	public Stock(){
		super();
	}
	
	public Stock(String ticker){
		super();
		this.ticker = ticker;
		this.roe = this.getRoe();
	}
		
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public BigDecimal getRoe() {
		yahoofinance.Stock initStock = new yahoofinance.Stock(getTicker());
		StockStats stats = null;
		try {
			stats = initStock.getStats(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
		System.out.println(stats.getROE());
		return stats.getROE();
	}

	public void setRoe(BigDecimal roe) {
		this.roe = roe;
	}
	
	

}
