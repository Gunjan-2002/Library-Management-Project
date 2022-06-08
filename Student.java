package Library_Management_System;

import java.io.*;
import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;


@SuppressWarnings({ "unused", "serial" })
public class Student extends User implements Serializable
{
	public String course;
	public String year;
	Transaction t;
	Books bk;
	ArrayList<Books> atl = new ArrayList<Books>();
	ArrayList<Transaction> at2 = new ArrayList<>();
	
	// Initially Call This Constructor to set Student Details
	Student(String id, String username, String password, String name, String age , String course , String year) 
	{
		super(id, username, password, name, age);
		this.course=course;
		this.year=year;
	}
	
//	public void studentDetails()
//	{
//		System.out.println("---------------------------------------------------------------------------------------------------------------");
//		System.out.println();
//		System.out.println("\t\t\t\t\tSTUDENT DETAIL");
//		System.out.println();
//		System.out.println("---------------------------------------------------------------------------------------------------------------");
//		System.out.println("Student Name : " + super.name);
//		System.out.println("ID           : " + super.id);
//		System.out.println("Age          : " + super.age);
//		System.out.println("Username     : " + super.username);
//		System.out.println("Course       : " + course);
//		System.out.println("Year         : " + year);
//		System.out.println();
//		browseBooks();		
//	}
	
	
	public String toString()
	{
		System.out.println("\n\n-----------------------------------------------------------------------------------------------"
							+ "-------------------------------");
		
		return "\t\t\t\t\t\tStudent Details " + "\n----------------------------------------------------------------------------------------------------------"
				+ "--------------------"  + "\n\nID : " + this.id + "\t\tName : " + this.name + "\t\tAge : " +
	            this.age + "\t\tDepartment : " + this.course +  "\t\tYear : " + this.year + "\t\tUsername : " + this.username + "\n-----------------------"
	            + "-------------------------------------------------------------------------------------------------------";
	}
}
