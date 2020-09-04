package com.local.ads.data_structures;

public class LinkedList<T> {

	private Node head;
	
	class Node<T>{
		
		private T data;
		Node next;
		
		Node(T d){
			data = d;
		}
		
	}
	
}
