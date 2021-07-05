package com.collections;
import java.util.HashMap;
import java.util.Set;
public class DuplicateChar {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s ="DevlabsAlliance";
HashMap<Character,Integer> h=new HashMap<Character,Integer>();
char[] c=s.toCharArray();

for(Character i:c) {
	if(h.containsKey(i)) {
		h.put(i, h.get(i)+1);
	}else {
		h.put(i, 1);
	}
	
}
Set<Character> Keys=h.keySet();
for(Character i:Keys) {
	if (h.get(i) > 1) {  
        System.out.println(i + "  is " + h.get(i) + " times");  
    }  
}

	}

}
