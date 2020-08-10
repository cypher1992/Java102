package com.src.utility;
import java.util.Map;
import java.util.Set;

public class StringWrapper {

	
	public Map StringSingleQuoteMap(Map<String, Object> stockMapObject) {
		Set setKeys = stockMapObject.keySet();
		int count = 0;
		int lastIndex = setKeys.size()-1;
		for(Object key: setKeys) {
			System.out.println(count);
			if(count == lastIndex) {
				if(stockMapObject.get(key) != null) {
					stockMapObject.put((String) key,"'" + stockMapObject.get(key) +"' ");
					count+=1;
				}
			}else {
				if(stockMapObject.get(key) != null) {
					stockMapObject.put((String) key,"'" + stockMapObject.get(key) +"', ");
					count+=1;
				}else {
					stockMapObject.put((String) key, stockMapObject.get(key) +", ");
					count+=1;
				}
			}
		}
		return stockMapObject;
		
	}
	
	
}
