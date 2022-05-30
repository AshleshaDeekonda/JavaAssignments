package com.cg.assignment1;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		
		double p, t, r, sim, com;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Principal = ");
		p = sc.nextDouble();
		
		System.out.println("Enter the Annual Rate of Interest = ");
		r = sc.nextDouble();
		
		System.out.println("Enter the No. of years = ");
		t = sc.nextDouble();
		
		sim = (p*t*r)/100;
		com = p * Math.pow(1.0+r/100.0, t) - p;
		
		System.out.println("Simple Interest: "+sim);
		System.out.println("Compound Interest: "+com);

	}

}
