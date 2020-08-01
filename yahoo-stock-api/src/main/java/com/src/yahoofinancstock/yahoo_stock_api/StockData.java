package com.src.yahoofinancstock.yahoo_stock_api;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.text.SimpleDateFormat;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;


public class StockData 
{
	private Map<String,Object> stats = new TreeMap<String,Object>();
	private Map<String,Object> historicalTrades = new LinkedHashMap<String,Object>();
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
		BigDecimal bookValuePerShare = null;
		try {
			outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			pe = YahooFinance.get(ticker).getStats().getPe();
			eps = YahooFinance.get(ticker).getStats().getEps();
			ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			bookValuePerShare = YahooFinance.get(ticker).getStats().getBookValuePerShare();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		stats.put("OUTSTANDINGSHARES", outstandingShares);
		stats.put("PRICETOEARNING", pe);
		stats.put("EARNINGPERSHARE", eps);
		stats.put("EBITDA", ebitda);
		stats.put("BOOKVALUEPS", bookValuePerShare );
		return stats;
		
	}
	
	public Map getStockHistoricalTrades(){
		
		List<HistoricalQuote> listOfTrades = null;
		 try {
			listOfTrades = YahooFinance.get(this.ticker).getHistory();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 SimpleDateFormat formatDate = new SimpleDateFormat("MMM-dd-yyyy");
		 for (HistoricalQuote trade:listOfTrades) {
			 String  simpleDate = formatDate.format(trade.getDate().getTime());
			 Map<String,Object> tradeDate = new TreeMap<String,Object>(); 
			 tradeDate.put("HIGH", trade.getHigh());
			 tradeDate.put("LOW", trade.getLow());
			 tradeDate.put("CLOSE",trade.getClose());
			 tradeDate.put("OPEN", trade.getOpen());
			 tradeDate.put("VOLUME",trade.getVolume());
			 historicalTrades.put(simpleDate,tradeDate);
		 }
		 
		 return historicalTrades;
	}
	
	public Map getStockHistoricalTrades(Calendar from,Calendar to,Interval inter){
		
		List<HistoricalQuote> listOfTrades = null;
		 try {
			listOfTrades = YahooFinance.get(this.ticker).getHistory(from,to,inter);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 SimpleDateFormat formatDate = new SimpleDateFormat("MMM-dd-yyyy");
		 for (HistoricalQuote trade:listOfTrades) {
			 String  simpleDate = formatDate.format(trade.getDate().getTime());
			 Map<String,Object> tradeDate = new TreeMap<String,Object>(); 
			 tradeDate.put("HIGH", trade.getHigh());
			 tradeDate.put("LOW", trade.getLow());
			 tradeDate.put("CLOSE",trade.getClose());
			 tradeDate.put("OPEN", trade.getOpen());
			 tradeDate.put("VOLUME",trade.getVolume());
			 historicalTrades.put(simpleDate,tradeDate);
		 }
		 
		 return historicalTrades;
	}
  
}
