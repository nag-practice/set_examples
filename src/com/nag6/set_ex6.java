package com.nag6;

import java.util.HashSet;
import java.util.Set;

public class set_ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		System.out.println(set);
		
		HashSet nset = new HashSet();
		nset =(HashSet) set.clone();
		System.out.println(nset);
		String arr[]= new String[6];
		nset.toArray(arr);
		System.out.println(arr[1]);
	}

}
