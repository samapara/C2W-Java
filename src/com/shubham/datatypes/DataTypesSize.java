package com.shubham.datatypes;

class DataTypesSize {
	
	public static void main(String[] args){

		//Java has stored the size in a field in it's wrapper classes. The java does not any method to calculate size of datatype
	
		System.out.println("Size of int: " + (Integer.SIZE / 8) + " byte(s)" );
		System.out.println("Size of float: " + (Float.SIZE / 8) + " byte(s)" );
		System.out.println("Size of long: " + (Long.SIZE / 8) + " byte(s)" );
		System.out.println("Size of char: " + (Character.SIZE / 8) + " byte(s)" );
		System.out.println("Size of double: " + (Double.SIZE / 8) + " byte(s)" );
		System.out.println("Size of short: " + (Short.SIZE / 8) + " byte(s)" );
		System.out.println("Size of byte: " + (Byte.SIZE / 8) + " byte(s)" );
		
		//System.out.println("Size of boolean: " + (Boolean.SIZE / 8) + "byte(s)" ); //This is decided by JVM itslef
	
	}
}
