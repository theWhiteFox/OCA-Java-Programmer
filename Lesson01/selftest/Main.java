import java.util.ArrayList;
import java.util.List;

/*
 Main method for Phone class.
 Objects created LandLine2000, G200
*/

class Main
{
	public static void main(String [] args)
	{
		List<Phone> phones = new ArrayList<>();
		
		Phone landLine2000 = new LandLine2000("LandLine 2000",400,5.6f,8.5f,80.5f,true,false);
		Phone g200 = new G200("G200",510,4.5f,8.6f,80.5f,true,false);		
		
		phones.add(landLine2000);
		phones.add(g200);
		
		for(Phone phone : phones) 
		{	
			System.out.println(phone);
			System.out.println();
			
			// check whether the name is LandLine 2000
			if(phone.getName().equals("LandLine 2000"))
			{				
				landLine2000.makeCall("0874646372");
				landLine2000.receiveCall("0864546342");
				landLine2000.hangUp();
				landLine2000.sendText("Hi, very warm!","0874546432");
				landLine2000.receiveText("Lucky you!","0864545454");
				landLine2000.recharge(true);
			}
			
			// check whether the name is G200
			if(phone.getName().equals("G200"))
			{	
				g200.makeCall("0874646372");
				g200.receiveCall("0864546342");
				g200.hangUp();
				g200.sendText("Hi, very warm!","0874546432");
				g200.receiveText("Lucky you!","0864545454");
				g200.recharge(true);			
				g200.streamVideo();
			}
   		}
		
		System.out.println();		
	}
}

/*
 Name: LandLine 2000
 No of pixels: 400
 Width: 5.6
 Height: 8.5
 Weight: 80.5
 Powered On?: true
 Recharging?: false

 Dialling number 0874646372 on a LandLine2000 phone.
 Incoming call from 0864546342 on a LandLine2000 phone.
 Terminating a phone call on a LandLine 2000 phone 
 Sending text: Hi, very warm! to phone number 0874546432 from a LandLine 2000 phone 
 Incoming text: Lucky you! recieved from 0864545454 from a LandLine 2000 phone 
 LandLine 2000 phone is currently recharging

 Name: G200
 No of pixels: 510
 Width: 4.5
 Height: 8.6
 Weight: 80.5
 Powered On?: true
 Recharging?: false

 Dialling number 0874646372 on a G200 phone.
 Incoming call from 0864546342 on a G200 phone.
 Terminating a phone call on a G200 phone 
 Sending text: Hi, very warm! to phone number 0874546432 from a G200 phone 
 Incoming text: Lucky you! recieved from 0864545454 from a G200 phone 
 G200 phone is currently recharging
 Currently Streaming on G200
*/
