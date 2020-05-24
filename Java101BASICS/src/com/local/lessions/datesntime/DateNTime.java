package com.local.lessions.datesntime;
import java.time.LocalDate;

public class DateNTime {

	private LocalDate now;

	public LocalDate getNow() {
		return LocalDate.now();
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
