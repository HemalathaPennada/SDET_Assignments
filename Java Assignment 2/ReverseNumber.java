package com.lmstwo;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123;
int x=0;
int reverse=0;
while(n>0) {
	x=n%10;
	reverse=reverse*10+x;
	n=n/10;
	
}
System.out.println("Reverese of a Number is "+reverse);
	}

}
