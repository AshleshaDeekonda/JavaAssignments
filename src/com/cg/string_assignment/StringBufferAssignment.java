package com.cg.string_assignment;

public class StringBufferAssignment {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("StringBuffer ");
		sb.append("is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("original string is: " +sb1);
		sb1.reverse();
		System.out.println("reverse string is: " +sb1);
		
		StringBuffer sb2= new StringBuffer("It is used to  at the specified position");
		sb2.insert(14, "insert text");
		System.out.println(sb2);
	}

}
