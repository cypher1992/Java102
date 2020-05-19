package com.local.lessons.genericstest;

import static org.junit.jupiter.api.Assertions.*;

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
	
	

}