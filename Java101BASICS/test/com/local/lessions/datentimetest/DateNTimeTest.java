package com.local.lessions.datentimetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import com.local.lessions.datesntime.*;

class DateNTimeTest {

	@Test
	void testgetNowreturnsCurrentDate() {
		DateNTime dt = new DateNTime();
		LocalDate actual = dt.getNow();
		LocalDate expected = LocalDate.now();
		assertEquals(expected,actual);
	}

}
