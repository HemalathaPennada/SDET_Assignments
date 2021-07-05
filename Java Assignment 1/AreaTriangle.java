package com.lms;
import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter the base of the triangle");
double base=s.nextDouble();
System.out.println("Enter the height of the triangle");
double height=s.nextDouble();
s.close();
double area;
area=0.5*base*height;
System.out.println(area);

	}

}
