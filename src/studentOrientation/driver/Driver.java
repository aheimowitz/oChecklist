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
	public static void main(String args[]) 
	{
		System.out.println(args[0]);

       int debug = Integer.parseInt(args[1]);
        if(debug >-1 && debug <3){
            
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
