
public class Carnivore extends Animal{

	public Carnivore(String name, int age)
	{
		super(name, age);
	}
	
	public Carnivore()
	{
		super();
	}
	
	public void makeNoise()
	{
		
	}
	
	public void eat(Food food) throws Exception 
	{
		if (food instanceof Plant)
		{
			throw new Exception("A carnivore is unable to eat plants");
		}
	}

}
