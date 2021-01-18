package fourpillars;

import static org.junit.jupiter.api.Assertions.*;
import fourpillar.*;
import org.junit.jupiter.api.Test;
import fourpillar.Portfolio;

class PortfolioTest {

	@Test
	void testInstanceOfPortfolio() {
		Portfolio portfolio = new Portfolio();
		assertTrue(portfolio instanceof Portfolio );
	}

	@Test
	void testSold() {
		Portfolio portfolio = new Portfolio();
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		String actual = portfolio.sold(appl);
		String expected = "Sold APPL";
		assertEquals(actual,expected);
	}
	

	@Test
	void testBuy() {
		Portfolio portfolio = new Portfolio();
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		String actual = portfolio.buy(appl);
		String expected = "Bought APPL";
		assertEquals(actual,expected);
	}

}
