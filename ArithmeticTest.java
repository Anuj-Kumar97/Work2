package com.lambda;
import java.util.function.*;
@FunctionalInterface
interface MathOperation
{
	int opr(int a,int b);
}
public class ArithmeticTest {

	public static void main(String[] args) {
		
		MathOperation add=(int a, int b) -> (a+b) ;
		MathOperation sub=(a,b)->(a-b);
		MathOperation mul=(int a,int b)->{return a*b;};
		MathOperation div=(int a,int b)->a/b;
		System.out.println("Addition:"+add.opr(7, 9));
		System.out.println("Subtraction:"+sub.opr(9, 7));
		System.out.println("Multiplication:"+mul.opr(9, 3));
		System.out.println("Division:"+div.opr(45, 9));
	}

}
