package com.src.utilitytest;

import com.src.utility.StringWrapper;

import junit.framework.TestCase;

public class StringWrapperTest extends TestCase {
	
	public void testIsInstanceOfStockData() {
		StringWrapper sw = new StringWrapper();
		Boolean isInstanceOfStringWrapper = sw instanceof StringWrapper ;
		assertTrue(isInstanceOfStringWrapper);
	}

}
