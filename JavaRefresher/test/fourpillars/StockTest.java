package fourpillars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import fourpillar.*;

class StockTest {
	// is apple stock an instance of abstract Security
	@Test
	void isInstanceOfSecurity() {
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		assert(appl instanceof AbstractionEncapsulationSecurity);
	}
	
	@Test
	void isInstanceOfStock() {
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		assert(appl instanceof StockInheritencePolymorphism);
	}
	
	//implement an abstract method
	@Test
	void testInfo() {
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		String actual = appl.info();
		String expected = "TICKER: " + "APPL" + "/nEXCHANGE: " + "NYSE" + "/nSECURITY TYPE: " + "STOCK";
		assertEquals(actual,expected);
	}
	
	//OVERRIDING
	// 1. different class
	// 2. same method name
	// 3. Same parameters
	@Test
	void testTickSecTypeReturnsAPPLSTOCKOVERRRIDING() {
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		String actual = appl.tickSecType();
		String expected = "APPLSTOCKOVERRIDING";
		assertEquals(actual,expected);
	}
	
	//OVERLOADING
		// 1. same class
		// 2. same method name
		// 3. different parameters
	@Test
	void testTickSecTypeReturnsSTOCKOVERLOADINGTECH() {
		StockInheritencePolymorphism appl = new StockInheritencePolymorphism("APPL","NYSE");
		String actual = appl.tickSecType("TECH");
		String expected = "STOCKOVERLOADINGTECH";
		assertEquals(actual,expected);
	}

}
