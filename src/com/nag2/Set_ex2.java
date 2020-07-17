package com.nag2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + ",");
		}

	}

}
