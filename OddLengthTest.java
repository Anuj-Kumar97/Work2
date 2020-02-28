package com.lambda;
import java.util.*;

public class OddLengthTest {

public static void main(String[] args) {
	
	List<String> students=new ArrayList();
	students.add("Anuj");
	students.add("Amrit");
	students.add("Rahul");
	students.add("Akshay");
	students.add("Yash");
	students.removeIf(st -> (st.length()%2==1));
	Iterator<String> str=students.iterator();
	while(str.hasNext())
	{
		System.out.println(str.next());
	}
   }


}