package basictest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import basics.VariablesAndTypes;


class VariablesAndTypesTest {
	
	VariablesAndTypes obj = new VariablesAndTypes();
	
	
	@Test
	void testVariablesAndTypes() {
		assertTrue(obj instanceof VariablesAndTypes);
	}

	@Test
	void testGetBYTE() {
		Byte actual = obj.getBYTE();
		assertTrue(actual instanceof Byte);
	}

	@Test
	void testGetSHORT() {
		Short actual = obj.getSHORT();
		assertTrue(actual instanceof Short);
	}

	@Test
	void testGetINT() {
		Integer actual = obj.getINT();
		assertTrue(actual instanceof Integer);
	}

	@Test
	void testGetLONG() {
		Long actual = obj.getLONG();
		assertTrue(actual instanceof Long);
	}

	@Test
	void testGetFLOAT() {
		Float actual = obj.getFLOAT();
		assertTrue(actual instanceof Float);
	}

	@Test
	void testGetDOUBLE() {
		Double actual = obj.getDOUBLE();
		assertTrue(actual instanceof Double);
	}

	@Test
	void testGetCHAR() {
		Character actual = obj.getCHAR();
		assertTrue(actual instanceof Character);
	}

	@Test
	void testGetSTRING() {
		String actual = obj.getSTRING();
		assertTrue(actual instanceof String);
	}

}
