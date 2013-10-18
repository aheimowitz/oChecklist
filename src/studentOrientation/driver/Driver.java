//---------------------------------------------------------------------
package studentOrientation.driver;
//---------------------------------------------------------------------
import studentOrientation.orientation.ActivityBuilder;
import studentOrientation.orientation.interfaces.WorkshopInterface;
import studentOrientation.orientation.interfaces.ActivityInterface;
import studentOrientation.orientation.activities.bookstore.*;
import studentOrientation.orientation.activities.dorm.*;
import studentOrientation.orientation.activities.register.*;
import studentOrientation.orientation.activities.tour.*;
import java.util.Vector;
//---------------------------------------------------------------------
public class Driver 
{
    /**
     * Main method creates a vector of objects and sends them to the builder
     **/
	public static void main(String args[]) 
	{
        int debug = Integer.parseInt(args[0]);
        if(debug >-1 && debug <5){
            
            ActivityBuilder build = new ActivityBuilder(debug);
            Vector<ActivityInterface> checkList = new Vector<ActivityInterface>();
            checkList.add(new MandoBooks(debug));
            checkList.add(new OnlineGaming(debug));
            checkList.add(new ComputerReg(debug));
            checkList.add(new BusTour(debug));
            build.construct(checkList);
            
            System.out.println(build);
		
            System.out.println("Driver finished executing");
        }else{
            System.out.println("Invalid debug value");
        }

	} // end main(...)
} // end class Driver
//---------------------------------------------------------------------
