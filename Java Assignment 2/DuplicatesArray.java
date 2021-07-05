package com.lmstwo;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] i= {12,32,12,45,6,93,6,23,45,6};

for(int j=0;j<i.length;j++) {
	
	for(int k=j+1;k<i.length;k++) {
	
		if(i[j]==i[k]) {
					
			System.out.println("Duplicates found in array is "+i[j] + " at index " +j +" and "+
					+k);
		
		}
		}
	}


	}

}
