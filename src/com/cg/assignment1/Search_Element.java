package com.cg.assignment1;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to be searched: ");
		
		int num=sc.nextInt();
		int flag=0;
		int i;
		for(i=0; i<a.length; i++) {
			if(a[i]==num) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
			
		}
		if(flag==1) {
			System.out.println("Element found at position: "+(i+1));
		}else {
			System.out.println("Element not found");
		}
		
	}
		
}
