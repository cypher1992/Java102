package com.src.yahoofinancstock.yahoo_stock_api;

import junit.framework.Test;
import com.src.yahoofinancstock.yahoo_stock_api.StockData;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
}
