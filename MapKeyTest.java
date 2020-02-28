package com.Collections.Generics;
import java.util.*;
public class MapKeyTest {
	static void printHashMap(HashMap<? extends Number,?> hm)
	{
		Iterator <?> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap();
		hmap.put(1,"A");
		hmap.put(2,"BH");
		HashMap<Double,Boolean> hmap1=new HashMap();
		hmap1.put(23.44,true);
		printHashMap(hmap);
		printHashMap(hmap1);
	}

}
