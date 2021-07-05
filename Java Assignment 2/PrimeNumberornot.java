package com.lmstwo;

public class PrimeNumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int i;
		int count=0;
		for(i=1;i<=n;i++)
		{ 	
			if (n%i==0)
		{
				count++;
		}
		}
		if (count<=2)
			{
				System.out.println(n+" Number is Prime");
					}
			else
			if(count>2)
			{
				System.out.println("Number is not Prime");
			}


	}

}
