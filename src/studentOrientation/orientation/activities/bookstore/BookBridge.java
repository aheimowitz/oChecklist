//---------------------------------------------------------------------
package studentOrientation.orientation.activities.bookstore;
//---------------------------------------------------------------------
public class BookBridge extends AbstractBookstore
{
	/**
	*	Class constructor
	**/
	public BookBridge()
	{
		this.name = "Book Bridge";
		this.time = 20;
		this.effort = 200;

		calculate(2.00);
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
    
