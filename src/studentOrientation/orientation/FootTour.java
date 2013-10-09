public class FootTour implements CampusTour
{

	//Constructor class sets values for the option
	public FootTour()
	{
		name = "Campus Foot Tour";
		/*
		time = //SET TIME;
		cost = //SET COST;
		effort = //SET EFFORT;
		*/
	}

	/**
     *	This is the getter method for the cost
     *
     *	@return Returns the activity's name
     **/
	public String getName()
	{
		return name;
	}

	/**
     *	This is the getter method for the cost
     *
     *	@return Returns the activity's time
     **/
	public int getTime()
	{
		return time;
	}

	/**
	*	This is the getter method for the cost
	*
	*	@return Returns the activity's cost
	**/
	public double getCost()
	{
		return cost;
	}
    
	/**
	*	This is the getter method for the effort
	*@return Return the activity's effort
	**/
	public int getEffort()
	{
		return effort;
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
    
