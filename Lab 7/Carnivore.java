
public class Carnivore extends Animal{

	public Carnivore(String name, int age)
	{
		super(name, age);
	}
	
	public void makeNoise()
	{
		
	}
	
	public void eat(Food food) throws Exception 
	{
		//If food isn't an instance of plant, an exception is thrown and an error message is printed 
		if (food instanceof Plant) 
		{
			throw new Exception("A carnivore is unable to eat plants");
		}
		else
		{
			System.out.println("The animal is eating " + food);
		}		
	}
}
