package com.local.lessions.datentimetest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetEpochDate() {
		DateNTime dt = new DateNTime();
		long actual = dt.getEpochDate();
		long expected = LocalDate.now().toEpochDay();
		assertEquals(expected,actual);
	}
	
	@Test
	void testGetTimeNow() {
		DateNTime dt = new DateNTime();
		LocalDateTime actual = dt.getTimeNow();
		LocalDateTime expected = LocalDateTime.now();
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusDays() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusDays(ldt, new Long(365));
		LocalDateTime expected = ldt.minusDays(new Long(365));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusDaysZeroDays() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusDays(ldt, new Long(0));
		LocalDateTime expected = ldt.minusDays(new Long(0));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusDaysNegative365Days() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusDays(ldt, new Long(-365));
		LocalDateTime expected = ldt.minusDays(new Long(-365));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusHours() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusHours(ldt, new Long(8784));
		LocalDateTime expected = ldt.minusHours(new Long(8784));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusNegativeHours() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusHours(ldt, new Long(-8784));
		LocalDateTime expected = ldt.minusHours(new Long(-8784));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusZeroHours() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusHours(ldt, new Long(0));
		LocalDateTime expected = ldt.minusHours(new Long(0));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusZeroMinutes() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusMins(ldt, new Long(0));
		LocalDateTime expected = ldt.minusMinutes(new Long(0));
		assertEquals(expected,actual);
	}
	
	@Test
	void testMinusNegativeMinutes() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.MinusMins(ldt, new Long(-525600));
		LocalDateTime expected = ldt.minusMinutes(new Long(-525600));
		assertEquals(expected,actual);
	}
	
	@Test
	void testPositivePlusDayz() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusDayz(new Integer(365),ldt);
		LocalDateTime expected = ldt.plusDays(new Integer(365));
		assertEquals(expected,actual);
	}
	
	@Test
	void testZeroPlusDayz() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusDayz(new Integer(0),ldt);
		LocalDateTime expected = ldt.plusDays(new Integer(0));
		assertEquals(expected,actual);
	}
	
	@Test
	void testNegetivePlusDayz() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusDayz(new Integer(-365),ldt);
		LocalDateTime expected = ldt.plusDays(new Integer(-365));
		assertEquals(expected,actual);
	}

	@Test
	void testPositivePlusMinutes() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusMinutes(new Integer(525600),ldt);
		LocalDateTime expected = ldt.plusMinutes(new Integer(525600));
		assertEquals(expected,actual);
	}
	
	@Test
	void testZeroPlusMinutes() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusMinutes(new Integer(0),ldt);
		LocalDateTime expected = ldt.plusMinutes(new Integer(0));
		assertEquals(expected,actual);
	}
	
	@Test
	void testNegetivePlusMinutes() {
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		LocalDateTime actual = dt.plusMinutes(new Integer(-525600),ldt);
		LocalDateTime expected = ldt.plusMinutes(new Integer(-525600));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimeYYYYMMDD() {
		// YY year
		// MM Month
		// DD Date
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"yyyy MM dd");
		String expected = ldt.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimeYYMMDD() {
		// yy year
		// MM Month
		// dd Date
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"yy MM dd");
		String expected = ldt.format(DateTimeFormatter.ofPattern("yy MM dd"));
		assertEquals(expected,actual);
	}	
	
	@Test
	void testFormatDateTimeH() {
		// H - hour
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"H");
		String expected = ldt.format(DateTimeFormatter.ofPattern("H"));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimem() {
		// m - hour
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"m");
		String expected = ldt.format(DateTimeFormatter.ofPattern("m"));
		System.out.println(actual);
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimeS() {
		// s - second
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"s");
		String expected = ldt.format(DateTimeFormatter.ofPattern("s"));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimeNFractSec() {
		// S - Fraction of a Second
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"S");
		String expected = ldt.format(DateTimeFormatter.ofPattern("S"));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimeN() {
		// n - nanosecond
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"n");
		String expected = ldt.format(DateTimeFormatter.ofPattern("n"));
		assertEquals(expected,actual);
	}
	
	@Test
	void testFormatDateTimez() {
		// a - am/pm
		DateNTime dt = new DateNTime();
		LocalDateTime ldt = dt.getTimeNow();
		String actual = dt.formatDateTime(ldt,"a");
		String expected = ldt.format(DateTimeFormatter.ofPattern("a"));
		assertEquals(expected,actual);
	}
	
	
}
