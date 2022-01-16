package expence_Tracker;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class catagory_management
{
	
	 
	protected List<catagory> catagories; 
	public catagory_management()
	{
		this.catagories = new ArrayList<>();
	}
	protected void addcatagories(int id, String catname , String description)
	{
		catagory cat = new catagory(id,catname,description);
		catagories.add(cat);
	}
	
	protected void deletecatag(String catname)
	{
		catagory catagorytodelete=null;
		for(catagory cat:catagories)
		{
			if(cat.getCatname().equals(catname))
			{
				catagorytodelete=cat;
				break;
			}
		}
		catagories.remove(catagorytodelete);
		
	}
	protected catagory update(String catname,String newcatname)
	{
		for(catagory c:catagories)
		{
			if(c.getCatname().equals(catname))
			{
				c.setCatname(newcatname);
				return c;
			}
		}
		return null;
		
	}

	
	void display() {
		System.out.println(catagories);
	}
//	public static void main(String args[])
//	{
//		Scanner s = new Scanner(System.in);
//
//		int i = s.nextInt();
//		String catname = s.next();
//		String description = s.next();
//		s.nextLine();
//		
//		catagory_management g = new catagory_management();
//		g.addcatagories(i, catname, description);
//		g.display();
//	}
}
