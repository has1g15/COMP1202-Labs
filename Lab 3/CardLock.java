public class CardLock
{
    protected SmartCard lastSmartCard;
    protected Boolean studentAccess; 
    
    public CardLock()
    {
        lastSmartCard = new SmartCard("");
        studentAccess = false;
    }
    
    public void swipeCard(SmartCard card)
    {
        lastSmartCard = card; 
    }
    
    public SmartCard getLastCardSeen()      //Returns last smart card 
    {
        return lastSmartCard; 
    }
    
    public Boolean isUnlocked()             //Depending on the status, the card lock will unlock 
    {
        return lastSmartCard.isStaff() || studentAccess; 
    }
    
    public void toggleStudentAccess()       //Method switching student access 
    {
        studentAccess = (!studentAccess);
    }
}