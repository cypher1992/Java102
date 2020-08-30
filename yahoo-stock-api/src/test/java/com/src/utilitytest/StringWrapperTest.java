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
		String expected = "( BX, INSERT_TS )";
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
		String expected = "( BX, MUFA, INSERT_TS )";
		assertEquals(actual,expected);
	}
	
	
	public void testSetThreeValueAppendStringReturnsFourObjects(){
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
		String expected = "( BX, MUFA, WFC, INSERT_TS )";
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
		
	public void testEmptyMapAppendKeyValueThrowMapSizeZeroException(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		keySet.add("BX");
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		StringWrapper sw = new StringWrapper();
		Assertions.assertThrows(MapSizeZero.class, () -> {
			sw.appendKeyValue(keySet, keyMap);
			}
		);
	}
	
	public void testEmptySetAppendKeyValueThrowSetSizeZeroException(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		Double price = new Double(50.00);
		keyMap.put("BX", price);
		StringWrapper sw = new StringWrapper();
		Assertions.assertThrows(SetSizeZero.class, () -> {
			sw.appendKeyValue(keySet, keyMap);
			}
		);
	}
	

	public void testappendKeyValueReturnsTwoObject(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		int bxNum = 1;
		keySet.add("BX");
		keyMap.put("BX", bxNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( '1', sysdate )";
		assertEquals(actual,expected);
	}

	
	public void testappendKeyNullValueReturnsTwoObject(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		Double bxNum = null;
		keySet.add("BX");
		keyMap.put("BX", bxNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( null, sysdate )";
		assertEquals(actual,expected);
	}
	
	public void testappendKeyValueReturnsThreeValueString(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		Double bxNum = (50.20);
		Double jpmNum = (74.20);
		keySet.add("BX");
		keySet.add("JPM");
		keyMap.put("BX", bxNum);
		keyMap.put("JPM", jpmNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( '50.2', '74.2', sysdate )";
		assertEquals(actual,expected);
	}
	
	public void testappendKeyNullValueReturnsTwoValueString(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		Double bxNum = null;
		Double jpmNum = (74.20);
		keySet.add("BX");
		keySet.add("JPM");
		keyMap.put("BX", bxNum);
		keyMap.put("JPM", jpmNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( null, '74.2', sysdate )";
		assertEquals(actual,expected);
	}
	
	public void testappendKeyReverseNullValueReturnsThreeObjects(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		Double bxNum = (74.20);
		Double jpmNum = null;
		keySet.add("BX");
		keySet.add("JPM");
		keyMap.put("BX", bxNum);
		keyMap.put("JPM", jpmNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( '74.2', null, sysdate )";
		assertEquals(actual,expected);
	}
	
	
	public void testappendKeyNullValueReturnsThreeValueString(){
		Set<String> keySet = new LinkedHashSet<String>(); 
		Map<String,Object> keyMap = new TreeMap<String,Object>();
		String actual = null;
		Double bxNum = (74.20);
		Double jpmNum = null;
		Double cNum = (81.30);
		keySet.add("BX");
		keySet.add("JPM");
		keySet.add("C");
		keyMap.put("BX", bxNum);
		keyMap.put("JPM", jpmNum);
		keyMap.put("C", cNum);
		StringWrapper sw = new StringWrapper();
		try {
			try {
				actual = sw.appendKeyValue(keySet, keyMap);
			} catch (MapSetSizeZero | MapSizeZero e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SetSizeZero e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected = "( '74.2', null, '81.3', sysdate )";
		assertEquals(actual,expected);
	}
		
}
