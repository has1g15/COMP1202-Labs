import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	public static void main (String[] args)
	{
		System.out.println("Which multiplication table would you like to print?");
		int table = input.nextInt();
    
		//For loop printing times tables 
		for (int i = 1; i < 21; i++)						
		{
			System.out.println(i + " * " + table + " = " + i*table);
		}
    
		System.out.println(" ");
		System.out.println("Successive Integers:");
		System.out.println("1");

		int total = 1;
		int count = 1;
		int iterations = 0;
    
		//While loop calculating how many successive integers to add to make a total over 500
		while(total<500)									
		{
			count++;
			total = total + count;
			System.out.println(total);
			iterations++;
		}

		System.out.println("Iterations: " + iterations);
	}
}
