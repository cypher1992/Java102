package basictest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import basics.IterationStructures;

class IterationStuctureTest {

	@Test
	void testIsInstanceOfIterationStructure() {
		IterationStructures is = new IterationStructures(0,5);
		assertTrue(is instanceof IterationStructures);
	}
	
	@Test
	void testForLoop() {
		IterationStructures is = new IterationStructures(0,5);
		Integer actual = is.forLoop();
		Integer expected = 5;
		assertTrue(actual == expected);
	}
	
	
	@Test
	void testwhileLoop() {
		IterationStructures is = new IterationStructures(0,5);
		Integer actual = is.whileLoop();
		Integer expected = 5;
		assertTrue(actual == expected);
	}

}
