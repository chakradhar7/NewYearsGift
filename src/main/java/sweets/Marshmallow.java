package sweets;

public class Marshmallow extends Sweets{
	private int MarshmallowId;
	public Marshmallow(int Weight,String Name,int MarshmallowId)
	{
		super(Weight,Name);
		this.MarshmallowId = MarshmallowId;
	}
	public String toString()
	{
		return "ID" + MarshmallowId + ": " + super.toString(); 
	}
}
