package expence_Tracker;

public class expense 
{
	protected String name;
	protected int amount;
	
	public expense(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "expense [name=" + name + ", amount=" + amount + "]";
	}

}
