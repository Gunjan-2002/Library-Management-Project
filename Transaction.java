package Library_Management_System;

import java.io.IOException;
import java.io.Serializable;
import java.time.*;
import java.util.ArrayList;


@SuppressWarnings({ "unused", "serial" })
public class Transaction implements Serializable
{
	public String transId;
	public String date;
	public String time;
	Student s;
	Books bok ;
	String dateborrowed ;
	String dueDate ;
	String returnDate;	
	
	public Transaction() 
	{
		
	}
	
	public Transaction(String transId, String date) 
	{
		this.transId = transId;
		this.date = date;
	}
	
	public Transaction(String transId, String date ,String time , Student s , Books bok , String dateborrowed , String dueDate , String returnDate) 
	{
		this.transId = transId;
		this.date = date;
		this.s=s;
		this.bok=bok;
		this.dateborrowed=dateborrowed;
		this.dueDate=dueDate;
		this.returnDate=returnDate;
		this.time=time;
	}
	

	public  void transactionDetail() 
	{
		try 
		{
			if(this.returnDate == null)
			{
				System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTransaction Detail");
				System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"Succesfully Returned the Book\n");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tStudent Name        : " + s.name);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tTransaction ID      : " + this.transId);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tTransaction Time    : " + this.time);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBook Name           : " + bok.title);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBook ID             : " + bok.bookId);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBorrowing Date      : " + dateborrowed);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tDue Date            : " + dueDate);
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------\n\n");
			}
			else
			{
				System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tTransaction Detail");
				System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"Succesfully Returned the Book\n");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tStudent Name        : " + s.name);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tTransaction ID      : " + this.transId);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tTransaction Time    : " + this.time);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBook Name           : " + bok.title);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBook ID             : " + bok.bookId);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tBorrowing Date      : " + dateborrowed);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tDue Date            : " + dueDate);
				System.out.println("\t\t\t\t\t\t\t\t\t\t\tReturn Date         : " + returnDate);
				System.out.println();
				System.out.println("\t\t\t\t\t\t\t\t\t\t--------------------------------------------------------\n\n");
			}
			
		} 
		catch (Exception e) 
		{
//			System.out.println(e);
		}
		
			
		
		}	
	
	public String toString()
	{
		System.out.println("\n\n-----------------------------------------------------------------------------------------------"
							+ "-------------------------------");
		
		return "\t\t\t\t\t\tTransaction Details " + "\n----------------------------------------------------------------------------------------------------------"
				+ "--------------------"  + "\n\nID : " + this.transId + "\nTime : " + this.time +"\nStudent Name : " + this.s.name + "\nBook Name : " + this.bok.title +
				"\nBorrowed Date : " + this.dateborrowed + "\nDue Date : " + this.dueDate + "\nReturn Date : " + this.returnDate +
	              "\n-----------------------"
	            + "-------------------------------------------------------------------------------------------------------";
	}
	
	
	

	
}
