package com.lmstwo;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1034;
		int m;
		int Sum=0;
		while(n>0) {
			m=n%10;
			Sum=Sum+m;
			n=n/10;
		}
		System.out.println("Sum of the Numbers is "+Sum);
		
		

	}

}
