package com.src.utility;
import java.util.Map;

import com.src.utility.csexception.MapSetSizeZero;
import com.src.utility.csexception.MapSizeZero;
import com.src.utility.csexception.SetSizeZero;
import java.util.Set;

public class StringWrapper {

	
	public Map StringSingleQuoteMap(Map<String, Object> stockMapObject) {
		Set setKeys = stockMapObject.keySet();
		int count = 0;
		int lastIndex = setKeys.size()-1;
		for(Object key: setKeys) {
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
	
	public String appendKey(Set set) throws SetSizeZero{
		String setStr = "";
		int size = set.size();
		int count = 0;
		if(size > 0) {
			for(Object key:set){
				if(count == size-1){	
					setStr += key;
					count+=1;
				}else {
					setStr += key + ", ";
					count+=1;
				}
			}
		}else {
			throw new SetSizeZero("Set size is zero");
		}
		setStr = "( " + setStr + ", INSERT_TS )";
		
		return setStr;
		
	}
	
	public String appendKeyValue(Set set,Map map) throws SetSizeZero, MapSetSizeZero, MapSizeZero{
		String mapStr = "";
		int setSize = set.size();
		int mapSize = map.size();
		int count = 0;
		if(setSize > 0 && mapSize >0) {
			for(Object key:set){
				if(count == setSize-1){
					if(map.get(key) != null) {
						mapStr += "'"+ map.get(key) +"'";
						count+=1;
					}else {
						mapStr += map.get(key);
						count+=1;
					}
				}else {
					if(map.get(key) != null) {
						mapStr += "'" + map.get(key) + "', ";
						count+=1;
					}else {
						mapStr += map.get(key) + ", ";
						count+=1;
					}
				}
			}
		}else {
			if(setSize == 0 && mapSize > 0) {
				throw new SetSizeZero("Set size is zero");
			}else if(mapSize == 0 && setSize > 0){
				throw new MapSizeZero("Map size is zero");
			}else {
				throw new MapSetSizeZero("Map & Set size is zero");
			}
		}
		mapStr = "( " + mapStr + ", sysdate )";
		
		return mapStr;
		
	}
	
	
}
