package com.cg.assignment1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double income=sc.nextInt();
		
		System.out.println("Enter Income");
		if(income>=0&&income<=180000) {
			System.out.println("Slab => Slab A");
			System.out.println("Tax Payable => Nill");
			
		}
		else if(income>=181001&income<=300000)
		{
			System.out.println("Slab => Slab B");
			System.out.println("Tax Payable => 10%");
		}
		else if(income>=300001&income<=500000)
		{
			System.out.println("Slab => Slab C");
			System.out.println("Tax Payable => 20%");
		}
		else if(income>=500001&income<=1000000)
		{
			System.out.println("Slab => Slab D");
			System.out.println("Tax Payable => 30%");
		}
		else {
			System.out.println("Enter Valid incomes");
		}
		sc.close();
	}

}
