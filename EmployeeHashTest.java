package com.Collections;

import java.util.HashMap;
import java.util.Iterator;

class Employee {
	private int id;
	public Employee(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override 
	public boolean equals(Object o)
	{
		return true;
	}
	@Override
	public int hashCode()
	{
		return 100;
	}
}
public class EmployeeHashTest {
	public static void main(String[] args)
	{
		HashMap<Employee, String> hme=new HashMap<>();
		hme.put(new Employee(101), "ABC");
		hme.put(new Employee(102), "DEF");
		hme.put(new Employee(103), "GHI");
		Iterator<Employee> ie=hme.keySet().iterator();
		while (ie.hasNext()) {
			System.out.println(ie.next());
		}
		System.out.println(hme.get(new Employee(101)));
	}

}
