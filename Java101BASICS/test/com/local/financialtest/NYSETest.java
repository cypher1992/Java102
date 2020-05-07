package com.local.financialtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.local.lessson.financialclass.interfacexchange.NYSE;
import com.local.lessson.financialclass.interfacexchange.Exchange;

class NYSETest {

	@Test
	void testIsInstanceOfNYSE() {
		NYSE nyse = NYSE.getInstance();
		assertTrue(nyse instanceof NYSE);
	}
	
	@Test
	void testNYSEIsInstanceOfExchange() {
		NYSE nyse = NYSE.getInstance();
		assertTrue(nyse instanceof Exchange);
	}
	
	@Test
	void testInstanceIsSingleton() {
		NYSE actual = NYSE.getInstance();
		NYSE expected = NYSE.getInstance();
		assertTrue(actual == expected);
	}
	
	

}
