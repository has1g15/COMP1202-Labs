//Implements comparable interface of type animal 
public abstract class Animal implements Comparable<Animal>{

	protected String name;
	protected int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//Second constructor calls first constructor to create newborn animal 
	public Animal()
	{
		this("newborn", 0);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public abstract void makeNoise();
	
	public abstract void eat(Food food) throws Exception;
	
	//Second eat method taking food and food number as parameters 
	public void eat(Food food, Integer num)
	{
		//Food object is fed to animal the number of times specified by the parameter 
		for (int i = 0; i < num; i++)
		{
			try 
			{
				//First eat method is called with food parameter 
				eat(food);
				System.out.println(i + 1 + ": The animal is eating");
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	//Method in comparable interface is overidden, animal ages are compared so they can be ordered 
	public int compareTo(Animal animal) 
	{
		return this.age - animal.getAge();
	}
}
