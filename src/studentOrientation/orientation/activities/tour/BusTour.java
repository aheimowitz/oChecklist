//---------------------------------------------------------------------
package studentOrientation.orientation.activities.tour;
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.UnitsInterface;
//--------------------------------------------------------------------
public class BusTour extends AbstractTour
{

	//Constructor class sets values for the option
	public BusTour(int debugVal, UnitsInterface timeUnits,
	 UnitsInterface effortUnits, UnitsInterface costUnits)
	{
		name = "Bus Tour";
		time = 1;
		cost = 5.00;
		effort = 25;

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
    
