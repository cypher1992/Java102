package com.local.lessons.CollectionType.ArrayType;

import java.util.LinkedList;
import java.util.List;

public class LinkedListType {

	
	public static void println(Object obt) {
		System.out.println(obt);
	}
	
	public static void main(String[] args) {
		
		//declaring a LinkedList as a Integer type
		LinkedList<Integer> linkedList = new LinkedList();
		println("Here is a LinkedList " + linkedList);
		
		// add 0 to 9 LinkedList
		for(int count =0; count <10;count++ ) 
		{
			linkedList.add(count);
		}
		println(linkedList);
		
		
	}

}
