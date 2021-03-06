package com.local.financialtest;

import com.local.lessson.financialclass.Portfolio;
import com.local.lessson.financialclass.financialexception.PortfolioException;
import com.local.lessson.financialclass.Equity;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PortfolioTest {

	//lessons use try catch to catch errors instead throws
	
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
		try {
		portfolio.appendEquity(bx);
		}
		catch(PortfolioException e){
			Map actual = portfolio.getPortfolio();
			Map<String,Equity> expected = new TreeMap<String,Equity>();		
			assertEquals(expected,actual);
		}
	}
	
	@Test
	void testNullAppendEquityThrowsException() throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		Equity bx = null;
		Assertions.assertThrows(PortfolioException.class, () -> {portfolio.appendEquity(bx);});
	}
	
	@Test
	void testAppendEquity() throws PortfolioException{
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
	void testAppendEquityUpdateCapital() throws PortfolioException{
		Portfolio portfolio = new Portfolio(new Double (1000000));
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX",10000);
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR",5000);
		portfolio.appendEquityCapital(bx);
		portfolio.appendEquityCapital(kkr);
		Double actual = portfolio.getCapital();
		Double expected = new Double(403450.00);
		assertEquals(expected,actual);
	}
	
	@Test
	void testAppendEquityUpdateCapitalInsufficientfund() throws PortfolioException{
		Portfolio portfolio = new Portfolio(new Double (1000000));
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX",10000);
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR",50000);
		portfolio.appendEquityCapital(bx);
		Assertions.assertThrows(PortfolioException.class, () -> {portfolio.appendEquityCapital(kkr);});
	}
	
	@Test
	void testAppendEquityUpdateCapitalInsufficientfundThrowNull() throws PortfolioException{
		Portfolio portfolio = new Portfolio(new Double (1000000));
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX",10000);
		Equity kkr = null;
		portfolio.appendEquityCapital(bx);
		Assertions.assertThrows(PortfolioException.class, () -> {portfolio.appendEquityCapital(kkr);});
	}
	
	
	@Test
	void testRemoveEquity() throws PortfolioException{
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
	
	@Test
	void testRemoveEquityKeyIsNull() throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR");
		portfolio.appendEquity(bx);
		portfolio.appendEquity(kkr);
		String ticker = null;
		Assertions.assertThrows(NullPointerException.class, () -> {portfolio.removeEquity(ticker);});
	}
	
	
	@Test
	void testTickerDNERemoveEquity()throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		portfolio.appendEquity(bx);
		String ticker = "GS";
		Assertions.assertThrows(PortfolioException.class, () -> {portfolio.removeEquity(ticker);});
	}
	
	@Test
	void testNonExistentTickerRemoveEquity() throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR");
		portfolio.appendEquity(bx);
		portfolio.appendEquity(kkr);
		Portfolio testPortfolio = new Portfolio();
		testPortfolio.appendEquity(bx);
		testPortfolio.appendEquity(kkr);
		try {
		portfolio.removeEquity("GS");
		}catch(PortfolioException e) {
		assertEquals(portfolio.getPortfolio(),testPortfolio.getPortfolio());
		}
		
	}
	
	@Test
	void testFindEquityreturnsNullThroughTryCatch()throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		Equity actual = null;
		try {
		actual = portfolio.findEquity("GS");
		}catch(PortfolioException e) {
		Equity expected = null;
		assertEquals(expected,actual);
		}
	}
	@Test
	void testFindEquityreturnsPortfolioException()throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		Equity actual = null;
		Assertions.assertThrows(PortfolioException.class,() -> {portfolio.findEquity("GS");});
	}
	
	
	@Test
	void testFindEquityreturnsEquity() throws PortfolioException{
		Portfolio portfolio = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		Equity kkr = new Equity("KKR-EQT","KKR",new Double(23.25),"EQUITY",dateTime,"KKR","KKR");
		portfolio.appendEquity(bx);
		portfolio.appendEquity(kkr);
		Equity actual = portfolio.findEquity(bx.getTicker());
		Equity expected = bx;
		assertEquals(expected,actual);
	}
	
	
	@Test
	void testUpdateEquityNullreturnsvoid(){
		Portfolio actual = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		try {
			actual.appendEquity(bx);
		} catch (PortfolioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Equity nullEq = null;
		String bxTicker = bx.getTicker();
		try {
			actual.updateEquity(bxTicker, nullEq);
		} catch (PortfolioException e1) {
			// TODO Auto-generated catch block
			Portfolio expected = new Portfolio();
			try {
				expected.appendEquity(bx);
			} catch (PortfolioException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			assertEquals(expected.getPortfolio(),actual.getPortfolio());
		}
	}
	
	@Test
	void testUpdateEquityStrNullStringreturnsvoid() {
		Portfolio actual = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		try {
			actual.appendEquity(bx);
		} catch (PortfolioException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Equity equity = bx;
		String nullTicker = null;
		try {
			actual.updateEquity(nullTicker, equity);
		} catch (PortfolioException e) {
			Portfolio expected = new Portfolio();
			try {
				expected.appendEquity(bx);
			} catch (PortfolioException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			assertEquals(expected.getPortfolio(),actual.getPortfolio());
		}
	}
	
	@Test
	void testUpdateEquityStringreturnsvoid() throws PortfolioException{
		Portfolio actual = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		actual.appendEquity(bx);
		Equity equity = bx;
		String ticker = "BX";
		actual.updateEquity(ticker, equity);
		Portfolio expected = new Portfolio();
		expected.appendEquity(bx);
		assertEquals(expected.getPortfolio(),actual.getPortfolio());
	}
	
	@Test
	void testUpdateEquity_EquityNull_Throws_PortfolioExeption(){
		Portfolio actual = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		try {
			actual.appendEquity(bx);
		} catch (PortfolioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertThrows(PortfolioException.class, () -> {actual.updateEquity("BX", null);});
		
	}
	
	@Test
	void testUpdateEquity_Null_Ticker_Throws_PortfolioExeption(){
		Portfolio actual = new Portfolio();
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,14,17,00,00);
		Equity bx = new Equity("BLACKSTONE-EQT","BX-W",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX");
		try {
			actual.appendEquity(bx);
		} catch (PortfolioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertThrows(PortfolioException.class, () -> {actual.updateEquity(null, new Equity("BLACKSTONE-EQT","BX",new Double(48.03),"EQUITY",dateTime,"BLACKSTONE","BX"));});
		
	}
	
	@Test
	void testCapitalConstructor(){
		Portfolio actual = new Portfolio(new Double(500000));
		assertTrue(actual instanceof Portfolio);
	}

	@Test
	void testGetCapital(){
		Portfolio portfolio = new Portfolio(new Double(1000000));
		Double actual = portfolio.getCapital();
		Double expected = new Double(1000000);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetCapital(){
		Portfolio portfolio = new Portfolio(new Double(1000000));
		portfolio.setCapital(new Double(2000000));
		Double actual = portfolio.getCapital();
		Double expected = new Double(2000000);
		assertEquals(expected,actual);
	}
	
	@Test
	void testDepositCapitalIncreaseCapital() throws PortfolioException {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
		portfolio.depositCapital(new Double(5000.00));
		Double actual = portfolio.getCapital();
		Double expected = new Double(10000.00);
		assertEquals(expected,actual);
	}
	
	@Test
	void testDepositCapital001IncreaseCapital() throws PortfolioException {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
		portfolio.depositCapital(new Double(0.01));
		Double actual = portfolio.getCapital();
		Double expected = new Double(5000.01);
		assertEquals(expected,actual);
	}
	
	@Test
	void testDepositCapital000IncreaseCapital() {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
		try {
			portfolio.depositCapital(new Double(0.00));
		} catch (PortfolioException e) {
			Double actual = portfolio.getCapital();
			Double expected = new Double(5000.00);
			assertEquals(expected,actual);
		}
	}
	
	
	@Test
	void testDepositCapitalIncrease_NegativeDepositCapital() {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
			Assertions.assertThrows(PortfolioException.class,() -> {portfolio.depositCapital(new Double(-5000.00));}  );
	}
	
	@Test
	void testWithdrawCapitalIncreaseCapital() throws PortfolioException {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
		portfolio.withdrawCapital(new Double(4000.00));
		Double actual = portfolio.getCapital();
		Double expected = new Double(1000.00);
		assertEquals(expected,actual);
	}
	
	@Test
	void testWithdrawCapital001IncreaseCapital() throws PortfolioException {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
		portfolio.withdrawCapital(new Double(0.01));
		Double actual = portfolio.getCapital();
		Double expected = new Double(4999.99);
		assertEquals(expected,actual);
	}
	
	@Test
	void testWithdrawCapitalIncrease_NegativeDepositCapital() {
		Portfolio portfolio = new Portfolio(new Double(5000.00));
			Assertions.assertThrows(PortfolioException.class,() -> {portfolio.withdrawCapital(new Double(-1000.00));}  );
	}

}


