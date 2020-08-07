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
		expected.put("PRICE", "'" + price + "'");
		
		assertEquals(actual,expected);
	}

}
