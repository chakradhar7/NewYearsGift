package sweets;

public class Cookie extends Sweets{
	private int CookieId;
	public Cookie(int Weight,String Name,int CookieId)
	{
		super(Weight,Name);
		this.CookieId = CookieId;
	}
	public String toString()
	{
		return "ID" + CookieId + ": " + super.toString(); 
	}
}
