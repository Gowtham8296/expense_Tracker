package expence_Tracker;

import java.util.*;

import javax.xml.crypto.Data;

public class catagory 
{
	@Override
	public String toString() {
		return "catagory [id=" + id + ", catname=" + catname + ", description=" + description + ", Expenses=" + Expenses
				+ "]";
	}


	protected int id;
	protected String catname;
	protected String description;
	List<expense> Expenses;
	
	
	public List<expense> getExpenses() {
		return Expenses;
	}
	public void setExpenses(List<expense> expenses) {
		Expenses = expenses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	
	}
	
	
	public catagory(int id, String catname, String description) {
		super();
		this.id = id;
		this.catname = catname;
		this.description = description;
		this.Expenses = new ArrayList<>();
	
	}
	
	

}
