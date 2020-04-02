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
		
		Double returnBXStock = mapStock.get("BX");
		println("Bx Stock $" + returnBXStock);
		
		Double doesNotExistStock = mapStock.get("B");
		println("B Stock $" + doesNotExistStock);

	}

}
