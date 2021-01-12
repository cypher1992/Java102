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
		fail("Not yet implemented");
	}

	@Test
	void testGetDOUBLE() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCHAR() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSTRING() {
		fail("Not yet implemented");
	}

}
