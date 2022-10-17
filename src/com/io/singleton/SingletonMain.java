package com.io.singleton;

public class SingletonMain {

	public static void main(String[] args) {
	//[1]
	//Singleton singleton = new Singleton();
		
	//[2]
//	Singleton s1 = Singleton.getInstance();
//	Singleton s2 = Singleton.getInstance();
//	
//	System.out.println(s1 == s2);
		
	//[3]
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	
	System.out.println(s1 == s2);
	}

}
