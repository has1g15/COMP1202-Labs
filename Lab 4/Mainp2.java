import java.util.Iterator;

public class Mainp2 {

	public static void main (String[] args)
	{
		//New UserGroup object instantiated 
		UserGroup ug = new UserGroup();					
		
		ug.addSampleData();															
		ug.printUsernames();
		
		System.out.println();
		//The name with the index passed in is returned and printed 
		System.out.println(ug.getUser(4));				
		
		System.out.println();
		//First user is removed from array list 
		ug.removeFirstUser();							
		ug.printUsernames();
		
		System.out.println();
		//The user name passed into the removeUser method is removed from the array list
		ug.removeUser("mw9g15");							
		ug.printUsernames();
	
		//New UserGroup object instantiated for administrators 
		UserGroup administrators = new UserGroup();
		
		//Iterator returned from the UserGroup class 
		Iterator<User> iter = ug.getUserIterator();		
		
		System.out.println();
		//Iterator loops through existing users 
		while(iter.hasNext())
		{
			User u = iter.next();
			if(u.getUserType().equals("admin"))
			{
				//If users are of UserType "admin", they are added to the users array list 
				administrators.users.add(u);			
			}
		}
		
		System.out.println("Users of type 'admin':");
		administrators.printUsernames();
		System.out.println();
		/* When the last user in the administrators group is set to user, they remain in the administrators group although they 
		are no longer of type 'admin'. A solution to this inconsistency would be to remove the user from the administrators group*/ 
		administrators.setLastUser();
		
		System.out.println("User group:");
		ug.printUsernames();							
		System.out.println();
		System.out.println("Admin group:");
		administrators.printUsernames(); 
	}
}
