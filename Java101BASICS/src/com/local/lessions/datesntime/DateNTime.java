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
	
	public String getDayOfWeek(){
		return LocalDate.now().getDayOfWeek().toString();
	}
	
	public String getEra(){
		return LocalDate.now().getEra().toString();
	}
	
	
}