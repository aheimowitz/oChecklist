//---------------------------------------------------------------------
package studentOrientation.orientation.activities.register;
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.ActivityInterface;
//---------------------------------------------------------------------
public abstract class AbstractRegister implements ActivityInterface
{
	static private final double TUITION = 7256;
	String name;
	int time;
	double cost;
	int effort;

	/**
	*
	**/
	public void calculate(Double percent)
	{
		cost = TUITION - (TUITION*(percent/100));
	}

	/**
	*	This is the getter method for the name
	*	@return Returns the activity's name
	**/
	public String getName()
	{
		return name;
	}

	/**
	*	This is the getter method for the time
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
	
	/**
	*	This is the setter method for the name 
	*	 of the activity
	**/
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	*	This is the setter method for the time 
	*	 of the activity
	**/
	public void setTime(int time)
	{
		this.time = time;
	}

	/**
	*	This is the setter method for the cost
	*	 of the activity
	**/
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	*	This is the setter method for the effort
	*	 of the activity
	**/
	public void setEffort(int effort)
	{
		this.effort = effort;
	}
}
