package com.local.lessons.genericstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.local.lessons.generics.GenericMapClass;

class GenericMapTest {

	@Test
	void testIfobjectIsInstanceOfGenericMapClass() {
		GenericMapClass gmc = new GenericMapClass();
		Boolean isInstanceOfGMC = gmc instanceof GenericMapClass;
		assertTrue(isInstanceOfGMC);
	}
	
	@Test
	void testIfobjectIsInstanceOfGenericMapClassParam() {
		GenericMapClass gmc = new GenericMapClass(new String("BX"), new Double(55.00));
		Boolean isInstanceOfGMC = gmc instanceof GenericMapClass;
		assertTrue(isInstanceOfGMC);
	}

}
