package Library_Management_System;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Books implements Serializable
{
	protected String bookId;
	public String title;
	public String details;
	public String publisher;
	public int noPages;
	public String dateborrowed;
	public String dueDate;
	public String returnDate;
	
	public Books() 
	{
		
	}
	
	public Books(String bookId, String title, String publisher , int noPages) 
	{
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.noPages=noPages;
	}

	


	public Books(String bookId, String title, String details, String publisher, String dateborrowed, String dueDate,  String returnDate) 
	{
		super();
		this.bookId = bookId;
		this.title = title;
		this.details = details;
		this.publisher = publisher;
		this.dateborrowed = dateborrowed;
		this.dueDate = dueDate;
		this.returnDate=returnDate;
	}

	
	public void setBorrowDate_dueDateforbook(String dateborrowed , String dueDate , String returnDate) 
	{
		this.dateborrowed = dateborrowed;
		this.dueDate=dueDate;
		this.returnDate=returnDate;
	}

	public void printBookDetail()
	{
		System.out.println("Book Title     : " + title);
		System.out.println("Book ID        : " + bookId);
		System.out.println("Publisher Name : " + publisher);
		System.out.println("Borrowing Date : " + dateborrowed);
		System.out.println("Due Date       : " + dueDate);
		System.out.println("Return Date    : " + returnDate);
	}
	
	public String toString()
	{
		System.out.println("\n\n-----------------------------------------------------------------------------------------------"
							+ "-------------------------------");
		
		return "\t\t\t\t\t\tBook Details " + "\n----------------------------------------------------------------------------------------------------------"
				+ "--------------------"  + "\n\nID : " + this.bookId + "\t\tName : " + this.title + "\t\tPublisher : " +
	              "\n-----------------------"
	            + "-------------------------------------------------------------------------------------------------------";
	}
	
	
//	public void add(String bookId, String title, String publisher)
//	{
//		this.bookId = bookId;
//		this.title = title;
//		this.publisher = publisher;
//	}
	
	public void update()
	{
		  
	}
}
