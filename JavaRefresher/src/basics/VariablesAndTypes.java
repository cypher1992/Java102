package basics;

public class VariablesAndTypes {
	
	/*
	 Variable and Data Types: 
	 Primitive Types - basic data types provided by the programming type
	 Integers(Negative or Positive Numbers):
	 	- byte = 1 byte - Stores whole numbers from -128 to 127
	 	- short = 2 bytes - Stores whole numbers from -32,768 to 32,767
	 	- int = 4 bytes - Stores whole numbers from -2,147,483,648 to 2,147,483,647
	 	- long = 8 bytes - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	 Floating Points(Rational or decimal numbers):
	 	- float = 4 bytes - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	 	- double = 8 bytes - Stores fractional numbers. Sufficient for storing 15 decimal digits
	 Boolean(True or False):
	 	- boolean = 1 bit - Stores true or false values
	 Char(Single Character of the alphabet)
	 	- char = 2 bytes - 	Stores a single character/letter or ASCII values
	String(Series of concatenated characters) *** Not a Primitive but a Object:
		- String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes
	 **/
	
	public static void main(String[] args) {
		byte BYTE = 123;
		short SHORT = 32767;
		int INT = -2147483647;
		long LONG = -1;
		float FLOAT = 0.14f;
		double DOUBLE = 14.111d;
		boolean TRUE = true;
		char CHAR = 'A';
		String hello = "HELLO WORLD";
		
		System.out.println("Here I am");

	}

}
