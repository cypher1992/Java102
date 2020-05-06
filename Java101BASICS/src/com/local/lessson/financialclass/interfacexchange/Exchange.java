package com.local.lessson.financialclass.interfacexchange;
import java.util.List;

import com.local.lessson.financialclass.Instrument;

public interface Exchange {
	

	//get list of securities on exchange
	public List<Instrument> listing();
	//sold on the exchange
	public List<Instrument> add(); 
}
