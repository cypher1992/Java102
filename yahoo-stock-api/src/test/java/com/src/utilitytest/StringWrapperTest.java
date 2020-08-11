package com.src.utilitytest;

import com.src.utility.StringWrapper;
import java.util.Map;
import java.util.TreeMap;

import junit.framework.TestCase;

public class StringWrapperTest extends TestCase {
	
	public void testIsInstanceOfStringWrapper() {
		StringWrapper sw = new StringWrapper();
		Boolean isInstanceOfStringWrapper = sw instanceof StringWrapper ;
		assertTrue(isInstanceOfStringWrapper);
	}

	
	public void testStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		double price = 50.00;
		tm.put("PRICE", price);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", "'" + price + "' ");
		
		assertEquals(actual,expected);
	}
	
	public void testNullStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		Double price = null;
		tm.put("PRICE", price);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", null);
		
		assertEquals(actual,expected);
	}
	
	public void testMultiKeyMapStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		Double price = null;
		Double price2 = 50.00;
		tm.put("PRICE", price);
		tm.put("PRICE2", price2);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", null + ", ");
		expected.put("PRICE2", "'" + price2 + "' ");
		
		assertEquals(actual,expected);
	}
	
	public void testMultiKeyNullsMapStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		Double price = null;
		Double price2 = null;
		tm.put("PRICE", price);
		tm.put("PRICE2", price2);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", price + ", ");
		expected.put("PRICE2", price2 );
		
		assertEquals(actual,expected);
	}
	
	public void testMultiKeyStringsMapStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		String price = "50.00";
		String price2 = "20.00";
		tm.put("PRICE", price);
		tm.put("PRICE2", price2);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", "'"+ price + "', ");
		expected.put("PRICE2", "'" +price2 + "' " );
		
		assertEquals(actual,expected);
	}
	
	public void testMultiKeyStrNullsMapStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		String price = "50.00";
		String price2 = null;
		String price3 = "20.00";
		tm.put("PRICE", price);
		tm.put("PRICE2", price2);
		tm.put("PRICE3", price3);
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		expected.put("PRICE", "'"+ price + "', ");
		expected.put("PRICE2", "" +price2 + ", " );
		expected.put("PRICE3", "'"+ price3 + "' ");
		
		assertEquals(actual,expected);
	}
	
	public void testEmptyKeyMapStringSingleQuoteMapReturnsMapOfSingleQuotes() {
		StringWrapper sw = new StringWrapper();
		Map tm = new TreeMap<String,Object>();
		Map actual = sw.StringSingleQuoteMap(tm);
		Map expected = new TreeMap<String,Object>();
		assertEquals(actual,expected);
	}

}
