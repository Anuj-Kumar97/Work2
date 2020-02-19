package com.cloning;
class Date implements Cloneable
{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString() 
	{
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	public Object clone()
	{
		try
		{
			return super.clone();
		} 
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
class Employee implements Cloneable
{
	private Date dob;
	public Employee(Date dob)
	{
		this.dob=dob;
	}
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob)
	{
		this.dob=dob;
	}
	public Object clone()
	{
		try
		{
			Employee e=(Employee)super.clone();
			e.setDob((Date)e.getDob().clone());
			return e;
		} 
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public String toString()
	{
		return "Employee {dob="+dob+"}";
	}
}
public class CloneTest
{
	public static void main(String args[])
	{
		Date dt=new Date(3,7,2017);
		Employee e1=new Employee(dt);
		Employee e2=(Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("Shallow copy:"+(e1.getDob()==e2.getDob()));
	}
}
	