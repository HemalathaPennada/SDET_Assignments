package com.stringstest;

public class Charactercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("DevLabs Alliance Training");
				char[] a=s.toCharArray();
		int[] count= new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			count[i]=1;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j] && a[i]!=' ') {
					count[i]++;
					a[j]='0';
				}
					}
			
		
		}
		  for(int i = 0; i <a.length; i++) {  
	            if(a[i] != ' ' && a[i] != '0')  
	                System.out.println(a[i] + "-" + count[i]);  
	        }		
	}

}
