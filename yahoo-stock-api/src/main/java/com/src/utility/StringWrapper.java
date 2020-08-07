package com.src.utility;
import java.util.Map;
import java.util.Set;

public class StringWrapper {

	
	public Map StringSingleQuoteMap(Map map) {
		Set setKeys = map.keySet();
		
		for(Object key: setKeys) {
			if(map.get(key) != null) {
				map.put(key,"'" + map.get(key) +"'");
			}
		}
		
		return map;
		
	}
	
	
}
