package com.local.financialtest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;
import com.local.lessson.financialclass.interfacexchange.NYSE;
import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.interfacexchange.Exchange;

class NYSETest {

	
	Double price = new Double(52.87);
	LocalDateTime dateTime = LocalDateTime.of(2020,Month.MAY,9,17,00,00);
	Equity blackstone = new Equity("BLACKSTONE-EQT","BX-W",price,"EQUITY",dateTime,"BLACKSTONE","BX");
	
	@Test
	void testIsInstanceOfNYSE() {
		NYSE nyse = NYSE.getInstance();
		assertTrue(nyse instanceof NYSE);
	}
	
	@Test
	void testNYSEIsInstanceOfExchange() {
		NYSE nyse = NYSE.getInstance();
		assertTrue(nyse instanceof Exchange);
	}
	
	@Test
	void testInstanceIsSingleton() {
		NYSE actual = NYSE.getInstance();
		NYSE expected = NYSE.getInstance();
		assertTrue(actual == expected);
	}
	
	@Test
	void testListingReturnsactiveStocks() {
		NYSE nyse = NYSE.getInstance();
		Map<String,Equity> actual = nyse.listing();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		assertEquals(expected,actual);
	}
	
	@Test
	void testAddEquityToMapReturnsMapWithEquity(){
		NYSE nyse = NYSE.getInstance();
		Map<String,Equity> actual = nyse.getActiveStocks();
		nyse.add(nyse.getActiveStocks(), blackstone.getTicker(), blackstone);
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		expected.put(blackstone.getTicker(), blackstone);
		assertEquals(expected,actual);
	}
	
	@Test
	void testAddNullStringEquityToMapReturnsMapWithEquity(){
		NYSE nyse = NYSE.getInstance();
		Double price = new Double(52.87);
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.MAY,9,17,00,00); 	
		nyse.add(nyse.getActiveStocks(), null, blackstone);
		Map<String,Equity> actual = nyse.getActiveStocks();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		expected.put(blackstone.getTicker(), blackstone);
		assertEquals(actual.toString(),expected.toString());
	}
	
	@Test
	void testremoveNullTickerNoChangesToMap(){
		NYSE nyse = NYSE.getInstance();
		Double price = new Double(52.87);
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.MAY,9,17,00,00); 	
		nyse.remove(nyse.getActiveStocks(), null);
		Map<String,Equity> actual = nyse.getActiveStocks();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		expected.put(blackstone.getTicker(), blackstone);
		assertEquals(actual.toString(),expected.toString());
	}
	
	
	@Test
	void testremoveNullListingNoChangesToMap(){
		NYSE nyse = NYSE.getInstance();
		Double price = new Double(52.87);
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.MAY,9,17,00,00); 	
		nyse.remove(nyse.getTestStocksListing(), blackstone.getTicker());
		Map<String,Equity> actual = nyse.getTestStocksListing();
		Map<String,Equity> expected = null;
		assertEquals(actual,expected);
	}
	
	@Test
	void testremoveEquityListingNoChangesToMap(){
		NYSE nyse = NYSE.getInstance();
		Double price = new Double(52.87);
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.MAY,9,17,00,00); 	
		nyse.remove(nyse.getActiveStocks(), blackstone.getTicker());
		Map<String,Equity> actual = nyse.getActiveStocks();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		assertEquals(actual.toString(),expected.toString());
	}
	
	
	

}
