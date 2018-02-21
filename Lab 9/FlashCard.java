
public class FlashCard {

	private String question;
	private String answer;
	
	//The question and answer from the text file are passed in as parameters for a flash card 
	public FlashCard(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	public String getAnswer()
	{
		return answer;
	}
}
