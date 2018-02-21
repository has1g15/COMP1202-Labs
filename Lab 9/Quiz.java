import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz {
	
	FlashCardReader flashCardReader;
	ArrayList<FlashCard> flashCards;
	Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		Quiz q = new Quiz();
	}
	
	public Quiz()
	{
		flashCardReader = new FlashCardReader();
			
			String line[];
			String question;
			String answer;
			
			//Loop populating ArrayList of flash cards using text file 
			while (flashCardReader.fileReady())
			{
					line = flashCardReader.getLine().split(":");
					question = line[0];
					answer = line[1];
					flashCardReader.flashCards.add(new FlashCard(question, answer));
			}
			//flashCards ArrayList takes the value of the ArrayList returned from the flashCardReader class
			flashCards = flashCardReader.getFlashCards();
			
		play();
	}
	
	public void play()
	{
		String saveResponse;
		System.out.println("Would you like to save your results once the quiz has finished? Yes or No?");
		saveResponse = scanner.nextLine();
		int score = 0;
		boolean []correct = new boolean[10];
		
			//Loop printing out questions from each flash card in the ArrayList 
			for (FlashCard flashcard: flashCards)
			{
				int i = 0;
				System.out.println(flashcard.getQuestion());
				String userAnswer = scanner.nextLine();
				//If the user input is the same as the answer on the flash card, their score is incremented
				if (userAnswer.equals(flashcard.getAnswer()))
				{
					System.out.println("Correct");
					score++;
					correct[i] = true;
				}
				else
				{
					System.out.println("Incorrect. The correct answer was: " + flashcard.getAnswer());
					correct[i] = false;
				}
				i++;
			}
		
		//If the user requested to have their results saved at the end of the quiz, save() is called 
		if (saveResponse.equals("Yes"))
		{
			save(score, correct);
		}
	}

	public void save(int score, boolean[] correct)
	{
		//A new text file is created for the results to be written to 
		File userResponse = new File("F:/Lab 9/save.txt");
		if(userResponse.exists())
		{
			System.out.println("File already exists");
		}
		else
		{
			try 
			{
				userResponse.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		try 
		{
			FileWriter filewriter = new FileWriter(userResponse);
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			//For every flash card in the array list, question and answer is printed as well as if the user was correct 
			for (FlashCard flashcard: flashCards)
			{
				int i = 0;
				bufferedwriter.write(flashcard.getQuestion());
				bufferedwriter.write(" " + flashcard.getAnswer());
				if (correct[i] == true)
				{
					bufferedwriter.write(" - Correct Answer");
				}
				else
				{
					bufferedwriter.write(" - Incorrect Answer");
				}
				bufferedwriter.newLine();
				i++;
			}
			//Users score and percentage are printed 
			bufferedwriter.write("RESULTS:");
			bufferedwriter.newLine();
			bufferedwriter.write("SCORE: You answered " + String.valueOf(score) + " questions out of 10 correctly");
			bufferedwriter.newLine();
			bufferedwriter.write("PERCENTAGE: " + String.valueOf(score * 10) + "%");
			bufferedwriter.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
