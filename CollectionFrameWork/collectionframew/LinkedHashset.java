package com.enfy.collectionframew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

//1.Exploring methods  -- add(obj), remove(obj), clear(),size()
//2.Explore Iterators  --(insertion order is not preserved)
//3.Iterators			--enhanced for, foreach, iterator

public class LinkedHashset {
	public static void main(String[] args) {
	
		HashSet<String> a1=new HashSet<String>();
		System.out.println("It does not maintain order of elements.");
		System.out.println("\n💎💎=======not allow simple for loop=========\n");
//		
		a1.add("Bingo");
		a1.add("neha");
		a1.add("rajesh");
		a1.add("pratiksha");
		a1.add("abhay");
		a1.add("nitin");
		a1.add("kumar");
		
		
		a1.remove("pratiksha");
		a1.remove(3);
		a1.contains("rajesh");
		
		
		System.out.println("=====remove method===\n");
		System.out.println(a1.remove(a1.contains("kumar"))?false:true);
		
		System.out.println("\n===============enhanced for =========\n");
		for(String t:a1)
			System.out.println(t);
		
		
		boolean r =a1.contains("rajesh");
		System.out.println(r);
		
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
		
		
		System.out.println("\n=== not allow hasnext() ===\n");
//		while(litr.hasNext())
//		{
//			String t=litr.next();
//			System.out.println(t);
//		}
//		
		System.out.println("\n===not allow hasprevious()===\n");
//		
//		while(litr.hasPrevious())
//		{
//			String t =litr.previous();
//			System.out.println(t);
//		}

		
		System.out.println("===========to string ============");
		a1.toString();
		System.out.println(a1);
		
	}

	
}
