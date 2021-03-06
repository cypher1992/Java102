package com.local.lessson.financialclass.interfacexchange;
import java.util.Map;

import com.local.lessson.financialclass.Equity;

public interface Exchange {
	
	//get list of securities on exchange
	public Map<String,Equity> listing();
	//sold on the exchange
	public  void add(Map<String,Equity> tgtMap,String ticker, Equity equity); 
	//not sold on the exchange
	public  void remove(Map<String,Equity> tgtList,String ticker);
}
