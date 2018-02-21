public class FizzBuzz {							//New class
	public static void main (String[] args){			//Main method
		for(Integer i = new Integer(1); i < 61; i++) {		//Check all numbers up to 60
			if (i % 3 == 0)					//If number is a multiple of 3, "Fizz" is printed
			{
				System.out.print("Fizz");
			}
			if (i % 5 == 0)					//If number is a multiple of 5, "Buzz" is printed 
			{
				System.out.print("Buzz");
			}
			if (i % 3 != 0 && i % 5 != 0)			//If number is neither a multiple of 3 or 5, the number, declared as i is printed 
			{
				System.out.print(i);
			}
			System.out.println();
		}							//End of loop
	}								//End of main 
}									//End of class