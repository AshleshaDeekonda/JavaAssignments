package com.cg.string_assignment;

public class StringMethods {

	public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		String s1 = str.toUpperCase();
		System.out.println("s1 is: "+s1);
		
		String s2 = str.toLowerCase();
		System.out.println("s2 is: "+s2);
		
		String s3 = str.replace("a", "$");
		System.out.println("s3 is "+s3);
		
		if(str.contains("collection")) {
			System.out.println("collection is in the string");
		}
		
		String s4 = "Java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equalsIgnoreCase(s4));

	}

}
