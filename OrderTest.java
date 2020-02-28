package com.Collections;
import java.util.*;

public class OrderTest {

	public static void main(String[] args) {
		Set<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(22);
		hashSet.add(28);
		hashSet.add(15);
		hashSet.add(25);
		Set<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(46);
		linkedHashSet.add(39);
		linkedHashSet.add(91);
		linkedHashSet.add(22);
		Iterator<Integer> itr=hashSet.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i);
		}
		Iterator<Integer> itr1=linkedHashSet.iterator();
		while(itr1.hasNext())
		{
			int j=itr1.next();
			System.out.println(j);
		}
	}
}