import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {

	BufferedReader reader;
	FileReader file;
	ArrayList<FlashCard> flashCards;
	
	public FlashCardReader()
	{
		flashCards = new ArrayList<FlashCard>();
		try 
		{
			//Reads in text file of questions
			file = new FileReader("F:/Lab 9/Questions.txt");	 
		} 
		//If file isn't found at specified location, an exception is thrown 
		catch (FileNotFoundException e) 						
		{
			e.printStackTrace();
			//Error message printed if exception is caught 
			System.out.println("File couldn't be found");
		}
		reader = new BufferedReader(file);
	}
	
	//Method returning line of file 
	public String getLine()
	{
		String line = " ";
		try 
		{
			line = reader.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return line;
	}
	
	//Returns true if the file is ready to be read from 
	public boolean fileReady()
	{
		boolean ready = false;
		try 
		{
			if (reader.ready())
			{
				ready = true;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return ready;
	}
	
	//Method returning array list of flash cards 
	public ArrayList<FlashCard> getFlashCards()
	{
		return flashCards;
	}
}
