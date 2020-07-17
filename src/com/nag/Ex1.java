package com.nag;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		System.out.println(set);
	}

}
