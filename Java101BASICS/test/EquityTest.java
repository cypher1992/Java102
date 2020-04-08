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
	void testGetCompany() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCompany() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTicker() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTicker() {
		fail("Not yet implemented");
	}

	@Test
	void testInstrumentMap() {
		fail("Not yet implemented");
	}
	
}
