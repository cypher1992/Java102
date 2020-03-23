package com.local.lessons.CollectionType.ArrayType;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayType {

	public static void main(String[] args) {
		
		int arraySize = 3;
		int[] array = new int[arraySize];
		// array assignment for each index
		array[0] = 1;
		array[1] = 2;
		
		System.out.println("First Index of array " + array[0] + " Second Index of array " + array[1]);
		
		// dynamic array list can adapt beyond ArrayList Size
		int arrayListSize = 2;
		ArrayList<Integer> arrayList = new ArrayList<Integer>(arrayListSize);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		System.out.println("First Index of arraylist " + arrayList.get(0) + "\nSecond Index of arraylist" + arrayList.get(1)+ "\nThird Index of arraylist " + arrayList.get(2));
		
		// ArrayList remove index
		int index = 1;
		arrayList.remove(1);
		System.out.println("ArrayList Index 1 or Value 2 removed " + arrayList);
		
		//ArrayList clear list
		arrayList.clear();
		System.out.println(arrayList);
		
		for(int count=1;count<4;count++) {
			arrayList.add(count);
		}
		System.out.println(arrayList);
		
		// ArrayList contains a object  
		boolean bool = arrayList.contains(2);
		if(bool) {
			System.out.println("If True: Contains 2 in arraylist: " + arrayList);
		}
		
	}

}