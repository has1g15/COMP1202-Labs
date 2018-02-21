import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main (String[] args)
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		//ArrayList populated with animals 
		animals.add(new Parrot("Polly", 10));
		animals.add(new Llama("Larry", 5));
		animals.add(new Wolf("Wilfred", 7));
		
		/*
		An interface is a specification of a type that doesn't define any implementation for any
		of the methods. An abstract class is a class that's not intended for creating instances. 
		Its purpose purpose is to serve as a superclass for other classes. Abstract classes may
		contain abstract methods. 
		When the class is intended to contain implementations for some methods, an abstract class
		is needed, otherwise abstract classes or interfaces can be used but interfaces are usually
		preferable. 
		*/
		
		//Before animals are ordered by age, the original order is printed 
		for (Animal animal: animals)
		{
			System.out.println(animal.getName());
			System.out.println(animal.getAge());
		}
		
		//ArrayList is sorted using compareTo() method in Animal 
		Collections.sort(animals);
		
		System.out.println();
		
		//Ordered list is printed 
		for (Animal animal: animals)
		{
			System.out.println(animal.getName());
			System.out.println(animal.getAge());
		}
	}
}
