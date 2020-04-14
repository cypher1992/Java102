package com.local.financialtest;

import com.local.lessson.financialclass.Portfolio;
import com.local.lessson.financialclass.Equity;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class PortfolioTest {

	@Test
	void testPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		assertTrue(testPortfolio instanceof Portfolio);
	}

	@Test
	void testGetPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		Map actual = testPortfolio.getPortfolio();
		Map<String,Equity> expected = new TreeMap<String,Equity>();
		assertEquals(expected,actual);
	}

	@Test
	void testSetPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		Map<String,Equity> newPortfolio = new TreeMap<String,Equity>();
		testPortfolio.setPortfolio(newPortfolio);
		Map actual = testPortfolio.getPortfolio();
		Map expected = new TreeMap<String,Equity>();
		assertEquals(expected,actual);
	}

}
