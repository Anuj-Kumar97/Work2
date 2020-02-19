package com.oops;
class Date
{
	private int day;
	private int month;
	private int year;
	public Date()
	{
		this.day=12;
		this.month=02;
		this.year=2020;
	}
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setYear(int day)
	{
		this.year=year;
	}
	public void printDate()
	{
		System.out.println(getDay()+"/"+getMonth()+"/"+getYear());
	}
}
public class DateTest
{
	public static void main(String args[])
	{
		Date d1=new Date();
		Date d2=new Date(27,04,2015);
		d1.printDate();
		d2.printDate();
	}
}