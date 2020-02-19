package com.stack;
class StackedArray
{
	private int ary[];
	private int top=0;
	public StackedArray()
	{
		ary=new int[10];
	}
	public StackedArray(int size)
	{
		ary=new int[size];
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(top>=ary.length-1)
			return true;
		else
			return false;
	}
	public void push(int x)
	{
		if(!isFull()){
			ary[top]=x;
			++top;
		}
	}
	public void pop()
	{
		if(!isEmpty()){
			ary[top]=0;
			--top;
		}
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for(int j=0;j<ary.length;j++)
		{
			sb.append(ary[j]+" ");
		}
		return sb.toString();
	}
}
public class StackedArrayDemo
{
	public static void main(String[] args)
	{
		StackedArray s1=new StackedArray(5);
		s1.push(7);
		s1.push(5);
		s1.push(3);
		s1.push(6);
		s1.push(10);
		s1.pop();
		System.out.println("Array :"+s1.toString());
	}
}
	