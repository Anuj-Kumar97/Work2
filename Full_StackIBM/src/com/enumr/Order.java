package com.enumr;
enum Status {
	NEW(5), REJECTED(2), ACCEPTED(3), COMPLETED(4);
	int value;
	Status(int value)
	{
		this.value=value;
	}
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) 
	{
		this.value = value;
	}
};
public class Order 
{
	private int id;
	private int price;
	private int qty;
	private String name; 
	private int status;
	public Order(String name,int qty,int price,int id,int status)
	{
		this.name=name;
		this.qty=qty;
		this.price=price;
		this.id=id;
		this.status=status;
	}
	public String toString()
	{
		return "Name: "+this.name+" Quantity: "+this.qty+" Price: "+this.price+" ID: "+this.id+" status: "+this.status;
	}
	public static void main(String[] args) 
	{
		Order o=new Order("Anuj",2,10,101,Status.NEW.getValue());
		System.out.println(o);
	}

}