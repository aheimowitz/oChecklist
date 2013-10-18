//---------------------------------------------------------------------
package studentOrientation.orientation.activities.register;
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.UnitsInterface;
//--------------------------------------------------------------------
public class OfficeReg extends AbstractRegister
{
	/**
	*	The empty class constructor
	**/
	public OfficeReg(int debugVal, UnitsInterface timeUnits,
	 UnitsInterface effortUnits, UnitsInterface costUnits)
	{
		name = "Register in the office";
		time = 2;
		effort = 100;

		calculate(3.00);

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
