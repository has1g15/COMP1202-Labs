
public class Parrot extends Omnivore{

	public Parrot(String name, int age)
	{
		super(name,age);
	}
	
	public void makeNoise()			//Overrides method in parent class 
	{
		System.out.println("Squark");	
	}
}
