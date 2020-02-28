package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.util.Order;
import com.util.OrderList;

public class Orders {
	
	public static void printList(List<Order> list,Predicate<Order> nonEmptyStringPredicate,Consumer<Order> consumer)
	{
		for(int i=0;i<list.size();i++)
		{
			if(nonEmptyStringPredicate.test(list.get(i)))
			{
				consumer.accept(list.get(i));
			}
		}
	}
	
	public static void main(String args[])
	{
		 List<Order> order = new ArrayList<Order>();
		 OrderList l=new OrderList();
		 order=l.getOrders();
		 Predicate<Order> nonEmptyStringPredicate=
				 (Order s) ->
		 {
		      if(s.getLocation().equals("Accepted")||(s.getLocation().equals("Completed")))
		      {
		    	  if(s.getPrice()>10000)
		    	  {
		    		  return true;
		    	  }
		      }
		      return false;
		 };
		 Consumer<Order> consumer =
				 (Order o)->{
					 System.out.println(o);
				 };
			printList(order,nonEmptyStringPredicate,consumer);
	}
	
	

}
