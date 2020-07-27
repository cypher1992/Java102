package com.src.persistence;

import java.util.Map;
import java.util.TreeMap;

public interface DAO <K,V>{

	public void add(Map<K,V> stockPriceSeries);
	
	public void remove(Map<K,V> stockPriceSeries);
	
	public void query(String ticker);
	
	public void update(Map<K,V> stockPriceSeries);
}
