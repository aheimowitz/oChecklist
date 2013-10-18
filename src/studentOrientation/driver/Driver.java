//---------------------------------------------------------------------
package studentOrientation.driver;
//---------------------------------------------------------------------
import studentOrientation.orientation.ActivityWorkshop;
import studentOrientation.orientation.interfaces.WorkshopInterface;
import studentOrientation.orientation.interfaces.ActivityInterface;
//---------------------------------------------------------------------
public class Driver 
{
	public static void main(String args[]) 
	{
		WorkshopInterface actWork = new ActivityWorkshop();
		
		System.out.println("Driver finished executing");

	} // end main(...)
} // end class Driver
//---------------------------------------------------------------------
