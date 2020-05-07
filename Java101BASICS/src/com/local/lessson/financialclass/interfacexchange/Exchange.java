package com.local.lessson.financialclass.interfacexchange;
import java.util.Map;

import com.local.lessson.financialclass.Instrument;

public interface Exchange {
	
	//get list of securities on exchange
	public Map<String,Instrument> listing();
	//sold on the exchange
	public  Map<String,Instrument> add(); 
	//not sold on the exchange
	public  Map<String,Instrument> remove();
}
