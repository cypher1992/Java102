package com.local.lessons.basics;

public class IterationControl {

	/*
	 	iteration for / while/ recursion
	*/
	
	//recursion method
	public static void increament(int initial,int terminate, int incrementor) {
		
		if(initial == terminate){
			System.out.println(initial);
		}else {
			System.out.println(initial);
			initial +=incrementor;
			increament(initial,terminate,incrementor);
		}
		
	}
	
	public static void main(String[] args) {
		int count = 0;
		int end = 10;
		//for loop
		for(count=0;count<end;count++) {
			System.out.println(count);
		}

		// while loop
		end = 20;
		while(count<end){
			System.out.println(count);
			count++;
		}
		
		increament(50,60,1);

	}

}
