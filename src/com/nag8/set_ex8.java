package com.nag8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class set_ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		System.out.println(set);
		
		TreeSet<String> tst = new TreeSet<String>(set);
		System.out.println(tst);
	
		List<String> lst = new ArrayList<String>(set);
		System.out.println(lst);
	}

}
