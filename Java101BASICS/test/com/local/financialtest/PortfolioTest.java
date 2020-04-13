package com.local.financialtest;

import com.local.lessson.financialclass.Portfolio;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PortfolioTest {

	@Test
	void testPortfolio() {
		Portfolio testPortfolio = new Portfolio();
		assertTrue(testPortfolio instanceof Portfolio);
	}

	@Test
	void testGetPortfolio() {
		fail("Not yet implemented");
	}

	@Test
	void testSetPortfolio() {
		fail("Not yet implemented");
	}

}
