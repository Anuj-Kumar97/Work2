package com.Collections;
import java.util.*;
class DOB
{
	private int day;
	private int month;
	private int year;
	public DOB(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "DOB [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	@Override
	public boolean equals(Object d) {
			DOB dob = (DOB) d;
			if(this.year>dob.year)
				return false;
			else if(this.year<dob.year)
				return false;
			else if (this.year==dob.year && this.month > dob.month)
				return false;
			else if (this.year==dob.year && this.month < dob.month)
				return false;
			else if (this.year==dob.year && this.month == dob.month && this.day > dob.day)
				return false;
			else if (this.year==dob.year && this.month == dob.month && this.day < dob.day)
				return true;
			else
				return true;
		}
	@Override
	public int hashCode()
	{
		return 10;	
	}
}

public class HashMapTest {

	public static void main(String[] args) {
		Map<DOB,String> hm=new HashMap<DOB,String>();
		hm.put(new DOB(12,12,1997),"AB");
		hm.put(new DOB(17,5,1998),"CD");
		hm.put(new DOB(12,12,1994),"EF");
		hm.put(new DOB(14,1,1997),"GH");
		Iterator<DOB> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(hm.get(new DOB(12,12,1997)));
	}

}
