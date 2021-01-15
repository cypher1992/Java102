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
	void testWhileLoop() {
		IterationStructures is = new IterationStructures(0,5);
		Integer actual = is.whileLoop();
		Integer expected = 5;
		assertTrue(actual == expected);
	}
	
	@Test
	void testDoWhileLoop() {
		// this occured because static is inplace
		//Meaning that there is one one instance of counter for the class not multiples for each instance
		IterationStructures is = new IterationStructures(0,5);
		Integer actual = is.doWhile();
		Integer expected = 6;
		assertTrue(actual == expected);
	}
	
}
