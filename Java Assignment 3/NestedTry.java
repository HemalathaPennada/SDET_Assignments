package com.stringstest;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{  
			    try{  
			 
			     int b =10/0;  
			     System.out.println(b);
			     
			    }catch(ArithmeticException e){
			    	System.out.println(e);
			    	}  
			   
			    try{  
			    int a[]=new int[5];  
			    a[5]=4;  
			    }catch(ArrayIndexOutOfBoundsException e)
			    {
			    	System.out.println(e);}  
			     
			    
			  }
		 
		 
		 catch(Exception e)
		 {
				  System.out.println("All Other exceptions are handled");
		 }  
			  finally {
			  System.out.println("All Exceptions are handled");  
	}
	}

}
