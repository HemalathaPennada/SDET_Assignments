package com.collections;
import java.util.*;

public class SettoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> s=new HashSet<Integer>();
s.add(10);
s.add(11);
s.add(12);
s.add(13);
Object[] a=s.toArray();
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}
