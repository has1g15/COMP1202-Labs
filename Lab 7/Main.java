
public class Main {

	public static void main (String[] args) throws Exception
	{
		Wolf wolf = new Wolf("Will", 5);
		System.out.println(wolf.getName());
		System.out.println(wolf.getAge());
		wolf.makeNoise();
		System.out.println();
		
		Parrot parrot = new Parrot("Pop", 10);
		System.out.println(parrot.getName());
		System.out.println(parrot.getAge());
		parrot.makeNoise();
		System.out.println();
		
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
			System.err.print(e.getMessage());
		}
	}
}
