package com.local.persistence.stockstest;

import static org.junit.jupiter.api.Assertions.*;
import yahoofinance.*;
import java.math.BigDecimal;

import com.local.lessons.persistence.stocks.*;
import com.local.lessons.persistence.stocks.Stock;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void testIsInstanceOfStockIsTrue() {
		Stock appl = new Stock("APPL");
		Boolean isInstanceOfStock = appl instanceof Stock;
		assertTrue(isInstanceOfStock);
	}
	

	
	

}
