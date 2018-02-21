
public class Wolf extends Carnivore{	//Inherits from carnivore class 
	
	public Wolf(String name, int age)
	{
		super(name, age);	
	}

	public void makeNoise() 			//Overrides method in parent class
	{
		System.out.println("Howl");
	}
		
}
