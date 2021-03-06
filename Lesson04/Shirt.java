class Shirt extends Clothing
{
	// private static char fit = 'U';
	private char fit = 'U';
	
	public Shirt(int itemID, String desc, char colorCode, double price, char fit)
	{
		// reference to the super class constructor
		super(itemID, desc, colorCode, price);
		
		// reference to this object
		// if static // Shirt.fit = fit;	 
		this.fit = fit;	 
	}
	
	public char setFit(char fit) {
		return this.fit = fit;
	}
	
	public char getFit()
	{
		return fit;
	}		
	
	public static void main(String [] args)
	{
		Shirt shirt = new Shirt(1, "Italian Shirt", 'B', 55.99, 'S');
		shirt.setFit('M');
		
		
		if(shirt.setColorCode('B'))
		{
			System.out.println("Color code: " + shirt.getColorCode());
		}
		else
		{
			System.out.println("Invalid color!");
		}
	
		System.out.println("Description: " + shirt.getDesc() +
							"\nFit: " + shirt.getFit() + 
							"\nItemID: " + shirt.getItemID() +							 
							"\nColor Code: " + shirt.getColorCode() +
							"\nPrice: €" + shirt.getPrice());
	}
	public void display(int itemID, String desc, char colorCode, double price)
	{
		System.out.println(" ID: " + itemID + 
							"\n Description: " + desc + 
							"\n Color Code: " + colorCode + 
							"\n Price: €" + price);
	}	
}
/*
 thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson04$ java Shirt
 Description: Italian Shirt
 Fit: M
 ItemID: 1
 Color Code: B
 Price: €55.99
*/
