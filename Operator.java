package Library_Management_System;

import java.io.*;
import java.text.*;
import java.time.*;
import java.util.*;


public class Operator 
{
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) 
	{
		String id;
		String name;
		String age;
	    String username;
	    String password;
	    String course;
	    String year;
	    String department;
		String publisher;
		int noPages;
		String dateborrowed;
		String dueDate;
		String returnDate;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> sl = new ArrayList<>();
	    ArrayList<Librarian> ll = new ArrayList<>();
	    HashMap<Integer,ArrayList<Transaction>> thmal = new HashMap<Integer,ArrayList<Transaction>>();
	    ArrayList<Books> bl = new ArrayList<>();


		File fbooks = null;
		File fstudent = null;
		File flibrarian = null;
		File ftransaction = null;
		FileInputStream fisbooks = null , fisstudent = null , fistransaction = null , fislibrarian = null;
		ObjectInputStream oisbooks = null , oisstudent = null , oistransaction = null , oislibrarian = null;
		FileOutputStream fosbooks = null , fosstudent = null , fostransaction = null , foslibrarian = null;
		ObjectOutputStream oosbooks = null , oosstudent = null , oostransaction = null , ooslibrarian = null;
		
		
		// File 1 - BooksList.txt
		try
		{
			fbooks=new File("E:\\Eclipse Java Workspace\\OOP's\\src\\Library_Management_System\\BooksList.txt");
			if(fbooks.exists())
			{
				fisbooks=new FileInputStream(fbooks);
				oisbooks=new ObjectInputStream(fisbooks);
				bl  =(ArrayList<Books>)oisbooks.readObject();
			}
		}
		catch (ClassNotFoundException cnf)
		{
			System.out.println(cnf);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
		// File 2 - StudentsList.txt
		try
		{
			fstudent=new File("E:\\Eclipse Java Workspace\\OOP's\\src\\Library_Management_System\\StudentsList.txt");
			if(fstudent.exists())
			{
				fisstudent=new FileInputStream(fstudent);
				oisstudent=new ObjectInputStream(fisstudent);
				sl  =(ArrayList<Student>)oisstudent.readObject();
			}
		}
		catch (ClassNotFoundException cnf)
		{
			System.out.println(cnf);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
		
		// File 3 - TransactionHistory.txt
		try
		{
			ftransaction=new File("E:\\Eclipse Java Workspace\\OOP's\\src\\Library_Management_System\\TransactionHistory.txt");
			if(ftransaction.exists())
			{
				fistransaction=new FileInputStream(ftransaction);
				oistransaction=new ObjectInputStream(fistransaction);
				thmal  =(HashMap<Integer,ArrayList<Transaction>>)oistransaction.readObject();
			}
		}
		catch (ClassNotFoundException cnf)
		{
			System.out.println(cnf);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
		// File 4 - LibrarianList.txt
				try
				{
					flibrarian=new File("E:\\Eclipse Java Workspace\\OOP's\\src\\Library_Management_System\\LibrarianList.txt");
					if(flibrarian.exists())
					{
						fislibrarian=new FileInputStream(flibrarian);
						oislibrarian=new ObjectInputStream(fislibrarian);
						ll  =(ArrayList<Librarian>)oislibrarian.readObject();
					}
				}
				catch (ClassNotFoundException cnf)
				{
					System.out.println(cnf);
				}
				catch (Exception e) 
				{
					System.out.println(e);
				}
		
		
		do
		{
			System.out.println("\n------------------------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------------------------------------------------------");
			System.out.println("\n\t\t\t\t\t\t\t\t\t\tWelcome to the Library Management System\n");
			System.out.println("------------------------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------------------------------------------------------");
			System.out.println("------------------------------------------------------------------------------------------------"
					+ "-----------------------------------------------------------------------------------------------------------------\n");
			System.out.println("\t\t\t\t\t\t\t\t\t\t"+" "+"1].  Add Librarian to the DataBase\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"2].  Add Student to the DataBase\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"3].  Add Book to the DataBase\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"4].  Borrow Book from Library\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"5].  Return Book to Library\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"6].  Print all available Books\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+ "7].  Check Avaibility of a Book\n" +
							   "\t\t\t\t\t\t\t\t\t\t" +" "+"8].  Print all Borrowed Books by a Student\n" +
							   "\t\t\t\t\t\t\t\t\t\t"+" "+"9].  Print Student List\n" +
							   "\t\t\t\t\t\t\t\t\t\t10]. Print Librarian List\n" +
							   "\t\t\t\t\t\t\t\t\t\t11]. Print Transaction List for particular Student\n" +
							   "\t\t\t\t\t\t\t\t\t\t12]. EXIT\n");
			
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t\tEnter your choice : ");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1 :
			{	
				System.out.println("Checking Admin Credential's");
				System.out.println("Enter ID : ");
				id=sc.next();
				int i=0;
				
				try 
				{
					for(Librarian l : ll)
					{
						if(id.equalsIgnoreCase(l.id))
						{
							i=1;
							System.out.println("Enter Username : ");
							name=sc.next();
							if(name.equals(l.username))
							{
								System.out.println("Enter Password : ");
								password=sc.next();
								if(password.equals(l.password))
								{
									System.out.println("\nEnter the following details to ADD list :\n");
									System.out.println("Enter Librarian ID :");
									id=sc.next();
									System.out.println("Enter Name :");
									name=sc.next();
									System.out.println("Enter Age :");
									age=sc.next();
									System.out.println("Enter Department :");
									department=sc.next();
									System.out.println("Enter Username :");
									username=sc.next();
									System.out.println("Enter Password :");
									password=sc.next();
									ll.add( new Librarian(id, username, password,name, age, department));
									Librarian.displayLibrarianList(ll);
									i=2;
								}
								else if(i==1)
								{
									System.out.println("Request Denied ! Reason - Wrong Password");
									break;
								}
							}
							else if(i==1)
							{
								System.out.println("Request Denied ! Reason - Wrong Username");
								break;
							}
							i++;
						}
						else if(i==0)
						{
							System.out.println("Request Denied ! Reason - Wrong ID");
							break;
						}
					}
				} 
				catch (Exception e) 
				{
					System.out.println(e);
				}
				break;
			}
			
			case 2 :
			{
				System.out.println("\nEnter the following details to ADD list :\n");
				System.out.println("Enter Student ID :");
				id=sc.next();
				System.out.println("Enter Name :");
				name=sc.next();
				System.out.println("Enter Age :");
				age=sc.next();
				System.out.println("Enter Course :");
				course=sc.next();
				System.out.println("Enter Year :");
				year=sc.next();
				System.out.println("Enter Username :");
				username=sc.next();
				System.out.println("Enter Password :");
				password=sc.next();
				sl.add(new Student(id , username , password , name , age , course , year));
				Librarian.displayStudentList(sl);
				break;
			}
			
			case 3 :
			{
				System.out.println("Checking Admin Credential's");
				System.out.println("Enter ID : ");
				id=sc.next();
				int i=0;
				for(Librarian l : ll)
				{
					if(id.equalsIgnoreCase(l.id))
					{
						i=1;
						System.out.println("Enter Username : ");
						name=sc.next();
						if(name.equals(l.username))
						{
							System.out.println("Enter Password : ");
							password=sc.next();
							if(password.equals(l.password))
							{
								System.out.println("Now you can add Book in DataBase");
								String st;
								do 
								{
								System.out.println("\nEnter the following details to ADD list :\n");
								System.out.println("Enter Book ID :");
								id=sc.next();
								System.out.println("Enter Name :");
								name=sc.next();
								System.out.println("Enter Publisher :");
								publisher=sc.next();
								System.out.println("Enter Number of Pages :");
								noPages=sc.nextInt();
								bl.add(new Books(id, name, publisher, noPages));
								Librarian.displayBookList(bl);
								System.out.println("\nDo you want to add another Book ? Enter Y/N .");
								st=sc.next();
								}
								while(st.equalsIgnoreCase("Y"));
								i=2;
							}
							else if(i==1)
							{
								System.out.println("Request Denied ! Reason - Wrong Password");
								break;
							}
						}
						else if(i==1)
						{
							System.out.println("Request Denied ! Reason - Wrong Username");
							break;
						}
						i++;
					}
					else if(i==0)
					{
						System.out.println("Request Denied ! Reason - Wrong ID");
						break;
					}
				}
				break;
			}
			
			case 4 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
					bl  =(ArrayList<Books>)oisbooks.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
				System.out.println("Enter Student ID : ");
				id=sc.next();
				int i=0;
				for(Student s : sl)
				{
					if(id.equals(s.id))
					{
						String st;
						do 
						{
						if(s.atl.size() == 4)
						{
							System.out.println("\nYou can only issue 4 Books at a time !!");
							i++;
							break;
						}
						int j=0;
						
						System.out.println("Enter Book Name or Book ID");
						String str=sc.next();
						
						for(Books bk : s.atl)
						{
							if(str.equalsIgnoreCase(bk.title) || str.equals(bk.bookId))
							{
								System.out.println("\nYou already had this Book , Borrow diffrent one !!");
								i++;
								j++;
								break;
							}
						}
						if(i==0 && j==0)
						{
							for(Books b : bl)
							{
								if(str.equals(b.bookId) || str.equalsIgnoreCase(b.title))
								{
									
									LocalDate currentDate = LocalDate.now();
									LocalDate issueDate = LocalDate.now();
									LocalDate DueDate =  LocalDate.now().plusDays(14);  
//									LocalDateTime dateTime1= LocalDateTime.parse(time.toString(), formatter);
									Date date = new Date();  
									SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss"); 
									String time = formatter.format(date);  
									b.dateborrowed=issueDate.toString();
									b.dueDate=DueDate.toString();
									s.atl.add(b);
									int lastIdx = s.at2.size();
									s.at2.add(new Transaction("1",currentDate.toString(),time, s , b ,issueDate.toString(), DueDate.toString(),null));
									thmal.put(Integer.parseInt(id), s.at2);
									s.at2.get(lastIdx).transactionDetail();
//									s.at2.get(lastIdx).toString();
									j++;
								}
							}
						}
						if(j==0)
						{
							System.out.println("\nBook not found , Enter valid Book Name or Book ID\n");
						}
						System.out.println("\nIf you want to Borrow another Book ? Enter Y/N .");
						st=sc.next();
						}
						while(st.equalsIgnoreCase("Y"));
						i++;
					}
				}	
				if(i==0)
				{
					System.out.println("\nStudent not found , Enter valid Student ID\n");
				}
				break;
			}
			
			case 5 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
					bl  =(ArrayList<Books>)oisbooks.readObject();
					thmal  =(HashMap<Integer,ArrayList<Transaction>>)oistransaction.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
					
				System.out.println("Enter Student ID : ");
				id=sc.next();
				int i=0;
				for(Student s : sl)
				{
					if(id.equals(s.id))
					{
						String st;
						do 
						{
						if(s.atl.size() == 0)
						{
							System.out.println("\nCurrently you do not have any book issued !!");
							i++;
							break;
						}
						int j=0;
						System.out.println("Enter Book Name or Book ID");
						String str=sc.next();
						try 
						{
							for(Books b : s.atl)
							{
								if(str.equals(b.bookId) || str.equalsIgnoreCase(b.title))
								{
									LocalDate currentDate = LocalDate.now();
									LocalDate ReturnDate = LocalDate.now();
									Date date = new Date();  
									SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss"); 
									String time = formatter.format(date);  
									b.returnDate=ReturnDate.toString();
									s.at2.add(new Transaction("1",currentDate.toString() ,time,s , b ,b.dateborrowed, b.dueDate,currentDate.toString()));
									int lastIdx = s.at2.size();
									thmal.put(Integer.parseInt(id), s.at2);
									int ind=s.atl.indexOf(b);
									s.atl.remove(b);	
									s.at2.get(lastIdx-1).transactionDetail();
									j++;
								}
							}
						} 
						catch (Exception e) 
						{
//							System.out.println(e);
						}
						
						if(j==0)
						{
							System.out.println("\nEnter valid Book Name or Book ID\n");
						}
						System.out.println("\nIf you want to Return another Book ? Enter Y/N .");
						st=sc.next();
						}
						while(st.equalsIgnoreCase("Y"));
						i++;
					}
				}	
				if(i==0)
				{
					System.out.println("\nStudent not found , Enter valid Student ID\n");
				}
				break;
			}
			
			case 6:
			{
				try 
				{
					bl  =(ArrayList<Books>)oisbooks.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}			
				Librarian.displayBookList(bl);
				break;
			}
			
			case 7 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
					bl  =(ArrayList<Books>)oisbooks.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
								
				int j=0;
				System.out.println("Enter Book Name or Book ID");
				String str=sc.next();
				for(Books b : bl)
				{
					if(str.equals(b.bookId) || str.equalsIgnoreCase(b.title))
					{
						System.out.println("Book is available");
						j++;
						break;
					}
				}
				if(j==0)
				{
					System.out.println("\nEnter valid Book Name or Book ID\n");
				}
				break;
			}
			
			case 8 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
					bl  =(ArrayList<Books>)oisbooks.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
				
				System.out.println("Enter Student ID : ");
				id=sc.next();
				int i=0;
				for(Student s : sl)
				{
					if(id.equals(s.id))
					{
						if(s.atl.size() == 0)
						{
							System.out.println("\nCurrently you do not have any Book\n");
							i++;
							break;
						}
						else
						{
							Librarian.displayBookList(s.atl);
							i++;
						}		
					}
				}	
				if(i==0)
				{
					System.out.println("\nStudent not found , Enter valid Student ID\n");
				}
				break;
			}
			
			case 9 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
				Librarian.displayStudentList(sl);
				break;
			}
			
			case 10 :
			{
				try 
				{
					ll  =(ArrayList<Librarian>)oislibrarian.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
				
				System.out.println("Enter ID : ");
				String Lid=sc.next();
				int i=0;
				for(Librarian l : ll)
				{
					if(Lid.equals(l.id))
					{
						i=1;
						System.out.println("Enter Username : ");
						name=sc.next();
						if(name.equals(l.username))
						{
							System.out.println("Enter Password : ");
							password=sc.next();
							if(password.equals(l.password))
							{
								Librarian.displayLibrarianList(ll);
								i=2;
							}
							else if(i==1)
							{
								System.out.println("Request Denied ! Reason - Wrong Password");
								break;
							}
						}
						else if(i==1)
						{
							System.out.println("Request Denied ! Reason - Wrong Username");
							break;
						}
						i++;
					}
					else if(i==0)
					{
						System.out.println("Request Denied ! Reason - Wrong ID");
						break;
					}
				}	
				break;
			}
			
			case 11 :
			{
				try 
				{
					sl  =(ArrayList<Student>)oisstudent.readObject();
					bl  =(ArrayList<Books>)oisbooks.readObject();
					thmal  =(HashMap<Integer,ArrayList<Transaction>>)oistransaction.readObject();
				} 
				catch (ClassNotFoundException e1) 
				{
//					System.out.println(e1);
				}
				catch (Exception e2) 
				{
//					System.out.println(e2);
				}
				
				System.out.println("Enter Student ID : ");
				id=sc.next();
				int i=0;
				for(Student s : sl)
				{
					if(id.equals(s.id))
					{
						if(s.at2.size() == 0)
						{
							System.out.println("\nNo Transaction Details Available\n");
							i++;
							break;
						}
						else
						{
							Librarian.displayTransactionList(s.at2);
							i++;
						}		
					}
				}	
				if(i==0)
				{
					System.out.println("\nStudent not found , Enter valid Student ID\n");
				}
				break;
			}
			
			case 12 :
			{
				// File 1 - BooksList.txt
				try 
				{
					fosbooks = new FileOutputStream(fbooks);
					oosbooks = new ObjectOutputStream(fosbooks);
					oosbooks.writeObject(bl);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				finally 
				{
					try 
					{
						fisbooks.close();
						oisbooks.close();
						fosbooks.close();
						oosbooks.close();
					} 
					catch (Exception e1) 
					{
						e1.printStackTrace();
					}
				}
				
				
				
				// File 2 - StudentsList.txt
				try 
				{
					fosstudent = new FileOutputStream(fstudent);
					oosstudent = new ObjectOutputStream(fosstudent);
					oosstudent.writeObject(sl);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				finally 
				{
					try 
					{
						fisstudent.close();
						oisstudent.close();
						fosstudent.close();
						oosstudent.close();
					} 
					catch (Exception e1) 
					{
						e1.printStackTrace();
					}
				}
				
				
				// File 3 - TransactionHistory.txt
				try 
				{
					fostransaction = new FileOutputStream(ftransaction);
					oostransaction = new ObjectOutputStream(fostransaction);
					oostransaction.writeObject(thmal);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				finally 
				{
					try 
					{
						fistransaction.close();
						oistransaction.close();
						fostransaction.close();
						oostransaction.close();
					} 
					catch (Exception e1) 
					{
						e1.printStackTrace();
					}
				}
				
				
				// File 4 - LibrarianList.txt
				try 
				{
					foslibrarian = new FileOutputStream(flibrarian);
					ooslibrarian = new ObjectOutputStream(foslibrarian);
					ooslibrarian.writeObject(ll);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
				finally 
				{
					try 
					{
						fislibrarian.close();
						oislibrarian.close();
						foslibrarian.close();
						ooslibrarian.close();
					} 
					catch (Exception e1) 
					{
						e1.printStackTrace();
					}
				}
				
				System.out.println("\nYou have chosen EXIT !! Saving Files and Closing the tool.");
				sc.close();
				System.exit(0);
				break;
			}
			
			default :
			{
				System.out.println("\nEnter correct choice from the list :");
				break;
			}
			}
		}
		while(true);	
	}
}
