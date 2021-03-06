/*
 Superclass or parent class
 Shirt is subclass
*/
public abstract class Clothing
{	
	// fields given default values 
	private int itemID = 0;
	private String desc = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	
	// constructor
	public Clothing(int itemID, String desc, char colorCode, double price)
	{
		this.itemID = itemID;
		this.desc = desc;
		this.colorCode = colorCode;
		this.price = price;
	}
	
	public int getItemID()
	{
		return itemID;
	}
	
	public String getDesc()
	{
		return desc;
	}
	
	public boolean setColorCode(char colorCode)
	{
		if(colorCode == 'B')
		{
			return false;
		}
		else 
		{
			this.colorCode = colorCode;
			return true;
		}
	}
	
	public char getColorCode()
	{
		return colorCode;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public abstract void display(int itemID, String desc, char colorCode, double price);
}