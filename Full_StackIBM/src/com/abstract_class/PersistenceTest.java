package com.abstract_class;
abstract class Persistence
{
	abstract void persist();
}
class FilePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data persisted into file");
	}
}
class DatabasePersistence extends Persistence
{
	public void persist()
	{
		System.out.println("Data persisted into database");
	}
}
public class PersistenceTest
{
	public static Persistence getPersistence()
	{
		return new DatabasePersistence();
	}
	public static void main(String args[])
	{
		Persistence p=PersistenceTest.getPersistence();
		p.persist();
	}
}	