public class UnivBookstore implements Bookstore{
    
    //Constructor class sets values for the option
    public UnivBookstore(){
        UBname = "University Bookstore";
        UBtime = //SET TIME;
        UBcost = //SET COST;
        UBeffot = //SET EFFORT;
    }
    
    //@return name
    public String getName(){
        return UBname;
    }

    //@return time
    public int getTime(){
        return UBtime;
    }
    
    //@return cost
    public double getCost(){
        return UBcost;
    }
    
    //@return effort
    public int getEffort(){
        return UBeffort;
    }

    //To string method for the activity
    @Override
    public String toString() {
        return UBname+"- Time: "+UBtime+" Cost: "+UBcost+" Calories: "+UBeffort;
    }
}
    