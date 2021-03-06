package com.local.lessons.collectiontype;

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
		println("List before remove() " + copyLinkedList);
		copyLinkedList.remove();
		println("List after remove(): Value 0 or Index 0 " + copyLinkedList);
		
		//remove nth index in linkedList
		println("List before remove() " + copyLinkedList);
		copyLinkedList.remove(4);
		println("List after remove(): Value 5 or Index 4 " + copyLinkedList);
		
		//insert element nth index using add()
		println("List before add(4,5)" + copyLinkedList);
		copyLinkedList.add(4,5);
		println("List after add(4,5): Append 5 to index 4 " + copyLinkedList);
		
		//Clear entire LinkedList
		copyLinkedList.clear();
		println(copyLinkedList);
		
		//Push an element into the front of a Linked List - head
		linkedList.push(11);
		println(linkedList);
		
		//Pop an element off the front of a Linked List - head
		linkedList.pop();
		println(linkedList);
		
		for(int count =0; count<10; count++) {
			linkedList.push(count);
		}
		println(linkedList);
		
		// indexOf(Object) => position as Int
		int location = linkedList.indexOf(0);
		println("Location of 0 expected 9: actual = " + location);
		
		// indexOf(Object) => position as Int but two instances of the object in LinkedList
		linkedList.push(0);
		location = linkedList.indexOf(0);
		println("Location of 0 expected 0: actual = " + location);
		
		// get the first element without removing it
		println(linkedList.element());
		
		LinkedList<Integer> linkeListPT2 = new LinkedList();
		for(int count =0; count <5; count++){
			linkeListPT2.add(count*2);
		}
		
		println("New List" + linkeListPT2);
		// joining to collections into a linkedList
		linkedList.addAll(linkeListPT2);
		println("Combining two LinkedList " + linkedList);
		
		LinkedList<Integer> removeElements = new LinkedList();
		for(int count=3;count<10;count+=3){
			removeElements.add(count);
		}
		println(removeElements);
		
		linkedList.removeAll(removeElements);
		println("Remove elements from Linkedlist" + linkedList);
		
	}

}
