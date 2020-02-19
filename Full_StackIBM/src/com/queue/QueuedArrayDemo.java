package com.queue;
class QueuedArray
{
	private int ary[];
	private int front=0;
	private int rear=0;
	public QueuedArray()
	{
		ary=new int[10];
	}
	public QueuedArray(int size)
	{
		ary=new int[size];
	}
	public boolean isEmpty()
	{
		if(rear==0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(rear>=ary.length)
			return true;
		else
			return false;
	}
	public void push(int x)
	{
		if(!isFull()){
			ary[rear]=x;
			++rear;
		}
	}
	public void pop()
	{
		if(!isEmpty()){
			--rear;
			for(int i=0;i<rear;i++)
			{
				ary[i]=ary[i+1];
			}
			ary[rear]=0;
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
public class QueuedArrayDemo
{
	public static void main(String[] args)
	{
		QueuedArray s1=new QueuedArray(5);
		s1.push(7);
		s1.push(5);
		s1.push(3);
		s1.push(6);
		s1.push(11);
		s1.pop();
		s1.push(33);
		System.out.println("Array :"+s1.toString());
	}
}
	