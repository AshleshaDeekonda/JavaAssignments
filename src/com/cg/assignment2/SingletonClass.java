package com.cg.assignment2;

public class SingletonClass {
	
private static SingletonClass uniqueInstance;
    
	public String str;
	private SingletonClass() {
	}
    
	//To avoid more than one instance we can do method declare as synchronized
	public static synchronized SingletonClass getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonClass();
		}
		return uniqueInstance;

	}
	public static void main(String[] args) {
		SingletonClass single1=SingletonClass.getInstance();
		single1.str="Hi I am the singleton class String";
	    System.out.println("First reference: "+single1.str);
	    SingletonClass single2=SingletonClass.getInstance();
	    single2.str="Hii";
	    System.out.println("Second reference: "+single2.str);
	}

}
