public class GuessingGame {
	public static void main (String[] args){
		Integer numberToGuess;
		Integer guessedNumber;
		Toolbox myToolbox = new Toolbox();
		System.out.println("Welcome to the game");
		numberToGuess = new Integer (10);
		guessedNumber = myToolbox.readIntegerFromCmd();
		if (numberToGuess.equals(guessedNumber))
		{
			System.out.println("Correct Guess");
		}
		else
		{
			System.out.println("Incorrect Guess");
		}
	}
}