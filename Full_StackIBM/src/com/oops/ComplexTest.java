package com.oops;
class Complex
{
	private int real;
	private int imag;
	public Complex(int real, int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	public Complex add(Complex n)
	{
		int r=this.real+n.real;
		int i=this.imag+n.imag;
		Complex t=new Complex(r,i);
		return t;
	}
	@Deprecated
	public Complex sub(Complex n)
	{
		int r=this.real-n.real;
		int i=this.imag-n.imag;
		Complex t=new Complex(r,i);
		return t;
	}
	public Complex prod(Complex n)
	{
		int r=(this.real * n.real)-(this.imag * n.imag);
		int i=(this.imag * n.real)-(this.real * n.imag);
		Complex t=new Complex(r,i);
		return t;
	}
	@Override
	public String toString()
	{
		return this.getreal() + " + "+this.getimag()+"i";
	}
	public int getreal()
	{
		return this.real;
	}
	public int getimag()
	{
		return this.imag;
	}
}
public class ComplexTest
{
	@SuppressWarnings({"deprecation"})
	public static void main(String[] args)
	{
		Complex c1=new Complex(2,3);
		Complex c2=new Complex(3,7);
		Complex c3=c1.add(c2);
		System.out.println("Sum is:"+c3.toString());
		Complex c4=c1.sub(c2);
		System.out.println("Diff is:"+c4.toString());
		Complex c5=c1.prod(c2);
		System.out.println("Product is:"+c5.toString());
	}
}