package com.local.lessons.collectiontype;
import java.util.*;

public class MapType {

	public static void println(Object obt) {
		System.out.println(obt);
	}
	
	public static void main(String[] args) {
		
		/*
		 - Create Map Instance with Key and Values
		 - Use Functions that support Map
		*/
		//Instance of Map
		Map<String,Double> mapStock = new HashMap<String,Double>();
		
		// Append Values to Map
		mapStock.put("BX", new Double(21.50));
		mapStock.put("JMP", new Double(101.25));
		mapStock.put("BAC", new Double(15.91));
		mapStock.put("C", new Double(2.10));
		mapStock.put("WFC", new Double(1.31));
		
		println("Instance of a Map Stock " + mapStock);
		
		//return boolean if key exist
		println("Returns True if key exist: " + mapStock.containsKey("BX"));
		
		//return boolean if key does not exist
		println("Returns False if key does not exist: " + mapStock.containsKey("GS"));
		
		//return a key from map.get
		Double returnBXStock = mapStock.get("BX");
		println("Bx Stock $" + returnBXStock);
		
		Double doesNotExistStock = mapStock.get("B");
		println("B Stock $" + doesNotExistStock);
		
		//map.replace replace value based on newValue
		mapStock.replace("C", new Double(7.14));
		println("Returnt update key:C with price of 7.14 "+ mapStock);
		
		//returns true if key exist and false key does not exist
		println(mapStock.containsKey("C"));

		//return a set of keys
		println("Set of Key: " + mapStock.keySet());
		
		//return collection of all values
		println("Value Collection: " + mapStock.values());
		
		//returns size of mapstock
		println(mapStock.size());
		
		//foreach using lambda expression
		mapStock.forEach((k,v) -> println(k +" "+ v));
		
		//Is map empty? returns true/false
		println("Is map empty? "+ mapStock.isEmpty());
		
		// clearing Map of all values
		mapStock.clear();
		println("Cleared Map "+ mapStock);
		println("Is map empty? "+ mapStock.isEmpty());
		
	
	}

}
