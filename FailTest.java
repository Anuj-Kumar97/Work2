package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailTest extends Thread{

	public static void main(String[] args) {
		List<Integer> a=new CopyOnWriteArrayList<>();
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				while(true)
				{
					a.add(20);
					try
					{
						Thread.sleep(50);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}		
			}
		};
		Runnable r2=new Runnable() {
			@Override
			public void run() {
				while(true)
				{
					Iterator<Integer> itr=a.iterator();
					while(itr.hasNext())
					{
						int i=itr.next();
						System.out.println(i);
					}
					try
					{
						Thread.sleep(40);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}	
			}	
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}

}
