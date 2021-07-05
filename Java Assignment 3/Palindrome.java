package com.stringstest;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String("trurt");
		//char[] pal =a.toCharArray();
		//int j=a.length()/2;
		boolean count=true;
	

		for(int i=0;i<=a.length()/2;i++) {
if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
	count=false;
}
	
		}
		if (count==false) {
				System.out.println("Given String is not Palindrome");
		
		
			}else {
				System.out.println("Given String is Palindrome");
			}
		
	}

}
