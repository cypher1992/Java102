package com.local.financialtest;

import com.local.lessson.financialclass.Portfolio;
import com.local.lessson.financialclass.Equity;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class PortfolioTest {

	@Test
	void testPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		assertTrue(testPortfolio instanceof Portfolio);
	}

	@Test
	void testGetPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		Map actual = testPortfolio.getPortfolio();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		assertEquals(expected,actual);
	}

	@Test
	void testSetPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		Map<String,Equity> newPortfolio = new TreeMap<String,Equity>();
		testPortfolio.setPortfolio(newPortfolio);
		Map actual = testPortfolio.getPortfolio();
		Map expected = new TreeMap<String,Equity>();
		assertEquals(expected,actual);
	}

	@Test
	void testNullAppendEquity(){
		Portfolio portfolio = new Portfolio();
		Equity bx = null;
		portfolio.appendEquity(bx);
		Map actual = portfolio.getPortfolio();
		Map<String,Equity> expected = new TreeMap<String,Equity>();		
		assertEquals(expected,actual);
	}
	
	@Test
	void testAppendEquity(){
		//Need to work on comparison logic or compareto
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		portfolio.appendEquity(bx);
		Map actual = portfolio.getPortfolio();
		Map<String,Equity> expected = new TreeMap<String,Equity>();		
		expected.put(bx.getTicker(),bx);
		assertEquals(expected,actual);
	}
	
	@Test
	void testRemoveEquity(){
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR");
		portfolio.appendEquity(bx);
		portfolio.appendEquity(kkr);
		Portfolio testPortfolio = new Portfolio();
		testPortfolio.appendEquity(bx);
		portfolio.removeEquity(kkr.getTicker());
		assertEquals(portfolio.getPortfolio(),testPortfolio.getPortfolio());
		
	}
	
}
