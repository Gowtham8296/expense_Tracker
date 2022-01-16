package expence_Tracker;

import java.util.*;

public class expense_management extends catagory_management
{
	List<expense> expenses;
	public expense_management()
	{
		this.expenses  = new ArrayList<>();
	}
	
	public void addexpense(String name , int amount ,int id)
	{
		for(catagory c:catagories)
		{
			if(Objects.equals(c.getId(),id))
			{
				expense e = new expense(name,amount);
				c.getExpenses().add(e);
			}
		}
		
	}
	public void listexpenses(int id)
	{
		List<expense> all = null;
		for(catagory c:catagories)
		{
			if(Objects.equals(c.getId(),id))
			{
				all = c.getExpenses();
			}
			
		}
		System.out.println(all);
	}
	public void listallexpenses()
	{
		List<expense> all = new ArrayList<>();
		for(catagory c:catagories)
		{
			
			all.addAll(c.getExpenses());
		}
		System.out.println(all);
	}
	public void deleteexpanses(int id,String expansename)
	{
		expense ex = null;
		for(catagory c:catagories)
		{
			if(Objects.equals(c.getId(),id)  )
			{
			
				List<expense> fullexpense = c.getExpenses();
				for(expense e : fullexpense)
				{
					if(e.getName().equals(expansename))
					{
						ex = e;
						break;
					}
				}
				c.getExpenses().remove(ex);
			}
		}
				
	}
	
	public void updateexpense(int id,String exname , String newexname)
	{
		for(catagory c:catagories)
		{
			if(Objects.equals(c.getId(),id)  )
			{
				for(expense e:c.getExpenses())
				{
					if(e.getName().equals(exname))
					{
						e.setName(newexname);
					}
				}
			}
		}
	}
	public void deleteexpances(int id)
	
	{
		
		List<expense> ex  = new ArrayList<>();
		for(catagory c:catagories)
		{
			if(Objects.equals(c.getId(),id))
			{
				c.setExpenses(ex);
			}
		}
			
	}

	void display(String method)
	{
		if(method.equals("expense")) {
			System.out.println(expenses);	
		}
		else
			super.display();
		
	}
	

}
