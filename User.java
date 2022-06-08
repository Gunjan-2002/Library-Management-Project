package Library_Management_System;

import java.io.Serializable;

@SuppressWarnings("serial")
abstract public class User implements Serializable
{
	String id;
	String username;
	String password;
	String name;
	String age;
	
	User(String id , String username , String password , String name, String age)
	{
		this.age=age;
		this.id=id;
		this.name=name;
		this.password=password;
		this.username=username;
	}
   
	public void create()
	{
		
	}
	
	public void update()
	{
		
	}
}
