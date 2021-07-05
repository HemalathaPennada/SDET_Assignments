package com.collections;
import java.util.*;

public class VerifyKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"Apple");
hm.put(2,"Mango");
hm.put(3, "Grapes");
hm.put(4, "Papaya");

hm.containsValue("Mango");
if(hm.containsKey(2)==true) {
	System.out.print(hm.get(2));
	
}
	}

}
