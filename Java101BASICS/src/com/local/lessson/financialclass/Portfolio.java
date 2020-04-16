package com.local.lessson.financialclass;

import java.util.Map;
import java.util.TreeMap;
import com.local.lessson.financialclass.Equity;

public class Portfolio {

	private Map<String,Equity> equityPortfolio = new TreeMap<String,Equity>();
	
	public Portfolio() {
		this.equityPortfolio = equityPortfolio;
	}

	public Map getPortfolio(){
		return this.equityPortfolio;
	}
	
	public Map setPortfolio(Map newPortfolio){
		return this.equityPortfolio = newPortfolio;
	}
	
	public void appendEquity(Equity equity){
		this.getPortfolio().put(equity.getTicker(), equity);
	}
	
	public void removeEquity(String key){
		this.equityPortfolio.remove(key);
	}
	
}