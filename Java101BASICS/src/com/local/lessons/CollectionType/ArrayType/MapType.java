package com.local.lessons.CollectionType.ArrayType;
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
		//return a key from .get
		Double returnBXStock = mapStock.get("BX");
		println("Bx Stock $" + returnBXStock);
		
		Double doesNotExistStock = mapStock.get("B");
		println("B Stock $" + doesNotExistStock);
		
		//map.replace replace value based on newValue
		mapStock.replace("C", new Double(7.14));
		println("Returnt update key:C with price of 7.14 "+ mapStock);

		//returns true if key exist and false key does not exist
		println(mapStock.containsKey("C"));
		
		//return collection of all values
		println("Value Collection: " + mapStock.values());
		
		//returns size of mapstock
		println(mapStock.size());
		
		//foreach using lambda expression
		mapStock.forEach((k,v) -> println(k +" "+ v));
		
	
	}

}