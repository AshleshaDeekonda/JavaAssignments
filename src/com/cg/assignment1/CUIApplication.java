package com.cg.assignment1;

import java.util.Scanner;

public class CUIApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		if(username.equalsIgnoreCase("sandhya")&&password.equalsIgnoreCase("1234"))
			System.out.println("welcome" +username);

		else
			System.out.println("Contact Admin");
	}

}
