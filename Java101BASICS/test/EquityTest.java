import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;
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
		Map<String,Object> actual = blackstone.instrumentMap();
		// treeMap deal with sorting keys
		Map<String, Object> expected = new TreeMap<String,Object>();
		expected.put("NAME", "BLACKSTONE-EQT");
		expected.put("IDENTIFIER", "BX-W");
		expected.put("ASSETTYPE", "EQUITY");
		expected.put("DATETIME", LocalDateTime.of(2020,Month.APRIL,6,17,00,00));
		expected.put("PRICE", new Double(46.63));
		expected.put("COMPANY", "BLACKSTONE");
		expected.put("TICKER", "BX");
	
		assertEquals(actual,actual);
	}
	
	@Test
	void testGetName() {
		String actual = blackstone.getName();
		String expected = "BLACKSTONE-EQT";
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetName() {
		
		Equity bofa = new Equity("BOFA-EQTX","BAC",new Double(23.41),"EQUITY",dateTime,"BANK OF AMERICA CORP.", "BAC");
		bofa.setName("BOFA-EQT");
		String actual = bofa.getName();
		String expected = "BOFA-EQT";
		
		assertEquals(expected,actual);
	}
	
}
