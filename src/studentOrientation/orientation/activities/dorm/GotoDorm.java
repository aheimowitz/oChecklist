//---------------------------------------------------------------------
package studentOrientation.orientation.activities.dorm;
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.UnitsInterface;
//--------------------------------------------------------------------
public class GotoDorm extends AbstractDorm
{
	//Constructor class sets values for the option
	public GotoDorm(int debugVal, UnitsInterface timeUnits,
	 UnitsInterface effortUnits, UnitsInterface costUnits)
	{
		name = "Go to each dorm";
		time = 40;
		effort = 1203;

		calculate(0.00);

		this.timeUnits = timeUnits;
		this.effortUnits = effortUnits;
		this.costUnits = costUnits;

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
		return name + "- Time: " + time + " " + timeUnits.toText()
			+ " Cost: " + cost + " " + costUnits.toText()  
			+" Calories: "+ effort + effortUnits.toText();
	}
}
    
