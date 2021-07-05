package com.lms;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the Size of the array");
int size=s.nextInt();
int[] a=new int[size];
System.out.println("Enter all the Values");
for(int i=0;i<size;i++) {
	a[i]=s.nextInt();
	
}
s.close();
for(int j=a.length-1;j>=0;j--) {
	System.out.print(a[j]+" ");
}



	}

}
