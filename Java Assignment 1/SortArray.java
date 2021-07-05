package com.lms;
//import java.util.*;

public class SortArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] i = {1,5,3,2,4};

int j;
int k=0;
int m;
for(j=0;j<i.length;j++) {
	for(m=j+1;m<i.length;m++) {
	if(i[j]>i[m]) {
		k=i[m];
		i[m]=i[j];
		i[j]=k;
		
	}	
	//System.out.println(i[m]);
}	
	System.out.println(i[j]);
	
	}

	}
}



