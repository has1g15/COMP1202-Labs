import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup
{
	//Array list of type user declared
	ArrayList<User> users;										 

	public UserGroup()
	{
		users = new ArrayList<User>();
	}

	//The array list users is populated 
	public void addSampleData()									
	{
		users.add(new User("fj3", "user", "Francis"));
		users.add(new User("amn", "editor", "Adam"));
		users.add(new User("cm2", "admin", "Charlie"));
		users.add(new User("rm5", "user", "Ryan"));
		users.add(new User("has1g15", "editor", "Hannah"));
		users.add(new User("rhs1g15", "admin", "Rachael"));
		users.add(new User("mw9g15", "user", "Matt"));
		users.add(new User("bn5", "editor", "Bill"));
		users.add(new User("af5", "admin", "Al"));
		users.add(new User("jt67", "user", "Jay"));
	}
	
	//getUser method returning the user name of the user at the position of the parameter being passed in 
	public String getUser(int pos)
	{
		User u = users.get(pos);
		return u.getName();
	}
	
	//Method looping through the array list users and printing the user names and user types of each user
	public void printUsernames()
	{
		for (User u: users)
		{
			System.out.print(u.getUsername() + " ");
			System.out.print(u.getUserType());
			System.out.println(" ");
		}
	}
	
	//User with index 0 is removed from the users array list 
	public void removeFirstUser()								
	{
		users.remove(0);
	}
	
	//The user with the largest index is removed from the users array list 
	public void removeLastUser()
	{
		int lastUserIndex = users.size();
		users.remove(lastUserIndex);							
	}
	
	public void removeUser(String username)
	{
		Iterator<User> itr = users.iterator();
	
		//Array list users is iterated over until the user with the user name passed into the method is reached and removed from the list 
		while(itr.hasNext())	
		{
			if(itr.next().getUsername().equals(username))
			{
				itr.remove();
			}
			
		}
	}
	
	//Method returning an iterator from the users array list 
	public Iterator<User> getUserIterator()						
	{
		return users.iterator();
	}
	
	//The user of type admin who is passed into the method is added to the users array list 
	public void addAdmin(User newUser)
	{
		users.add(newUser);										
	}

	//Method setting last user in administrators group to type user 
	public void setLastUser()									
	{
		int lastUserIndex = users.size();
		User u = users.get(lastUserIndex - 1);
		u.setUserType("user");
	}
}
