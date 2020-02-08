package sweets;

public class JellyBean extends Sweets{
	private int JellyBeanId;
	public JellyBean(int Weight,String Name,int JellyBeanId)
	{
		super(Weight,Name);
		this.JellyBeanId = JellyBeanId;
	}
	public String toString()
	{
		return "ID" + JellyBeanId + ": " + super.toString(); 
	}
}
