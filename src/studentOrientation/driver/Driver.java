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
        int debug = Integer.toInt(args[1]);
        
        if(debug >-1 && debug <3){
        
            Vector<ActivityInterface> checkList = new Vector<ActivityInterface>();
        
            checkList.add(new MandoBooks(debug));
            checkList.add(new OnlineGaming(debug));
            checkList.add(new BusToue(debug));
		
            System.out.println("Driver finished executing");
        }else{
            System.out.println("Invalid debug value");
        }

	} // end main(...)
} // end class Driver
//---------------------------------------------------------------------
