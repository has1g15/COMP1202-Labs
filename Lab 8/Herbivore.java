
public class Herbivore extends Animal{

	public Herbivore(String name, int age)
	{
		super(name, age);
	}

	public void makeNoise() 
	{
		
	}

	public void eat(Food food) throws Exception
	{
		if (food instanceof Meat)
		{
			throw new Exception("A herbivore is unable to eat meat");
		}
		else
		{
			System.out.println("The animal is eating " + food);
		}
	}

}
