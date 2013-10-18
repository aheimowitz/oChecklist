//---------------------------------------------------------------------
package studentOrientation.orientation; 
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.WorkshopInterface;
import studentOrientation.orientation.interfaces.ActivityInterface;
import studentOrientation.orientation.activities.bookstore.*;
import studentOrientation.orientation.activities.dorm.*;
import studentOrientation.orientation.activities.register.*;
import studentOrientation.orientation.activities.tour.*;
import java.util.Vector;
//---------------------------------------------------------------------
public class ActivityBuilder implements WorkshopInterface
{
	private int totalTime;
    private double totalCost;
    private int totalEffort;
    private int debugger;
    
	public ActivityBuilder(int debug){
        totalTime = 0;
        totalCost = 0;
        totalEffort = 0;
        debugger = debug;
    }
    
	public void construct(Vector<ActivityInterface> checkList)
	{
        for (int i = 0; i < checkList.size(); i++){
            totalTime += checkList.get(i).getTime();
            totalCost += checkList.get(i).getCost();
            totalEffort += checkList.get(i).getEffort();
        }
	}
    
    @Override
    public String toString()
    {
        return "Total Time: "+totalTime+" Total Cost: "+totalCost+" Total Effort: "+totalEffort;
    }
}
