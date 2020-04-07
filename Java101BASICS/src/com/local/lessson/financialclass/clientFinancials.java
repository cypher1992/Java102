package com.local.lessson.financialclass;

import java.time.LocalDateTime;
import java.time.Month;

import com.local.lessson.financialclass.Equity;

public class clientFinancials {

	public static void main(String[] args) {
		
		Double price = new Double(46.63);
		LocalDateTime dateTime = LocalDateTime.of(2020,Month.APRIL,6,17,00,00); 
		
		Equity blackstone = new Equity("BLACKSTONE-EQT","BX-W",price,"EQUITY",dateTime,"BLACKSTONE","BX");

		System.out.println(blackstone.instrumentMap());
	}

}
