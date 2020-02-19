package com.oops;
class Employee
{
	private int id;
	private String name;
	private int sal;
	public Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public double getSal(){
		return this.sal;
	}
}
class Manager extends Employee
{
	private int incentive;
	public Manager(int id,String name,int sal,int incentive)
	{
		super(sal,name,sal);
		this.incentive=incentive;
	}
	public int getIncentive()
	{
		return this.incentive;
	}
	public double getSal()
	{
		return super.getSal() + this.incentive;
	}
	public String toString()
	{
		return "Salary : "+this.getSal();
	}
}
class Labour extends Employee
{
	private int overtime;
	public Labour(int id,String name,int sal,int overtime)
	{
		super(sal,name,sal);
		this.overtime=overtime;
	}
	public int getOvertime()
	{
		return this.overtime;
	}
	public double getSal()
	{
		return super.getSal() + this.overtime;
	}
	public String toString()
	{
		return "Salary : "+this.getSal();
	}
}
public class EmployeeTest
{
	public static double totalSal(Employee emp[])
	{
		double totSal=0.0;
		for(int i=0;i<emp.length;i++)
		{
			totSal=totSal+emp[i].getSal();
		}
		return totSal;
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[4];
		e[0]=new Manager(1,"AB",10000,1000);
		e[1]=new Manager(2,"CD",12000,3000);
		e[2]=new Labour(3,"EF",7000,1500);
		e[3]=new Labour(4,"GH",8000,1700);
		for(int i=0;i<e.length;i++)
		System.out.println(e[i]);
		System.out.println("Total Salary:"+totalSal(e));
	}
}
		
		
		
		
		
		
		
	