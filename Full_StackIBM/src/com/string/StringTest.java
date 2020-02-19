package com.string;
public class StringTest
{
	public static void main(String args[])
	{
		String s1="abc";
		String s2=new String("ABC");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}