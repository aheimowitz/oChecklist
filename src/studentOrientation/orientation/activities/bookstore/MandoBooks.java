//---------------------------------------------------------------------
package studentOrientation.orientation.activities.bookstore;
//---------------------------------------------------------------------
public class MandoBooks extends AbstractBookstore
{
	/**
	*	Class constructor
	**/
	public MandoBooks(int debugVal)
	{
		this.name = "Mando Books";
		this.time = 15;
		this.effort = 165;

		calculate(3.00);

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
		return name +"- Time: "+ time +" Cost: "+ cost 
			+" Calories: "+effort;
	}
}
    
