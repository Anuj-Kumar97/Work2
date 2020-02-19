package com.oops;
class Account
{
	private int accId;
	private String name;
	private int bal;
	public Account(int accId, String name, int bal)
	{
		this.accId=accId;
		this.name=name;
		this.bal=bal;
	}
	public void deposit(int amt)
	{
		int newbal=bal+amt;
		this.bal=newbal;
	}
	public void withdraw(int amt)
	{
		int wbal=bal-amt;
		this.bal=wbal;
	}
	public String toString()
	{
		return "Amount: "+this.bal;
	}
}
public class AccountTest
{
	public static void main(String args[])
	{
		Account a1=new Account(001,"Anuj",2000);
		Account a2=new Account(002,"Ajay",3000);
		a1.deposit(200);
		a2.withdraw(300);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}
	
			