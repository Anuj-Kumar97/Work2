package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class FailSafeHash extends Thread{

	public static void main(String[] args) {
		Map<Integer,String> a=new ConcurrentHashMap<>();
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				while(true)
				{
					a.put(30,"A");
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
					Iterator<Integer> itr=a.keySet().iterator();
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