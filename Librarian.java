package Library_Management_System;

import java.io.Serializable;
import java.util.ArrayList;


@SuppressWarnings("serial")
public class Librarian extends User implements Serializable
{
	String department;
	Transaction t;
    
    Librarian(String id, String username, String password, String name, String age, String department ) 
	{
		super(id, username, password, name, age);
		this.department=department;
	}
	
	public String toString()
	{
		System.out.println("\n\n-----------------------------------------------------------------------------------------------"
							+ "-------------------------------");
		
		return "\t\t\t\t\t\tL Details " + "\n----------------------------------------------------------------------------------------------------------"
				+ "--------------------"  + "\n\nID : " + this.id + "\t\tName : " + this.name + "\t\tAge : " +
	            this.age + "\t\tDepartment : " + this.department + "\t\tUsername : " + this.username + "\n-----------------------"
	            + "-------------------------------------------------------------------------------------------------------";
	}
	
	static void displayLibrarianList(ArrayList<Librarian> ll)
	{
		System.out.println("\n\t\t\t\t\t..........  Librarian List  ..........\n");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(String.format("%-10s%-30s%-10s%-30s%-30s%-30s", "ID","Name" , "Age"
				,"Department" , "Username" ,"Password"));
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		
		for(Librarian e : ll)
		{
			System.out.println(String.format("%-10s%-30s%-10s%-30s%-30s%-30s", e.id,e.name,e.age
				,e.department , e.username , e.password));
		}
		System.out.println("-----------------------------------------------------------------------"
							+ "---------------------------------------------------------");
		System.out.println("\n\n\n\n");
	}
	
	 static void displayStudentList(ArrayList<Student> sl)
	{
		System.out.println("\n\t\t\t\t\t..........  Student List  ..........\n");
		System.out.println("--------------------------------------------------------------------------"
							+ "-----------------------------------------------------------");
		System.out.println(String.format("%-10s%-30s%-10s%-30s%-10s%-25s%-20s", "ID","Name" , "Age"
				,"Course" , "Year" , "Username" , "Number of Books"));
		System.out.println("----------------------------------------------------------------------------"
							+ "---------------------------------------------------------");
		
		for(Student e : sl)
		{
			System.out.println(String.format("%-10s%-30s%-10s%-30s%-10s%-25s%-20s", e.id,e.name,e.age
				,e.course , e.year , e.username , e.atl.size()));
		}
		System.out.println("----------------------------------------------------------------------------"
				+ "---------------------------------------------------------");
		System.out.println("\n\n\n\n");
	}
	
	 static void displayBookList(ArrayList<Books> bl)
	{
		System.out.println("\n\t\t\t\t\t..........  Book List  ..........\n");
		System.out.println("-----------------------------------------------------------------"
							+ "---------------------------------------------------------------");
		System.out.println(String.format("%-10s%-40s%-40s%-10s", "ID","Title" , "Publisher"
							,"Number of Pages"));
		System.out.println("---------------------------------------------------------------------"
							+ "-----------------------------------------------------------");
		
		for(Books e : bl)
		{
			System.out.println(String.format("%-10s%-40s%-40s%-10s", e.bookId,e.title,e.publisher
				,e.noPages));
		}
		System.out.println("---------------------------------------------------------------------"
							+ "-----------------------------------------------------------");
		System.out.println("\n\n\n\n");
	}
	 
	    static void displayTransactionList(ArrayList<Transaction> tl)
		{
			System.out.println("\n\t\t\t\t\t\t\t..........  Transaction History  ..........\n");
			System.out.println("------------------------------------------------------------------------------------------------"
								+ "-------------------------------------------------------------------------------------");
			System.out.println(String.format("%-10s%-20s%-20s%-25s%-35s%-20s%-20s%-20s%-20s", "ID","Date" ,"Time", "Name"
								,"Book" , "Date Borrowed" , "Due Date" , "Return Date" , "Status"));
			System.out.println("------------------------------------------------------------------------------------------------"
								+ "-------------------------------------------------------------------------------------");
			
			for(Transaction e : tl)
			{
				System.out.println(String.format("%-10s%-20s%-20s%-25s%-35s%-20s%-20s%-20s%-20s", e.transId,e.date,e.time,e.s.name
					,e.bok.title , e.dateborrowed , e.dueDate , e.returnDate , (e.returnDate == null) ? "Borrowed" : "Returned"));
			}
			System.out.println("------------------------------------------------------------------------------------------------"
								+ "-------------------------------------------------------------------------------------");
			System.out.println("\n\n\n\n");
		}
}
