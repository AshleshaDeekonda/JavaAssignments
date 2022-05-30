package com.cg.assignment1;

import java.util.Scanner;

public class ThreeStudentsMarks {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		//Taking i/p for studentOne
		System.out.println("Enter student one marks");
		int subjectA1=s.nextInt();
		int subjectB1=s.nextInt();
		int subjectC1=s.nextInt();
		int attempts;
		int res1=0;
		int res2=0;
		int res3=0;
		for(attempts=1;attempts<=3;attempts++)
		{
				res1=subjectA1+subjectB1+subjectC1;
		}
		System.out.println("Total Scored by student 1: "+res1);
		int average1=res1/3;
		System.out.println("Average :"+average1);
		//Taking i/p for studentTwo
		System.out.println("Enter student two marks");
		int subjectA2=s.nextInt();
		int subjectB2=s.nextInt();
		int subjectC2=s.nextInt();
		for(attempts=1;attempts<=3;attempts++)
		{
			res2=subjectA2+subjectB2+subjectC2;
		}
		System.out.println("Total Scored by student 2: "+res2);
		int average2=res2/3;
		System.out.println("Average :"+average2);
		//Taking i/p for student3
		System.out.println("Enter student three marks");
		int subjectA3=s.nextInt();
		int subjectB3=s.nextInt();
		int subjectC3=s.nextInt();
		for(attempts=1;attempts<=3;attempts++)
		{
			res3=subjectA3+subjectB3+subjectC3;
		}
		System.out.println("Total Scored by student 3: "+res3);
		int average3=res3/3;
		System.out.println("Average :"+average3);
		
		
		//implementing to find all subjects total and average
		int subjectATotal=subjectA1+subjectA2+subjectA3;
		int subjectBTotal=subjectB1+subjectB2+subjectB3;
		int subjectCTotal=subjectC1+subjectC2+subjectC3;
		System.out.println("Total scored by all students in subjectA : "+subjectATotal+" And the average in subjectA : "+subjectATotal/3);
		System.out.println("Total scored by all students in subjectB : "+subjectBTotal+" And the average in subjectB : "+subjectBTotal/3);
		System.out.println("Total scored by all students in subjectC : "+subjectCTotal+" And the average in subjectC : "+subjectCTotal/3);
		s.close();
	}


	

}
