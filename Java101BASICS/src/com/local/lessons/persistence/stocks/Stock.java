package com.local.lessons.persistence.stocks;
import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.*;
import yahoofinance.quotes.stock.StockStats;

public class Stock {

	private BigDecimal roe;
	
	public Stock(){
		super();
	}
	
	public Stock(String ticker) throws IOException{
		super();
		yahoofinance.Stock initStock = new yahoofinance.Stock(ticker);
		StockStats stats = null;
		stats = initStock.getStats(false);
		this.roe = stats.getROE();
	}
	
	public BigDecimal getRoe() {
		return roe;
	}

	public void setRoe(BigDecimal roe) {
		this.roe = roe;
	}

}
