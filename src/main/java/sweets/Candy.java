package sweets;

public class Candy extends Sweets{
	private int CandyId;
	public Candy(int Weight,String Name, int CandyId)
	{
		super(Weight,Name);
		this.CandyId=CandyId;
	}
	
	public String toString()
	{
		return "ID" + CandyId +": " + super.toString();
	}
}
