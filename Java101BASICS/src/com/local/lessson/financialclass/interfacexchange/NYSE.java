package com.local.lessson.financialclass.interfacexchange;

import java.util.Map;
import java.util.TreeMap;

import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.Instrument;

public class NYSE implements Exchange{

	private  Map<String,Equity> activeStock = new TreeMap<String,Equity>();
	private  Map<String,Equity> inactiveStock = new TreeMap<String,Equity>();

	public NYSE(){
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
