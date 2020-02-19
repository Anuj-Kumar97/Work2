package com.interface1;
interface Printable
{
	void print();
}
class Employee implements Printable
{
	public void print()
	{
		System.out.println("Employee");
	}
}
class Circle implements Printable
{
	public void print()
	{
		System.out.println("Circle");
	}
}
public class PrintTest
{
	public static void printAll(Printable p[])
	{
		for(int i=0;i<p.length;i++)
		{
			p[i].print();
		}
	}
	public static void main(String args[])
	{
		Printable p[]=new Printable[4];
		p[0]=new Employee();
		p[1]=new Circle();
		p[2]=new Circle();
		p[3]=new Employee();
		printAll(p);
	}
} 