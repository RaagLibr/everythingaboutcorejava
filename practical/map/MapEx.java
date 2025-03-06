package com.enfy.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class MapEx {
	public static void main(String[] args) {
		
		Map map;
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(-33,"Ragini");
		hm.put(33,"Laxmi");
		hm.put(200,"Div's");
		hm.put(40,"Pooja");
		hm.put(200, "vaishu");
		hm.put(100, "vaishu");
		hm.put(110, null);
		
		System.out.println("\n\n======HashMap==========");
		hm.forEach((k,v)->System.out.println(k+""+v));
		System.out.println(hm.containsKey(44));
		System.out.println("keyset = "+hm.keySet());
		
		System.out.println("\n\n=====enhanced for loop keyset for Set===");
		Set<Integer> kset= hm.keySet();
		for(Integer t : kset)
		{
			System.out.println(t);
		}
		
	
		System.out.println("\n\n====collection");
		
		
		
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(-33,"Ragini");
		lhm.put(33,"Laxmi");
		lhm.put(200,"Div's");
		lhm.put(40,"Pooja");
		lhm.put(200, "vaishu");
		
		System.out.println("\n\n======LinkedHashMap==========");
		lhm.forEach((k,v)->System.out.println(k+""+v));
		System.out.println("size of map = "+lhm.size());
		
		
		
		
		
	
	}
}
