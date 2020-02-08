package sweets;

public class Chocolate extends Sweets {
	private int ChocolateId;
	public Chocolate(int Weight,String Name, int ChocolateId)
	{
		super(Weight,Name);
		this.ChocolateId=ChocolateId;
	}
	
	public String toString()
	{
		return "ID" + ChocolateId +": " + super.toString();
	}

}
