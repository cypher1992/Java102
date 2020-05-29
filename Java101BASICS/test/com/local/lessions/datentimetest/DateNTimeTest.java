package com.local.lessions.datentimetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import com.local.lessions.datesntime.*;

class DateNTimeTest {

	@Test
	void testGetNowreturnsCurrentDate() {
		DateNTime dt = new DateNTime();
		LocalDate actual = dt.getNow();
		LocalDate expected = LocalDate.now();
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetTodayreturnsgetsDayOfTheMonth() {
		DateNTime dt = new DateNTime();
		int actual = dt.getToday();
		int expected = LocalDate.now().getDayOfMonth();
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetYearReturnsGetsYear() {
		DateNTime dt = new DateNTime();
		int actual = dt.getYear();
		int expected = LocalDate.now().getYear();
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetDayOfWeekReturnsGetsDay() {
		DateNTime dt = new DateNTime();
		String actual = dt.getDayOfWeek();
		String expected = LocalDate.now().getDayOfWeek().toString();
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetEraReturnsGetsEra() {
		DateNTime dt = new DateNTime();
		String actual = dt.getEra();
		String expected = LocalDate.now().getEra().toString();
		assertEquals(expected,actual);
	}
	
	@Test
	void testDayOfYearReturnsGetDayOfYear() {
		DateNTime dt = new DateNTime();
		int actual = dt.getDayOfYear();
		int expected = LocalDate.now().getDayOfYear();
		assertEquals(expected,actual);
	}
	
	@Test
	void testIsLeapYearReturnsBooleanLeapYear() {
		DateNTime dt = new DateNTime();
		boolean actual = dt.isLeapYear();
		boolean expected = LocalDate.now().isLeapYear();
		assertEquals(expected,actual);
	}
	
	@Test
	void testLengthOfMonthReturnIntLengthOfMonth() {
		DateNTime dt = new DateNTime();
		int actual = dt.getLengthOfMonth();
		int expected = LocalDate.now().lengthOfMonth();
		assertEquals(expected,actual);
	}
	
	@Test
	void testLengthOfYearReturnIntLengthOfYear() {
		DateNTime dt = new DateNTime();
		int actual = dt.getLengthOfYear();
		int expected = LocalDate.now().lengthOfYear();
		System.out.println(actual);
		assertEquals(expected,actual);
	}
	

}
