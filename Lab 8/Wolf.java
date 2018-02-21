
public class Wolf extends Carnivore{
	
	public Wolf(String name, int age)
	{
		super(name, age);
		
	}
	
	//When constructor taking no parameters is called, newborn wolf is created 
	public Wolf()
	{
		super();
	}

	public void makeNoise() 
	{
		System.out.println("Howl");
	}
		
}
