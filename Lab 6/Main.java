
public class Main {

	public static void main (String[] args)
	{
		//New instance of TestCalculator 
		TestCalculator tCalc = new TestCalculator();
		
		//All tests are called and results stored in boolean variables 
		boolean test1 = tCalc.testParser();
		boolean test2 = tCalc.testAdd();
		boolean test3 = tCalc.testMultiplication();
		
		//Checks if all tests pass and prints message 
		if(test1 && test2 && test3)
		{
			System.out.println("Congratulations, your calculator appears to be working");
		}
	}
}
