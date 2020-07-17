package com.nag4;

import java.util.HashSet;
import java.util.Set;

public class set_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Set set = new HashSet();
				set.add("one");
				set.add("two");
				set.add("three");
				set.add("one");
				set.add("four");
				System.out.println(set);
				
				boolean removed = set.removeAll(set);
				
				System.out.println(removed);
				System.out.println(set);
				
				boolean clear = set.isEmpty();
				
				System.out.println(clear); 
			}

		}

