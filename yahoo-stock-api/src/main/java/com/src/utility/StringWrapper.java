package com.src.utility;
import java.util.Map;
import java.util.Set;

public class StringWrapper {

	
	public Map StringSingleQuoteMap(Map<Object, Object> map) {
		Set setKeys = map.keySet();
		int count = 0;
		int lastIndex = setKeys.size()-1;
		for(Object key: setKeys) {
			if(count == lastIndex) {
				if(map.get(key) != null) {
					map.put(key,"'" + map.get(key) +"' ");
					count+=1;
				}
			}else {
				if(map.get(key) != null) {
					map.put(key,"'" + map.get(key) +"', ");
					count+=1;
				}else {
					map.put(key, map.get(key) +", ");
				}
			}
		}
		return map;
		
	}
	
	
}
