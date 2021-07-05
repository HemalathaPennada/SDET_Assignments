package com.lms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int i;

for(n=2;n<=10;n++)
{
	int count=0;
for(i=1;i<=n;i++)
{ 	
		if (n%i==0)
{
	count++;
}
}
	if (count==2)
	{
		
		
		System.out.println(n);
		
		
	}
	}
}


}


