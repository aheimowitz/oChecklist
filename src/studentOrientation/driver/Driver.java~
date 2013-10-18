//---------------------------------------------------------------------
package studentOrientation.driver;
//---------------------------------------------------------------------
import studentOrientation.orientation.ActivityBuilder;
import studentOrientation.orientation.interfaces.WorkshopInterface;
import studentOrientation.orientation.interfaces.ActivityInterface;
import studentOrientation.orientation.interfaces.UnitsInterface;
import studentOrientation.orientation.activities.bookstore.*;
import studentOrientation.orientation.activities.dorm.*;
import studentOrientation.orientation.activities.register.*;
import studentOrientation.orientation.activities.tour.*;
import studentOrientation.util.cost.*;
import studentOrientation.util.effort.*;
import studentOrientation.util.time.*;
import java.util.Vector;
//---------------------------------------------------------------------
public class Driver 
{
	public static void main(String args[]) 
	{

        int debug = Integer.parseInt(args[0]);
        if(debug >-1 && debug <3){

		UnitsInterface timeUnits = new Minutes();
		UnitsInterface effortUnits = new Calories();
		UnitsInterface costUnits = new Dollars();

            
            ActivityBuilder build = new ActivityBuilder(debug,
		 timeUnits, effortUnits, costUnits);
            Vector<ActivityInterface> checkList =
		new Vector<ActivityInterface>();

            checkList.add(new MandoBooks(debug, timeUnits,
		 effortUnits, costUnits));
            checkList.add(new OnlineGaming(debug, timeUnits,
		 effortUnits, costUnits));
            checkList.add(new ComputerReg(debug, timeUnits,
		 effortUnits, costUnits));
            checkList.add(new BusTour(debug, timeUnits,
		 effortUnits, costUnits));
            build.construct(checkList);
            
            System.out.println(build);
		
            System.out.println("Driver finished executing");
        }else{
            System.out.println("Invalid debug value");
        }

	} // end main(...)
} // end class Driver
//---------------------------------------------------------------------
