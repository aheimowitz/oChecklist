//---------------------------------------------------------------------
package studentOrientation.orientation.activities.register;
//---------------------------------------------------------------------
public class ComputerReg extends AbstractRegister
{
	/**
	*	The empty class constructor
	**/
	public ComputerReg(int debugVal)
	{
		name = "Register by computer";
		time = 1;
		effort = 2;

		calculate(0.00);

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
		return name+"- Time: "+time+" Cost: "+ cost 
			+" Calories: "+effort;
	}

}