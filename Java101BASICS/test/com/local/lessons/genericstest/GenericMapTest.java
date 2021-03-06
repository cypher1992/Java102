package com.local.lessons.genericstest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.local.lessons.generics.GenericMapClass;

class GenericMapTest {

	@Test
	void testIfObjectIsInstanceOfGenericMapClass() {
		GenericMapClass gmc = new GenericMapClass();
		Boolean isInstanceOfGMC = gmc instanceof GenericMapClass;
		assertTrue(isInstanceOfGMC);
	}
	
	@Test
	void testIfObjectIsInstanceOfGenericMapClassParam() {
		GenericMapClass gmc = new GenericMapClass(new String("BX"), new Double(55.00));
		Boolean isInstanceOfGMC = gmc instanceof GenericMapClass;
		assertTrue(isInstanceOfGMC);
	}
	
	@Test
	void testifKeyIsAString(){
		GenericMapClass gmc = new GenericMapClass(new String("BX"), new Double(55.00));
		Boolean isInstanceOfString = gmc.getKey() instanceof String;
		assertTrue(isInstanceOfString);
	}
	
	@Test
	void testifValueIsADouble(){
		GenericMapClass gmc = new GenericMapClass(new String("BX"), new Double(55.00));
		Boolean isInstanceOfDouble = gmc.getValue() instanceof Double;
		assertTrue(isInstanceOfDouble);
	}
	
	
	@Test
	void testifKeyIsACharacter(){
		GenericMapClass gmc = new GenericMapClass(new Character('X'), new Integer(55));
		Boolean isInstanceOfCharacter = gmc.getKey() instanceof Character;
		assertTrue(isInstanceOfCharacter);
	}

}
