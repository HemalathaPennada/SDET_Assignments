package com.stringstest;

public class Rethrow {
	
	public void rethrowmethod() {
		

	int[] arr = {10, 20, 30, 2, 0, 8};
	
	try {
			
		try {
		
        int result = (arr[2])/(arr[4]);
        System.out.println("Division result is "+result);
        
		}catch(ArithmeticException e) {
	        throw e;
		}
		
                try {
        int result1=(arr[3])/(arr[6]);
        
        System.out.println("Result of "+result1);
        
     }
	catch(ArrayIndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException();
     
	}
	}catch(Exception en) {
        throw en;
     }
}
}
