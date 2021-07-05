package com.lms;
import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
       int year=s.nextInt();
       s.close();
if(year%4==0) {
	System.out.println("Given year is Leap Year");
	
}else {
	System.out.println("Given year is not a leap year");
}
	}

}
