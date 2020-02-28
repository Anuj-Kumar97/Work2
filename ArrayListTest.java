package com.Collections;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(38);
		l.add(21);
		l.add(95);
		l.add(17);
		ListIterator<Integer> ltr=l.listIterator(l.size());
		while(ltr.hasPrevious())
		{
			int i=ltr.previous();
			System.out.println(i);
		}
	}

}
