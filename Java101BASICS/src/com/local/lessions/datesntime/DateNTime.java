package com.local.lessions.datesntime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateNTime {

	private LocalDate now;

	public LocalDate getNow() {
		return LocalDate.now();
	}
	
	public LocalDateTime getTimeNow(){
		return LocalDateTime.now();
	}
	
	public LocalDateTime MinusDays(LocalDateTime dt,Long days) {
		return dt.minusDays(days);
	}
	
	public LocalDateTime MinusHours(LocalDateTime dt,Long hours) {
		return dt.minusHours(hours);
	}
	
	public LocalDateTime MinusMins(LocalDateTime dt,Long minutes) {
		return dt.minusMinutes(minutes);
	}
	
	public LocalDateTime plusDayz(int days,LocalDateTime ldt) {
		return ldt.plusDays(days);
	}
	
	public LocalDateTime plusMinutes(int mins,LocalDateTime ldt) {
		return ldt.plusMinutes(mins);
	}
	
	public LocalDateTime ofDateTime(int year,int month,int date, int hour, int min, int secs) {
		return LocalDateTime.of(year,month,date,hour,min,secs);
	}
	
	public String formatDateTime(LocalDateTime dt, String strFormat) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern(strFormat);
		return dt.format(format);	
	}
	
	public int getToday(){
		return LocalDate.now().getDayOfMonth();
	}
	
	public int getYear(){
		return LocalDate.now().getYear();
	}
	
	public String getDayOfWeek(){
		return LocalDate.now().getDayOfWeek().toString();
	}
	
	public String getEra(){
		return LocalDate.now().getEra().toString();
	}
	
	public int getDayOfYear(){
		return LocalDate.now().getDayOfYear();
	}
	
	public boolean isLeapYear(){
		return LocalDate.now().isLeapYear();
	}
	
	public int getLengthOfMonth(){
		return LocalDate.now().lengthOfMonth();
	}
	
	public int getLengthOfYear(){
		return LocalDate.now().lengthOfYear();
	}
	
	public Long getEpochDate(){
		return LocalDate.now().toEpochDay();
	}
	
}
