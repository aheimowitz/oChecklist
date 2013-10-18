//---------------------------------------------------------------------
package studentOrientation.orientation.activities.register;
//---------------------------------------------------------------------
public class OfficeReg extends AbstractRegister
{
	/**
	*	The empty class constructor
	**/
	public OfficeReg()
	{
		name = "Register in the office";
		time = 2;
		effort = 100;

		calculate(3.00);
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
