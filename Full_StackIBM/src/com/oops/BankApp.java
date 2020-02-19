package com.oops;
class Bank
{
	private int accno;
	private String name;
	private int amt;
	public Bank(int accno,String name,int amt)
	{
		this.accno=accno;
		this.name=name;
		this.amt=amt;
	}
	public int getAmt()
	{
		return this.amt;
	}
}
class Savings extends Bank
{
	private int fd;
	public Savings(int accno,String name,int amt,int fd)
	{
		super(accno,name,amt);
		this.fd=fd;
	}
	public int getFd()
	{
		return this.fd;
	}
	public int getAmt()
	{
		return super.getAmt()+this.fd;
	}
	public String toString()
	{
		return "Amount :"+getAmt();
	}
}
class Current extends Bank
{
	private int cc;
	public Current(int accno,String name,int amt,int cc)
	{
		super(accno,name,amt);
		this.cc=cc;
	}
	public int getCc()
	{
		return this.cc;
	}
	public int getAmt()
	{
		return super.getAmt()+this.cc;
	}
	public String toString()
	{
		return "Amount :"+getAmt();
	}
}
public class BankApp
{
	public static int totalAmt(Bank b[])
	{
		int totAmt=0;
		for(int i=0;i<b.length;i++)
		{
			totAmt=totAmt+b[i].getAmt();
		}
		return totAmt;
	}
	public static void main(String args[])
	{
		Bank bn[]=new Bank[4];
		bn[0]=new Savings(1,"AB",10000,1000);
		bn[1]=new Savings(2,"CD",12000,3000);
		bn[2]=new Current(3,"EF",7000,1500);
		bn[3]=new Current(4,"GH",8000,1700);
		for(int i=0;i<bn.length;i++)
		System.out.println(bn[i]);
		System.out.println("Total Amount:"+totalAmt(bn));
	}
}