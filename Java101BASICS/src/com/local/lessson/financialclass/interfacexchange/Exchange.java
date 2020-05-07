package com.local.lessson.financialclass.interfacexchange;
import java.util.Map;

import com.local.lessson.financialclass.Equity;

public interface Exchange {
	
	//get list of securities on exchange
	public Map<String,Equity> listing();
	//sold on the exchange
	public  Map<String,Equity> add(); 
	//not sold on the exchange
	public  Map<String,Equity> remove();
}
