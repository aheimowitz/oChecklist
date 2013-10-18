//---------------------------------------------------------------------
package studentOrientation.orientation.activities.dorm;
//---------------------------------------------------------------------
public class GotoDorm extends AbstractDorm
{
	//Constructor class sets values for the option
	public GotoDorm()
	{
		name = "Go to each dorm";
		time = 40;
		effort = 1203;

		calculate(0.00);
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
    
