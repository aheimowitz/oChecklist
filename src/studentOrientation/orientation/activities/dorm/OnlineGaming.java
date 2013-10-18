//---------------------------------------------------------------------
package studentOrientation.orientation.activities.dorm;
//---------------------------------------------------------------------
public class OnlineGaming extends AbstractDorm
{

	//Constructor class sets values for the option
	public OnlineGaming()
	{
		name = "Online Gaming Contest";
		/*
		time = //SET TIME;
		cost = //SET COST;
		effort = //SET EFFORT;
		*/
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
    
