public class SmartCard
{
    protected String owner;
    protected Boolean Staff;

    public SmartCard (String name)          //Constructor sets the owner's name by taking string parameter
    {
        owner = name;
        Staff = false;
    }
    
    public String getOwner()                //Method returning the owner of the smart card 
    {
        return owner;
    }
    
    public Boolean isStaff()                //Method returning true if card owner is a staff member 
    {
        return Staff;
    }
    
    public void setStaff(Boolean s)         //Method to change status 
    {
        Staff = s;
    }
}
