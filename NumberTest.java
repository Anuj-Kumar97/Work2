package com.Collections.Generics;

import java.util.*;

public class NumberTest {
	public static void printNo(List<? extends Number> list) {
		for(Object o:list)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<Integer> listofint=new ArrayList<Integer>();
		List<Double> listofdoub=new ArrayList<Double>();
		List<Float> listofflt=new ArrayList<Float>();
		List<Boolean> listofbool=new ArrayList<Boolean>();
		List<String> listofstr=new ArrayList<String>();
		listofint.add(21);
		listofint.add(11);
		listofint.add(14);
		listofdoub.add(21.8998);
		listofflt.add((float) 3.67);
		listofbool.add(true);
		listofstr.add("ABC");
		printNo(listofint);
		printNo(listofdoub);
		printNo(listofflt);
		//printNo(listofstr);
		//printNo(listofbool);
	}

}
