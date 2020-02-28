package com.Collections.Generics;
import java.util.*;
public class WrapperTest<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		WrapperTest<Integer> wt=new WrapperTest();
		wt.setT(10);
		int x=wt.getT();
		System.out.println(x);
	}

}
