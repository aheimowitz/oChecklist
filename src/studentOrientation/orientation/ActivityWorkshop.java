//---------------------------------------------------------------------
package studentOrientation.orientation; 
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.WorkshopInterface;
import studentOrientation.orientation.interfaces.ActivityInterface;
//---------------------------------------------------------------------
public class ActivityWorkshop implements WorkshopInterface
{
	/**
	*	The empty constructor for this class
	**/
	public ActivityWorkshop(){}

	/**
	*	
	**/
	public void construct(ActivityInterface act)
	{
		act.setTime();
		act.setCost();
		act.setEffort();
	}
}
