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
		fail("Not yet implemented");
	}

	@Test
	void testGetINT() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLONG() {
		fail("Not yet implemented");
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
