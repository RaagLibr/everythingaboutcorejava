package com.enfy.collectionframew;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//1.Exploring methods  -- add(obj),
//2.Explore Iterators 
//3.Iterators

public class VectorEx {
	public static void main(String[] args) {
		Vector<String> a1= new Vector<String>();
		a1.add("Bingo");
		a1.add("neha");
		a1.add("rajesh");
		a1.add("pratiksha");
		a1.add("abhay");
		a1.add("abhay");
		
		
		a1.add("nitin");
		a1.add("kumar");
		a1.add(4,"ravi");
		a1.remove("pratiksha");
		a1.remove(3);
		a1.contains("rajesh");
		a1.get(3);
		
		
		System.out.println(a1.lastIndexOf("nitin"));
		System.out.println("=====remove method===\n");
		System.out.println(a1.remove(a1.contains("kumar"))?false:true);
		
		System.out.println("\n===============enhanced for =========\n");
		for(String t:a1)
			System.out.println(t);
		
		System.out.println("\n💎💎==========simple for loop=========\n");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println(a1.get(3));
		
		
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
		
		System.out.println("\n=======Using listIterator next()==");
		ListIterator<String> litr= a1.listIterator();
		
		System.out.println("\n===hasnext()===\n");
		while(litr.hasNext())
		{
			String t=litr.next();
			System.out.println(t);
		}
		
		System.out.println("\n===hasprevious()===\n");
		
		while(litr.hasPrevious())
		{
			String t =litr.previous();
			System.out.println(t);
		}

		
		System.out.println("===========to string ============");
		a1.toString();
		System.out.println(a1);
		
	}

	
}
