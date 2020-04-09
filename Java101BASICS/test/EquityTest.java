import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.Month;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.Instrument;

class EquityTest {

	Double price = new Double(46.63);
	LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,6,17,00,00); 	
	Equity blackstone = new Equity("BLACKSTONE-EQT","BX-W",price,"EQUITY",dateTime,"BLACKSTONE","BX");

	@Test
	void testEquity() {
		assertTrue(blackstone instanceof Equity);
	}
	
	@Test
	void testInstrument() {
		assertTrue(blackstone instanceof Instrument);
	}
	
	@Test
	void testGetCompany() {
		String actual = blackstone.getCompany();
		String expected = "BLACKSTONE";
		assertEquals(expected,actual);
	}

	@Test
	void testGetTicker() {
		String actual = blackstone.getTicker();
		String expected = "BX";
		assertEquals(expected,actual);
	}

	
	
	@Test
	void testSetCompany() {
		Double citiPrice = new Double(26.41);
		Equity citi = new Equity("CITI-EQT","C",citiPrice,"EQUITY",dateTime,"CITI","C");
		citi.setCompany("CITI CORP");
		String actual = citi.getCompany();
		String expected = "CITI CORP";
		assertEquals(expected, actual);
	}

	@Test
	void testSetTicker() {
		Double goldmanPrice = new Double(145.12);
		Equity goldmanSacs = new Equity("GOLDMANSACS-EQT","GS",goldmanPrice,"EQUITY",dateTime,"GOLDMAN SACS", "GSX");
		goldmanSacs.setTicker("GS");
		String actual = goldmanSacs.getTicker();
		String expected = "GS";
		assertEquals(expected,actual);
	}

	@Test
	void testInstrumentMap() {
		fail("Not yet implemented");
	}
	
}
