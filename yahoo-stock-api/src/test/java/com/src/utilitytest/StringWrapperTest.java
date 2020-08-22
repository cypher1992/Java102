package com.src.utilitytest;

import com.src.utility.StringWrapper;
import com.src.utility.csexception.MapSetSizeZero;
import com.src.utility.csexception.MapSizeZero;
import com.src.utility.csexception.SetSizeZero;


import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import junit.framework.Assert;
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
	
	@Test
	public void testEmptySetAppendStringReturnsEmptyString(){
		Set<String> keySet = Collections.<String>emptySet(); 
		StringWrapper sw = new StringWrapper();
		String actual = null;
		Assertions.assertThrows(SetSizeZero.class, () -> {
			sw.appendKey(keySet);
			}
		);
	}
	
	public void testSetOneValueAppendStringReturnsString(){
		Set<String> keySet = new HashSet<String>(); 
		keySet.add("BX");
		StringWrapper sw = new StringWrapper();
		String actual = null;
		try {
			actual = sw.appendKey(keySet);
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( BX )";
		assertEquals(actual,expected);
	}
	
	
	public void testSetTwoValueAppendStringReturnsString(){
		Set<String> keySet = new HashSet<String>(); 
		keySet.add("BX");
		keySet.add("MUFA");
		StringWrapper sw = new StringWrapper();
		String actual = null;
		try {
			actual = sw.appendKey(keySet);
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( BX, MUFA )";
		assertEquals(actual,expected);
	}
	
	
	public void testSetThreeValueAppendStringReturnsEmptyString(){
		Set<String> keySet = new TreeSet<String>(); 
		keySet.add("BX");
		keySet.add("MUFA");
		keySet.add("WFC");
		StringWrapper sw = new StringWrapper();
		String actual = null;
		try {
			actual = sw.appendKey(keySet);
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( BX, MUFA, WFC )";
		assertEquals(actual,expected);
	}
	
	
	public void testSetFourValueappendKeyValueReturnsEmptyString(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		keySet.add("BX");
		keySet.add("MUFA");
		keySet.add("WFC");
		keySet.add("GS");
		StringWrapper sw = new StringWrapper();
		String actual = null;
		try {
			actual = sw.appendKey(keySet);
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( BX, MUFA, WFC, GS )";
		assertEquals(actual,expected);
	}
	
	public void testEmptyKeyMapSetKeyAppendKeyValueThrowSetSizeZeroException(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		StringWrapper sw = new StringWrapper();
		Assertions.assertThrows(MapSetSizeZero.class, () -> {
			sw.appendKeyValue(keySet, keyMap);
			}
		);
	}
	
	// need to add new exception if map is empty

	
	public void testEmptyMapSetKeyAppendKeyValueThrowSetSizeZeroException(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		keySet.add("BX");
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		StringWrapper sw = new StringWrapper();
		Assertions.assertThrows(MapSizeZero.class, () -> {
			sw.appendKeyValue(keySet, keyMap);
			}
		);
	}
	
	/*
	public void testappendKeyValueReturnsOneString(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		int bxNum = 1;
		keySet.add("BX");
		keyMap.put("BX", bxNum);
		StringWrapper sw = new StringWrapper();
		try {
			actual = sw.appendKeyValue(keySet, keyMap);
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( '1' )";
		assertEquals(actual,expected);
	}
	*/
		
}
