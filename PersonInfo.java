package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonInfo implements Comparable<PersonInfo>{
	private double height;
	private double weight;
	private String name;

	public PersonInfo(double height, double weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(PersonInfo p) {
		if(this.weight>p.weight)
		{
			return 1;
		}
		else if(this.weight<p.weight)
		{
			return -1;
		}
		else 
		{
			if(this.height>p.height)
			{
				return 1;
			}
			else if(this.height<p.height)
			{
				return -1;
			}
			else 
				return 0;
		}
	}
	@Override
	public String toString() {
		return "PersonInfo [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		PersonInfo p1=new PersonInfo(5.7,67.3,"A");
		PersonInfo p2=new PersonInfo(5.9,63.6,"B");
		PersonInfo p3=new PersonInfo(6,77.1,"C");
		PersonInfo p4=new PersonInfo(5.8,67.3,"D");
		TreeSet<PersonInfo> treeSet = new TreeSet<PersonInfo>();
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		
		Iterator<PersonInfo> itr = treeSet.iterator();
		while(itr.hasNext()) {
			PersonInfo a = itr.next();
			System.out.println(a);
	}

}
}
