package com.nag11;

import java.util.HashSet;

public class retain_common_elements {

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
		boolean b = set1.retainAll(set);
		
		System.out.println(b);
		
		System.out.println(set1);
		
		
		System.out.println("***************** Remove All Elements *******************");
		
		set.removeAll(set);
		
		System.out.println(set);
	}

}
