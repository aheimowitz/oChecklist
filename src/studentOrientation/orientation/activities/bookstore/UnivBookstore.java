//---------------------------------------------------------------------
package studentOrientation.orientation.activities.bookstore;
//---------------------------------------------------------------------
public class UnivBookstore extends AbstractBookstore
{
	/**
	*	Class constructor
	**/
	public UnivBookstore()
	{
		this.name = name;
		this.time = time;
		this.effort = effort;
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
    
