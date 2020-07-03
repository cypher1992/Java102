package com.local.persistence.stockstest;

import static org.junit.jupiter.api.Assertions.*;
import yahoofinance.*;

import java.io.IOException;
import java.math.BigDecimal;

import com.local.lessons.persistence.stocks.*;
import com.local.lessons.persistence.stocks.Stock;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void testIsInstanceOfStockIsTrue() throws IOException {
		Stock appl = new Stock("APPL");
		Boolean isInstanceOfStock = appl instanceof Stock;
		assertTrue(isInstanceOfStock);
	}
	

	
	

}
