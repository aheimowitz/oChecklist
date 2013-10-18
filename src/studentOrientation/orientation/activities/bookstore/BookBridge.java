//---------------------------------------------------------------------
package studentOrientation.orientation.activities.bookstore;
//---------------------------------------------------------------------
import studentOrientation.orientation.interfaces.UnitsInterface;
//---------------------------------------------------------------------
public class BookBridge extends AbstractBookstore
{
	/**
	*	Class constructor
	**/
	public BookBridge(int debugVal, UnitsInterface timeUnits,
	 UnitsInterface effortUnits, UnitsInterface costUnits)
	{
		this.name = "Book Bridge";
		this.time = 20;
		this.effort = 200;

		calculate(2.00);

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
    
