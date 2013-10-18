//---------------------------------------------------------------------
package studentOrientation.orientation.activities.tour;
//---------------------------------------------------------------------
public class FootTour extends AbstractTour
{
	//Constructor class sets values for the option
	public FootTour(int debugVal)
	{
		name = "Walking tour";
		time = 25;
		cost = 1.00;
		effort = 100;

		if(debugVal == 2)
		{
			System.out.println(name +
				" constructor called");
		}

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
    
