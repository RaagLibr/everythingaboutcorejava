package com.enfy.collectionframew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

//1.Exploring methods  -- add(obj),
//2.Explore Iterators 
//3.Iterators

public class Treeset {
	public static void main(String[] args) {
		TreeSet<String> a1= new TreeSet<String>();
		a1.add("Bingo");
		a1.add("neha");
		a1.add("rajesh");
		a1.add("pratiksha");
		a1.add("abhay");
		a1.add("nitin");
		a1.add("kumar");
		a1.remove("pratiksha");
		a1.contains("rajesh");
		
		
		System.out.println("=====remove method===\n");
		
		System.out.println("\n===============enhanced for =========\n");
		for(String t:a1)
			System.out.println(t);
		
		System.out.println("\n💎💎not all==========simple for loop=========\n");
		
		
		
		boolean r =a1.contains("rajesh");
		System.out.println(r);
		
		System.out.println("=======contains all mehtod");
		System.out.println(a1.containsAll(a1));
		
		a1.add("Ragini");
		System.out.println("=======contains all mehtod");
		System.out.println(a1.containsAll(a1));
		
		if(a1.contains("neha"))
		{
			System.out.println("given obj is present in the ArrayList.");
		}
		
		
		System.out.println("\n💎=======Using forEach() mehtod=======\n");
		a1.forEach(s->System.out.println(s));
		
		System.out.println("\n======Using iterator object and iterator() mehto ====\n");
		
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext())
		{
		String t = itr.next();
		System.out.println(t);
		}
		
		System.out.println("\nNot allo=======Using listIterator next()==");
		
		System.out.println("\nNot allow===hasnext()===\n");
		
		System.out.println("\nNot allow===hasprevious()===\n");
		
	
		
		System.out.println("===========to string ============");
		a1.toString();
		System.out.println(a1);
		
	}

	
}
