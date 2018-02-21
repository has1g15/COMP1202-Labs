
public abstract class Animal {

	protected String name;
	protected int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	//Method implementation provided in subclasses - wolf and parrot 
	public abstract void makeNoise();
	
	//Method throws an exception if the type of food passed in can't be eaten by the animal 
	public abstract void eat(Food food) throws Exception; 
}
