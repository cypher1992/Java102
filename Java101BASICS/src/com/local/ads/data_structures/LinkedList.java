package com.local.ads.data_structures;

public class LinkedList<T> {

	private Node head;
		
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	class Node<T>{
		
		private T data;
		Node next;
		
		Node(T d){
			data = d;
		}
		
	}
	
}
