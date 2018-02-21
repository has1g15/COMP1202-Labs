import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {
	
	//Instance variable 
	String words = " "; 
	
	//Quote passed into constructor is converted into lower case and stored in the instance variable  
	public WordGroup (String quote)
	{
		words = quote.toLowerCase();
	}
	
	//Words on a space are split and stored in an array 
	public String[] getWordArray()
	{
		String[] sections = words.split(" ");
		return sections;
	}
	
	//Two for loops to put words from this and the word group being passed in into a hash set 
	public HashSet<String> getWordSet(WordGroup wgroup)
	{
		HashSet<String> hset = new HashSet<>();
		
		for (String s: this.getWordArray())
		{
			hset.add(s);
		}
		
		for (String s: wgroup.getWordArray())
		{
			hset.add(s);
		}
		
		return hset;
	}
	
	//Method looping over the words returned by getWordArray and puts every word into the hash map with its occurrences 
	public HashMap<String,Integer> getWordCounts()
	{
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		HashSet<String> hset = new HashSet<String>();
		String[] words = getWordArray();
		for (String str: words)
		{
			hset.add(str);
		}
		int count = 0;
		for (String word: hset)
		{			
			for (String w: words)
			{
				//If a word in the array is the same as a word in the hash set, the number of occurrences is incremented 
				if (w.equals(word))
				{
					count++;
				}
			}
			hmap.put(word,count);
			count = 0;
		}
		return hmap;
	}
}
