//---------------------------------------------------------------------
package studentOrientation.orientation.activities.tour;
//---------------------------------------------------------------------
public class BusTour extends AbstractTour
{

	//Constructor class sets values for the option
	public BusTour()
	{
		name = "Bus Tour";
		time = 1;
		cost = 5.00;
		effort = 25;
	}
	
	/**
	*	This is the overridden toString method for this class
	*	@return Returns the class details as a string
	**/
	@Override
	public String toString() 
	{
		return name+"- Time: "+time+" Cost: "+ cost 
			+" Calories: "+effort;
	}
}
    
