package com.local.lessson.financialclass.interfacexchange;

import java.util.Map;
import java.util.TreeMap;

import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.Instrument;

public class NYSE implements Exchange{
	
	private static NYSE INSTANCE;
	private  Map<String,Equity> activeStocks = new TreeMap<String,Equity>();
	private  Map<String,Equity> inactiveStocks = new TreeMap<String,Equity>();
	
	
	 private NYSE(){
		this.activeStocks = activeStocks;
		this.inactiveStocks = inactiveStocks;
	} 
	
	public static NYSE getInstance(){
		if(INSTANCE == null) {
			INSTANCE = new NYSE();
		}
		return INSTANCE;
	}
	
	
	@Override
	public Map<String, Instrument> listing() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Instrument> add() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Instrument> remove() {
		// TODO Auto-generated method stub
		return null;
	} 
	


}
