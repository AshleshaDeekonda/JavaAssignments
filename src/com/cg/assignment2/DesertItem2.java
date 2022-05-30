package com.cg.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



abstract class Desertitem
{
abstract int getCost(int cost);
}
class CandyItem extends Desertitem
{
int dollarCurrency=60;
@Override
int getCost(int cost)
{
return cost*dollarCurrency;
}
}
class Cookie extends Desertitem
{
int euroCurrency=70;
@Override
int getCost(int cost)
{
return cost*euroCurrency;
}

}
class IceCream extends Desertitem
{
@Override
int getCost(int cost)
{
return cost;
}
}

public class DesertItem2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the role : customer(OR)owner ");
		String role=sc.next();
		List<String> list=new ArrayList<String>();
		if(role.equals("owner"))
		{
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter No. of items u want to insert");
			int noOfItems=sc1.nextInt();
			for(int i=1;i<=noOfItems;i++)
			{
				String s=sc1.next();
				list.add(s);
			}
			for(String res:list)
			{
				System.out.println("Item added Succesfully : "+res);
			}
		}
		else if(role.equals("customer"))
		{
		System.out.println("Aavailable Deserts ");
		System.out.println("------------------");
		Desertitem desertitem1=new CandyItem();
		System.out.println("Candy : "+desertitem1.getCost(1)+" rupees");
		Desertitem desertitem2=new Cookie();
		System.out.println("Cookie : "+desertitem2.getCost(1)+" rupees");
		Desertitem desertitem3=new IceCream();
		System.out.println("IceCream : "+desertitem3.getCost(1)+" in rupees");
		System.out.println("select by entering (a) for candy,(b) for cookie (c) for icecream");
		char select=sc.next().charAt(0);
		if(select=='a'||select=='b'||select=='c')
		{
			System.out.println("candy=a ,cookie=b ,icecream=c");
			System.out.println("selected product is =>"+ select);
		}
		else
		{
			System.out.println("enter valid comand a(OR)b(OR)c");
		}
		}
		else
		{
		System.out.println("Please enter valid input");
		}
		sc.close();
		}
		

	}


