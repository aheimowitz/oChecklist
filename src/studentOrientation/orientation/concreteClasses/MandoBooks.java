public class MandoBooks extends AbstractBookstore
{
	private String name;
	private int time;
	private double cost;
	private int effort;

	//Constructor class sets values for the option
	public MandoBooks()
	{
		//name = "Mando Books";
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
	*	@return Returns the activity's time
	**/
	public int getTime()
	{
		return time;
	}

	/**
	*	This is the getter method for the cost
	*	@return Returns the activity's cost
	**/
	public double getCost()
	{
		return cost;
	}
    
	/**
	*	This is the getter method for the effort
	*	@return Return the activity's effort
	**/
	public int getEffort()
	{
		return effort;
	}
	
	public void setTime()
	{

	}
	public void setCost()
	{

	}
	public void setEffort()
	{
	
	}

	/**
	*	This is the overridden toString method for this class
	*	@return Returns the class details as a string
	**/
	@Override
	public String toString() 
	{
		return "";//name +"- Time: "+time+" Cost: "+ cost 
			//+" Calories: "+effort;
	}
}
    
