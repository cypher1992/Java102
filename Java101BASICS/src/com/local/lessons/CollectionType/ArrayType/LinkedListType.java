package com.local.lessons.CollectionType.ArrayType;

import java.util.LinkedList;
import java.util.List;

public class LinkedListType {

	//https://www.geeksforgeeks.org/linked-list-in-java/
	
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
		
		
		// get an element from linkedlist based on position
		println(linkedList.get(0));
		
		
		//remove the head element in a linkedList
		LinkedList<Integer> copyLinkedList = linkedList;
		println("List before remove()" + copyLinkedList);
		copyLinkedList.remove();
		println("List after remove(): Value 0 or Index 0" + copyLinkedList);
		
		//remove nth index in linkedList
		println("List before remove()" + copyLinkedList);
		copyLinkedList.remove(4);
		println("List after remove(): Value 5 or Index 4" + copyLinkedList);
		
		
		
		
		
	}

}
