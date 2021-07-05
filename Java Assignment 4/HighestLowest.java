package com.collections;
import java.util.*;  

public class HighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet <Integer>Value = new TreeSet<Integer>();  
		Value.add(5);
		Value.add(3);
		Value.add(6);
		Value.add(10);
		Value.add(23);
		
		
		System.out.println("Lowest Value is "+Value.first());
		System.out.println("Highest Value is "+Value.last());
	}

}
