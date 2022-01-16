package expence_Tracker;

import java.util.ArrayList;
import java.util.List;

public class complete 
{
	int i;
	String name;
	List<expense> expenses;
	public complete(int i, String name, List<expense> expenses) {
		super();
		this.i = i;
		this.name = name;
		this.expenses = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "complete [i=" + i + ", name=" + name + "]";
	}
	public static void main(String args[])
	{
		List<complete> list = new ArrayList<>();
		complete c = new complete(20,"Gowtham");
		complete c1 = new complete(21,"chethan");
		complete c2 = new complete(21,"apeakshith");
		list.add(c);
		list.add(c1);
		list.add(c2);
		for(complete c4:list)
		{
			System.out.println(c4);
		}
		
	}
	
}
