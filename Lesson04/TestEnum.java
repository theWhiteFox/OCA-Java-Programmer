public class TestEnum
{
	enum glasses {READING, DRIVING, SUN}
	
	public static void main(String[] args)
	{			
		glasses myGlasses = glasses.READING;
		switch (myGlasses)
		{
			case READING: System.out.println("Glasses for reading");
			break;
			case DRIVING: System.out.println("Glasses for driving");
			break;
			case SUN: System.out.println("Glasses for sun bathing");
			break;
			default: System.out.println("No glasses required.");
		}
	}	
}


// Output: Glasses for reading
