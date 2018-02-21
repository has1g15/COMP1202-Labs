import java.util.HashMap;
import java.util.HashSet;

public class Main {
	
	public static void main (String[] args)
	{
		//Word groups created and initialised with quotes 
		WordGroup wgroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup wgroup2 = new WordGroup("When you play play hard when you work dont play at all");
		
		//Two arrays of strings are made by calling getWordArray on both word groups 
		String[] s1 = wgroup1.getWordArray();
		String[] s2 = wgroup2.getWordArray();
		
		System.out.println("Word Group 1:");
		//Arrays are looped over and words printed 
		for (String word: s1)
		{
			System.out.println(word);
		}
		System.out.println();
		
		System.out.println("Word Group 2:");
		for (String word: s2)
		{
			System.out.println(word);
		}
		
		System.out.println();
		
		System.out.println("Hash set containing both word groups with no duplicates:");
		//The hash set returned from getWordSet method is looped over and the elements are printed 
		for (String s: wgroup1.getWordSet(wgroup2))
		{
			System.out.println(s);
		}
		System.out.println();
		
		//getWordCounts method called on both word groups and hash maps are stored 
		HashMap <String, Integer> hashMap1 = wgroup1.getWordCounts();
		HashMap <String, Integer> hashMap2 = wgroup2.getWordCounts();
		
		System.out.println("Hash map of wgroup1 with word counts:");
		//The key set of the first hash map returned is looped over and the words with their respective counts are printed 
		for (String word: hashMap1.keySet())
		{
			System.out.println(word + " " + hashMap1.get(word));
		}
		System.out.println();
		
		System.out.println("Hash map of wgroup2 with word counts");
		//The key set of the second hash map returned is looped over and the words with their respective counts are printed 
		for (String word: hashMap2.keySet())
		{
			System.out.println(word + " " + hashMap2.get(word));
		}
		
		System.out.println();
		
		System.out.println("Hash set of all words in both word groups and word counts:");
		//The getWordSet method is used to make a complete set of the words from wgroup1 and wgroup2
		HashSet <String> hset = wgroup1.getWordSet(wgroup2);
		int count;
		//The new hash set is looped over 
		for (String word: hset)
		{
			if (hashMap1.get(word) == null)
			{
				if (hashMap2.get(word) == null)
				{
					//Count variable set to 0 if the get method returns null for both hash maps 
					count = 0;
				}
				else
				{
					//If only one get method returns null the count variable is set to the word count in one hash map 
					count = hashMap2.get(word);
				}
			}
			else if (hashMap2.get(word) == null)
			{
				//If only one get method returns null the count variable is set to the word count in one hash map 
				count = hashMap1.get(word);
			}
			else
			{ 
				//If both get methods return not null then the word counts from both groups are totalled and stored in count  
				count = hashMap1.get(word) + hashMap2.get(word);
			}
			
			//The words and sum counts from each hash map are printed 
			System.out.println(word + " " + count);
		}
	}
}
