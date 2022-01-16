package expence_Tracker;

import java.util.Scanner;

public class main 
{
	public static void main(String args[])
	{
		expense_management g = new expense_management();
		Scanner scanner = new Scanner(System.in);
		boolean comeback = false;

		while(!comeback)
		{
			menu();
		
			System.out.println("Enter Your Choice: ");
	        int choice = scanner.nextInt();
	        switch (choice)
	        {
	            case 1 -> 
	            {

	                System.out.println("Enter the category id: ");
	                int i= scanner.nextInt();
	            
	                System.out.println("Enter the category Name: ");
	                String name = scanner.next();
	                System.out.println("Enter the category description: ");
	                String description = scanner.next();
	                scanner.nextLine();
	               g.addcatagories(i, name, description);
	            }
	            case 2 -> 
	            {

	        	  System.out.println("Enter the category id: ");
	                int i= scanner.nextInt();
	        
	                System.out.println("Enter the expense Name: ");
	                String name = scanner.next();
	                scanner.nextLine();
	
	                System.out.println("Enter the amount: ");
	                int amount  = scanner.nextInt();
	                scanner.nextLine();
	
	               g.addexpense(name, amount , i);
	            }
	            case 3 ->
	            {
	            System.out.println("to display catagories");
	            g.display("category");
	            }
	            case 4 -> 
		        {
		        	System.out.println("to display expenses");
	
		        	  
		        	g.listallexpenses();
		        }
		        
	           
	            case 5 -> 
		        {
		        	System.out.println("update catagory name");
		        	System.out.println("enter catagory name");
		        	String oldname = scanner.next();
	                scanner.nextLine();
	                System.out.println("enter new catagory name");
		        	String newname = scanner.next();
	                scanner.nextLine();
		            g.update(oldname,newname);
		        }
	            case 6 ->
	            {
	            	System.out.println("enter catagory name to be deleted");
		        	String catdelname = scanner.next();
	                scanner.nextLine();
	                g.deletecatag(catdelname);
	            	
	            }
	            case 7 ->
	            {
	            	System.out.println("enter catagory id");
		        	int catid = scanner.nextInt();
	                scanner.nextLine();
	                g.listexpenses(catid);
	            	
	            }
	            case 8 -> 
				{
					System.out.println("enter catagory id");
		        	int catid = scanner.nextInt();
		        	System.out.println("enter old expense name");
		        	String oldname = scanner.next();
		        	System.out.println("enter new expense name");
		        	String newname = scanner.next();
		        	g.updateexpense(catid , oldname , newname);					
				}
	            case 9 ->
	            {
	            	System.out.println("enter catagory id");
		        	int cid = scanner.nextInt();
		        	
	                g.deleteexpances(cid );
	            	
	            }
	        }
	        
		}
	        
	}
	 static void menu() 
	 {
	        System.out.println(
	        		"1) add category [+]\n" +
	                "2) add expenses [+]\n" +
	                "3) list category [+]\n" +
	                "4) list  expenses [+]\n"+
	                "5) update catagory [+]\n"+
	                "6) delete catagory [+]\n"+
	                "7) list all expenses of category [-]\n"+
	                "8) update expense [+]\n"+
	                "9) delete expense of catagory  [+]\n");
	               
	        System.out.println("10) exit");
	    }
}
