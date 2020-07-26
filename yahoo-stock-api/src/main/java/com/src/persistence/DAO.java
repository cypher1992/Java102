package com.src.persistence;

import java.util.Map;
import java.util.TreeMap;

public interface DAO <K,V>{

	public void add(Map<K,V> stockPriceSeries);
	
}
