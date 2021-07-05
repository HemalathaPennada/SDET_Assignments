package com.lmstwo;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
for(int i=79;i<=187;i++) {
	
	if(i%2==1) {
		count++;
		System.out.print(i+" ");
	}
	
}
System.out.println();
System.out.println("Total count of Odd Numbers is  "+count);
	}

}
