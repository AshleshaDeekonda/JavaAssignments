package com.cg.assignment1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sub1");
		sub1=sc.nextInt();
		System.out.println("Enter the sub2");
		sub2=sc.nextInt();
		System.out.println("Enter the sub3");
		sub3=sc.nextInt();
		
		if(sub1==60 && sub2==60 && sub3==60)
			System.out.println("Passed");
		else if((sub1>60&&sub2>60)||(sub2>60&&sub3>60)||(sub1>60&&sub3>60))
			System.out.println("Promoted");
		else if(sub1<60&&sub2<60&&sub3<60)
			System.out.println("failed");
		else
			System.out.println("failed");
			
		
	}

}
