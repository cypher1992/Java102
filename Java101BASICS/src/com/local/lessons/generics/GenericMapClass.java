package com.local.lessons.generics;

import java.util.Map;
import java.util.TreeMap;

public class GenericMapClass<K,V> {
	
	private K key;
	private V value;
	private Map<K,V> map = new TreeMap<K,V>();
	
	public GenericMapClass(){
	}
	
	public GenericMapClass(K key,V value){
		this.key = key;
		this.value = value;
		this.map.put(key, value);
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public Map<K, V> getMap() {
		return map;
	}

	public void setMap(Map<K, V> map) {
		this.map = map;
	}
	
	
}
