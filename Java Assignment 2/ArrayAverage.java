package com.lmstwo;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
int Avg=0;
int Sum=0;
for(int i=0;i<a.length;i++) {
	Sum=Sum+a[i];
	Avg=Sum/a.length;
	
}
System.out.println("Average of the Numbers is "+Avg);	
	}

}
