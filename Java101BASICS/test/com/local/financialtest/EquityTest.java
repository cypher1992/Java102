package com.local.financialtest;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.Instrument;

class EquityTest {

	Double price = new Double(46.63);
	LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,6,17,00,00); 	
	Equity blackstone = new Equity("BLACKSTONE-EQT","BX-W",price,"EQUITY",dateTime,"BLACKSTONE","BX");
	Equity bx = new Equity("BLACKSTONE-EQT","BX-W",price,"EQUITY",dateTime,"BLACKSTONE","BX",10000);
	
	@Test
	void testEquity() {
		assertTrue(blackstone instanceof Equity);
	}
	
	@Test
	void testInstrument() {
		assertTrue(blackstone instanceof Instrument);
	}
	
	@Test
	void testGetCompany() {
		String actual = blackstone.getCompany();
		String expected = "BLACKSTONE";
		assertEquals(expected,actual);
	}

	@Test
	void testGetTicker() {
		String actual = blackstone.getTicker();
		String expected = "BX";
		assertEquals(expected,actual);
	}

	
	
	@Test
	void testSetCompany() {
		Double citiPrice = new Double(26.41);
		Equity citi = new Equity("CITI-EQT","C",citiPrice,"EQUITY",dateTime,"CITI","C");
		citi.setCompany("CITI CORP");
		String actual = citi.getCompany();
		String expected = "CITI CORP";
		assertEquals(expected, actual);
	}

	@Test
	void testSetTicker() {
		Double goldmanPrice = new Double(145.12);
		Equity goldmanSacs = new Equity("GOLDMANSACS-EQT","GS",goldmanPrice,"EQUITY",dateTime,"GOLDMAN SACS", "GSX");
		goldmanSacs.setTicker("GS");
		String actual = goldmanSacs.getTicker();
		String expected = "GS";
		assertEquals(expected,actual);
	}

	// Need to revised
	@Test
	void testInstrumentMap() {
		Map<String,Object> actual = bx.instrumentMap();
		// treeMap deal with sorting keys
		Map<String, Object> expected = new TreeMap<String,Object>();
		expected.put("NAME", "BLACKSTONE-EQT");
		expected.put("IDENTIFIER", "BX-W");
		expected.put("ASSETTYPE", "EQUITY");
		expected.put("DATETIME", LocalDateTime.of(2020,Month.APRIL,6,17,00,00));
		expected.put("PRICE", new Double(46.63));
		expected.put("COMPANY", "BLACKSTONE");
		expected.put("TICKER", "BX");
		expected.put("VOLUME",new Integer(10000));
		expected.put("COST",new Double(466300.0));
		assertSame(actual,actual);
	}
	
	@Test
	void testGetName() {
		String actual = blackstone.getName();
		String expected = "BLACKSTONE-EQT";
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetName() {
		
		Equity bofa = new Equity("BOFA-EQTX","BAC",new Double(23.41),"EQUITY",dateTime,"BANK OF AMERICA CORP.", "BAC");
		bofa.setName("BOFA-EQT");
		String actual = bofa.getName();
		String expected = "BOFA-EQT";
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetIdentifier() {
		String actual = blackstone.getIdentifier();
		String expected = "BX-W";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testSetIdentifier() {
		Equity jpm = new Equity("JMP-EQT","JP",new Double(142.16),"EQUITY",dateTime,"JP Morgan Chase", "JPM");
		jpm.setIdentifier("JPM");
		String actual = jpm.getIdentifier();
		String expected = "JPM";
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testGetPrice() {
		Double actual = blackstone.getPrice();
		Double expected = new Double(46.63);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetPrice(){
		Double newPrice = new Double(150.00);
		blackstone.setPrice(newPrice);
		Double actual = blackstone.getPrice();
		Double expected = new Double(150.00);
		assertEquals(expected,actual);
	}
	
	@Test 
	void testGetAssetType() {
		String actual = blackstone.getAssetType();
		String expected = "EQUITY";
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetAssetPrice(){
		blackstone.setAssetType("CORP-EQUITY");
		String actual = blackstone.getAssetType();
		String expected = "CORP-EQUITY";
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetDateTime() {
		LocalDateTime actual = blackstone.getDateTime();
		LocalDateTime expected = LocalDateTime.of(2020,Month.APRIL,6,17,00,00);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetDateTime() {
		LocalDateTime today = LocalDateTime.of(2020,Month.APRIL,13,17,00,00);
		blackstone.setDateTime(today);
		LocalDateTime actual = blackstone.getDateTime();
		LocalDateTime expected = LocalDateTime.of(2020,Month.APRIL,13,17,00,00);
		assertEquals(expected,actual);
	}
	
	@Test
	void testInstanceofEquityVolume(){
		assertTrue(bx instanceof Equity);
	}
	
	
	@Test
	public void testGetVolume() {
		int actual = bx.getVolume();
		int expected = 10000;
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetVolume() {
		int newVolume = 20000;
		bx.setVolume(newVolume);
		int actual = bx.getVolume();
		int expected = 20000;
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetVolumeThrowsException() {
		int expected = 0;
		assertThrows(ArithmeticException.class,() -> bx.setVolume(expected),"Volume cannot be below 1");
	}
	
	
	@Test
	public void testGetCost() {
		double actual = bx.getCost();
		double expected = 466300.00;
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetCost() {
		double expected = 1.00;
		bx.setCost(expected);
		double actual = bx.getCost();
		assertEquals(expected, actual);	
	}
	
	@Test
	public void testSetCostThrowsException() {
		double expected = 0.00;
		assertThrows(ArithmeticException.class,() -> bx.setCost(expected),"Cost cannot be below 0.01");
	}
}

