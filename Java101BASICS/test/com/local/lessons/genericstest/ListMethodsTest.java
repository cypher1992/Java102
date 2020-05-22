package com.local.lessons.genericstest;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.local.lessons.generics.ListMethods;

class ListMethodsTest {

	
	@Test
	void testAddVarArgsReturnsNullListOfString() {
		ListMethods lm = new ListMethods();
		String[] strs = new String[3];
		strs[0] = null;
		strs[1] = null;
		strs[2] = null;
		List<String> actual = lm.add(strs);
		List<String> expected = new ArrayList<String>();
		for(String str:strs){
			expected.add(str);
		}
		assertEquals(expected,actual);
	}
	
	@Test
	void testAddVarArgsReturnsListOfString() {
		ListMethods lm = new ListMethods();
		String[] strs = new String[3];
		strs[0] = "BX";
		strs[1] = "BAC";
		strs[2] = "WFC";
		List<String> actual = lm.add(strs);
		List<String> expected = new ArrayList<String>();
		for(String str:strs){
			expected.add(str);
		}
		assertEquals(expected,actual);
	}
	
	@Test
	void testAddVarArgsReturnsIsATypeofListString() {
		ListMethods lm = new ListMethods();
		String[] strs = new String[3];
		strs[0] = "BX";
		strs[1] = "BAC";
		strs[2] = "WFC";
		String str = lm.add(strs).get(0);
		Boolean isStrOfString = str instanceof String ;
		assertTrue(isStrOfString);
	}
	
	
	@Test
	void testAddVarArgsReturnsIsATypeofListDouble() {
		ListMethods lm = new ListMethods();
		Double[] doub = new Double[3];
		doub[0] = new Double(55.16);
		doub[1] = new Double(55.15);
		doub[2] = new Double(55.14);
		Double doubValue = lm.add(doub).get(0);
		Boolean isDoubValueOfDouble = doubValue instanceof Double ;
		assertTrue(isDoubValueOfDouble);
	}

	
	@Test
	void testAddVarArgsReturnsIsATypeofListBigDecimal() {
		ListMethods lm = new ListMethods();
		BigDecimal[] bg = new BigDecimal[3];
		bg[0] = new BigDecimal(55.1664);
		bg[1] = new BigDecimal(55.1554);
		bg[2] = new BigDecimal(55.1444);
		BigDecimal bgValue = lm.add(bg).get(2);
		Boolean isBgValueOfBigDecimal = bgValue instanceof BigDecimal ;
		assertTrue(isBgValueOfBigDecimal);
	}
}
