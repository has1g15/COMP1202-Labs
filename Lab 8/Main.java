
public class Main {

	public static void main (String[] args) throws Exception
	{
		Wolf wolf = new Wolf("Wilfred", 5);
		System.out.println(wolf.getName());
		System.out.println(wolf.getAge());
		wolf.makeNoise();
		Meat bacon = new Meat("Bacon");
		//Food and food number passed into new eat method
		wolf.eat(bacon, 2);		
		System.out.println();
		
		//Second parrot constructor called 
		Parrot parrot = new Parrot(10);
		System.out.println(parrot.getName());
		System.out.println(parrot.getAge());
		parrot.makeNoise();
		
		Llama llama = new Llama("Larry", 7);
		Meat chicken = new Meat("Chicken");
		Plant plant = new Plant("Cactus");
		try
		{
			wolf.eat(plant);	
			llama.eat(chicken);
		}
		catch (Exception e)
		{
			System.out.println();
			System.err.print(e.getMessage());
			System.out.println();
		}
		
		//Newborn wolf instantiated by passing no parameters to constructor in wolf class 
		Wolf wolf2 = new Wolf();
		System.out.println(wolf2.getName());
		System.out.println(wolf2.getAge());
	}
}
