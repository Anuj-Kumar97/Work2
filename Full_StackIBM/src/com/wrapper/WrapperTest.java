package com.wrapper;
class WrapperTest
{
	public static void main(String args[])
	{
		int size=args.length,t;
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
				