package com.src.yahoofinancstock.yahoo_stock_api;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;


public class StockData 
{
	private Map<String,Object> stats = new TreeMap<String,Object>();
	private Map<String,Object> historicalTrades = new TreeMap<String,Object>();
	private String ticker; 
	// Need to observe Calendar date to getHistory for YahooFinance to work
	private Calendar date; 
	
	public StockData(String ticker){
		this.ticker = ticker;
		this.date = Calendar.getInstance();
	}
	
	public Map getStockStats(){
		
		Long outstandingShares = null;
		BigDecimal pe = null;
		BigDecimal eps = null;
		BigDecimal ebitda = null;
		try {
			outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			pe = YahooFinance.get(ticker).getStats().getPe();
			eps = YahooFinance.get(ticker).getStats().getEps();
			ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		stats.put("OUTSTANDINGSHARES", outstandingShares);
		stats.put("PRICETOEARNING", pe);
		stats.put("EARNINGPERSHARE", eps);
		stats.put("EBITDA", ebitda);
		return stats;
		
	}
	
	public Map getStockHistoricalTrades(){
		
		List<HistoricalQuote> list = null;
		 try {
			list = YahooFinance.get(this.ticker).getHistory();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 SimpleDateFormat formatDate = new SimpleDateFormat("MMM-dd-yyyy");
		 String  simpleDate = formatDate.format(list.get(0).getDate().getTime());
		 Map<String,Object> tradeDate = new TreeMap<String,Object>(); 
		 tradeDate.put("HIGH", list.get(0).getHigh());
		 tradeDate.put("LOW", list.get(0).getLow());
		 tradeDate.put("CLOSE",list.get(0).getClose());
		 tradeDate.put("OPEN",list.get(0).getOpen());
		 tradeDate.put("VOLUME",list.get(0).getVolume());
		 historicalTrades.put(simpleDate,tradeDate);
		 System.out.println(historicalTrades);
		 
		 return historicalTrades;
	}
  
}
