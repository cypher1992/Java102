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
		if(equity != null){
			this.getPortfolio().put(equity.getTicker(), equity);
		}else {
			System.out.println("Equity is instance of Null");
		}
	}
	
	public void removeEquity(String key){
		if(this.equityPortfolio.containsKey(key) && key != null){
			this.equityPortfolio.remove(key);
		}else {
			System.out.println("Ticker is not valid");
		}
	}
	
}
