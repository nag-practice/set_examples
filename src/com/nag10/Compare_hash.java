package com.nag10;

import java.util.HashSet;

public class Compare_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		System.out.println(set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("one");
		set1.add("three");
		
		HashSet<String>result_set = new HashSet<String>();
		 for (String element : set){
             System.out.println(set1.contains(element) ? "Yes" : "No");
          }   
            System.out.print(set1);
		
		
	
	}
}
