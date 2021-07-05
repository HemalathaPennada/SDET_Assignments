package com.collections;

import java.util.*;


public class MaptoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm= new HashMap<Integer,String>();
hm.put(1, "Apple");
hm.put(2, "Mango");
hm.put(3, "Grapes");
hm.put(4, "Papaya");
 ArrayList<Integer> keys=new ArrayList<Integer>(hm.keySet());
 ArrayList<String>Values=new ArrayList<String>(hm.values());
 System.out.println(keys);
 System.out.println(Values);
 
 
	}

}
