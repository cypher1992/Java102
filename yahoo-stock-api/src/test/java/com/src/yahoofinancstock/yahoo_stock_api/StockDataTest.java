package com.src.yahoofinancstock.yahoo_stock_api;

import junit.framework.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import com.src.yahoofinancstock.yahoo_stock_api.StockData;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Unit test for simple App.
 */
public class StockDataTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
  
	public void testIsInstanceOfStockData() {
		StockData sd = new StockData("BX");
		Boolean isInstanceOfStockData = sd instanceof StockData ;
		assertTrue(isInstanceOfStockData);
	}
	
	public void testBXStockStatData() {
		String ticker = "BX";
		StockData sd = new StockData(ticker);
		Map<String,Object> actual = sd.getStockStats();
		Map<String,Object> expected = new TreeMap<String,Object>();
		try {
			Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			BigDecimal pe = YahooFinance.get(ticker).getStats().getPe();
			BigDecimal eps = YahooFinance.get(ticker).getStats().getEps();
			BigDecimal ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			expected.put("OUTSTANDINGSHARES", outstandingShares);
			expected.put("PRICETOEARNING", pe);
			expected.put("EARNINGPERSHARE", eps);
			expected.put("EBITDA", ebitda);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expected,actual);
	}
	
	public void testBOFAStockStatData() {
		String ticker = "BAC";
		StockData sd = new StockData(ticker);
		Map<String,Object> actual = sd.getStockStats();
		Map<String,Object> expected = new TreeMap<String,Object>();
		try {
			Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			BigDecimal pe = YahooFinance.get(ticker).getStats().getPe();
			BigDecimal eps = YahooFinance.get(ticker).getStats().getEps();
			BigDecimal ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			expected.put("OUTSTANDINGSHARES", outstandingShares);
			expected.put("PRICETOEARNING", pe);
			expected.put("EARNINGPERSHARE", eps);
			expected.put("EBITDA", ebitda);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expected,actual);
	}
	
	public void testBLIAQStockStatData() {
		// this is blockbuster stock why is it still pull data for a company that do not exist
		String ticker = "BLIAQ";
		StockData sd = new StockData(ticker);
		Map<String,Object> actual = sd.getStockStats();
		Map<String,Object> expected = new TreeMap<String,Object>();
		try {
			Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			BigDecimal pe = YahooFinance.get(ticker).getStats().getPe();
			BigDecimal eps = YahooFinance.get(ticker).getStats().getEps();
			BigDecimal ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			expected.put("OUTSTANDINGSHARES", outstandingShares);
			expected.put("PRICETOEARNING", pe);
			expected.put("EARNINGPERSHARE", eps);
			expected.put("EBITDA", ebitda);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected,actual);
	}
	
	
	public void testLEHLQStockStatData() {
		// this is Lehman Brother is accurate since bankruptcy 
		String ticker = "LEHLQ";
		StockData sd = new StockData(ticker);
		Map<String,Object> actual = sd.getStockStats();
		Map<String,Object> expected = new TreeMap<String,Object>();
		try {
			Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			BigDecimal pe = YahooFinance.get(ticker).getStats().getPe();
			BigDecimal eps = YahooFinance.get(ticker).getStats().getEps();
			BigDecimal ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			expected.put("OUTSTANDINGSHARES", outstandingShares);
			expected.put("PRICETOEARNING", pe);
			expected.put("EARNINGPERSHARE", eps);
			expected.put("EBITDA", ebitda);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected,actual);
	}
	
	
	public void testPStockStatData() {
		// stock does not exist on liquidity centers 
		String ticker = "P";
		StockData sd = new StockData(ticker);
		Map<String,Object> actual = sd.getStockStats();
		Map<String,Object> expected = new TreeMap<String,Object>();
		try {
			Long outstandingShares = YahooFinance.get(ticker).getStats().getSharesOutstanding();
			BigDecimal pe = YahooFinance.get(ticker).getStats().getPe();
			BigDecimal eps = YahooFinance.get(ticker).getStats().getEps();
			BigDecimal ebitda = YahooFinance.get(ticker).getStats().getEBITDA();
			expected.put("OUTSTANDINGSHARES", outstandingShares);
			expected.put("PRICETOEARNING", pe);
			expected.put("EARNINGPERSHARE", eps);
			expected.put("EBITDA", ebitda);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected,actual);
	}
	// Not Working
	public void testBXGetStockHistoricalTrades(){
		String ticker = "BX";
		StockData bx = new StockData(ticker);
		Map<String,Object> actual = bx.getStockHistoricalTrades();
		Map<String,Object> expected = new TreeMap<String,Object>();
		assertEquals(actual,expected);
	}
}
