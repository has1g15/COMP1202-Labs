
public class Parrot extends Omnivore{

	public Parrot(String name, int age)
	{
		super(name,age);
	}
	
	//Second parrot constructor calls first parrot constructor with name and parameter age passed in 
	public Parrot(Integer age)
	{
		this("Polly", age);
	}

	public void makeNoise() 
	{
		System.out.println("Squark");	
	}
}
