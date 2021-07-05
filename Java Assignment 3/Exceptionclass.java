package com.stringstest;


public class Exceptionclass {

	public void Division() throws ArithmeticException  {
		int a=10;
	int b=0;
	
	try {
	int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e) {
		 System.out.println("Arithmetic Exception found"+e);
		 
	}	
		
	}
	
}

