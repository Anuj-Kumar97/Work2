package com.Collections;
import java.util.*;
class User implements Comparable<User> {
	private String name;
	private String id;
	private String password;
	public User(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	@Override
	public int compareTo(User o) {
		if(this.name.compareTo(o.name)>0)
		return 1;
		else if(this.name.compareTo(o.name)<0)
			return -1;
		else 
			return 0;
	}
	
}
public class ChatTest{
	
	private static Map<String, TreeSet<User>> hmapUsers=new HashMap<String, TreeSet<User>>();
	private static Map<String, List<String>> hmapMessages=new HashMap<String, List<String>>();
	
	public static void main(String[] args) {
		boolean CREATE_CHATROOM=true;
		Scanner sc=new Scanner(System.in);
		System.out.println(" 1.Create a chatroom\n 2.Add the user\n 3.User login\n 4.Send a message\n 5.Display messages from a specific chatroom\n 6.List down all users belonging to the specific chatroom\n 7.Logout\n 8.Delete an user\n 9.Delete chatroom");
		System.out.println("Enter your choice\n");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		if(CREATE_CHATROOM){
			if(hmapUsers.containsKey(""))
			{
			}
			else
			{
				hmapUsers.put("Sport",new TreeSet<User>());
				hmapMessages.put("Sport",new ArrayList<String>());
				System.out.println("Chatroom ready");
			}
			break;
		}
		case 2:
			int op=0;
			do {
				System.out.println("Enter user name");
				String name=sc.next();
			}while(op==1);
		default:
			System.out.println("Invalid response");
		/*Set<User> ts=new TreeSet<User>();
			ts.add(u1);
			ts.add(u2);
			Iterator<User> itr=ts.iterator();
			while(itr.hasNext())
			{
				User u=itr.next();
				System.out.println(u);
			}*/
		
	}
	}

}
