package com.collections;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();   
		// adding elements to the ArrayList   
		list.add("Banana");   
		list.add("Apple");   
		list.add("Mango");   
		list.add("Tomato");   
		list.add("orange");   
		System.out.println("Before Sorting: "+ list);   
		   
		Collections.sort(list);   
	  
		System.out.println("After Sorting: "+ list);  
	}

}
