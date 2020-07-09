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
		StockData sd = new StockData("BX");
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
}
