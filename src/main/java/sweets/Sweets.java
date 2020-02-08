package sweets;

public abstract class Sweets {
	private int Weight;
	private String Name;
	public Sweets(int Weight,String Name)
	{
		this.Weight=Weight;
		this.Name=Name;
	}
	public int getWeight()
	{
		return Weight;
	}
	public String toString ()
	{
		return " Name = "+ Name + " : Weight= "+ Weight;  
	}
}
