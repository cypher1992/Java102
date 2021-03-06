/**
 * 
 */
package com.local.lessons.basics;

/**
 * @author Zero
 *
 */
public class FlowControl {

	/**
	 * Basics for Flow Control:
	 * IF/Else
	 * IF / ElseIf/ Else
	 * Switch
	 */
	public static void main(String[] args) {
		int age = 19;
		String output = ""; 
		if(age == 0){
			output = "NewBorn";
		}
		else if(age <5 && age>0) {
			output = "Toddler";
		}else if(age >5 && age < 10){
			output = "Kid";
		}else if(age>10 && age <18) {
			output = "Teenager";		
		}else {
			output = "Adult";
		}
		
		System.out.println(output);
		
		/*
		  Switch needs more definitions in order to capture condition
		*/		
		int age2 = 1;
		switch(age2){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4: output = "Toddler";
					break;
			case 5: output = "Kid";
					 break;
			case 10:output = "Teenager";
					break;
			default:output = "Adult";
					break; 
		}
		
		System.out.println(output);
	}

}
