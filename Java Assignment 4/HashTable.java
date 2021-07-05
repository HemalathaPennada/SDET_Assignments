package com.collections;
import java.util.*;  

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> h=new Hashtable<Integer,String>();  
		  
		  h.put(100,"Amit");  
		  h.put(102,"Ravi");  
		  h.put(101,"Vijay");  
		  h.put(103,"Rahul");  
		  
		
		   System.out.println(h.keySet());  
		 
	}

}
