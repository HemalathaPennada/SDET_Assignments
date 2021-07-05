package com.stringstest;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		try {
    Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println("invalid data format"+e);
				
		}catch(Exception e) {
			System.err.println("Some Other Exceptions are found");
					}

	}

}
