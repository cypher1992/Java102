package basictest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import basics.ConditionStructures;

class ConditionStructureTest {

	@Test
	void testIfIsEvenReturnsTrue() {
		ConditionStructures cs = new ConditionStructures(8);
		Boolean actual = cs.ifIsEven();
		assertTrue(actual);
	}

	@Test
	void testIfIsOdd() {
		ConditionStructures cs = new ConditionStructures(9);
		Boolean actual = cs.ifIsOdd();
		assertTrue(actual);
	}

	@Test
	void testIfElseEven() {
		ConditionStructures cs = new ConditionStructures(8);
		Boolean actual = cs.ifElseEven();
		assertTrue(actual);
	}

	@Test
	void testIfElseOdd() {
		ConditionStructures cs = new ConditionStructures(9);
		Boolean actual = cs.ifElseOdd();
		assertTrue(actual);
	}

	@Test
	void testIfElseifElseNeutual() {
		ConditionStructures cs = new ConditionStructures(0);
		Boolean actual = cs.ifElseifElseNeutual();
		assertTrue(actual);
	}

	@Test
	void testSwitchIsNeutural() {
		ConditionStructures cs = new ConditionStructures(0);
		Boolean actual = cs.switchIsNeutural();
		assertTrue(actual);
	}

}
