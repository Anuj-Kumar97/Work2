package com.Threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
public class SynchronizeTest extends Frame implements Runnable {

	Thread t1,t2,t3;
	int y1 = 400, y2 = 400, y3 = 400;
	volatile int i=0;
	public SynchronizeTest() {
		super("Synchronize Test");
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("RED");
		t2.setName("GREEN");
		t3.setName("BLUE");
		t1.start();
		t2.start();
		t3.start();
		setBackground(Color.BLACK);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public void run()
	{
		boolean flag=true;
		boolean flag1=true;
		boolean flag2=true;
		if(Thread.currentThread().getName().equals("RED")) {
		while(true) {
			while(y1>200) {
			y1=y1-3;
			repaint();
			if(y1==200)
			{
				
			}
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
			while(y1!=400){
				y1=y1+3;
				repaint();
				try
				{
					Thread.sleep(5);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}}
			else if(Thread.currentThread().getName().equals("GREEN")) {
				while(true) {
					while(y2>200) {
					y2=y2-4;
					repaint();
					try
					{
						Thread.sleep(20);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
					/*if(flag1==true)
					{
						try
						{
							wait();
							i++;
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
						flag1=false;
						notify();
					}*/
					while(y2!=400){
						y2=y2+4;
						repaint();
						try
						{
							Thread.sleep(20);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
			}}
			else if(Thread.currentThread().getName().equals("BLUE")) {
				while(true) {
					while(y3>200) {
						y3=y3-5;
						repaint();
						try
						{
							Thread.sleep(10);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
					/*if(flag2==true)
					{
						try
						{
							wait();
							i++;
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
						flag2=true;
						notify();
					}*/
					while(y3!=400){
						y3=y3+5;
						repaint();
						try
						{
							Thread.sleep(10);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
		}
	}
	public synchronized void update()
	{
		if(i<3) {
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
		
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) 
	{
		Frame mf = new SynchronizeTest();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}