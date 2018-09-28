import java.util.HashMap;
import java.util.List;

public class GetUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "anagram";
		String sec = "margana";
		
		int firstStrLen = first.length();
		int secStrLen = sec.length();
		
		if (firstStrLen != secStrLen)
		{
			System.out.println("Strings are not equal");
		}
		else
		{
			// Each unique letter will be the key and the number of occurrences will be the value
			// Putting both the strings in hashmap as Key value pair
			
			HashMap<Character,Integer> map1 = putInHashMap(first);
			HashMap<Character,Integer> map2 = putInHashMap(sec);
			
			if(map1.equals(map2))
			{
			System.out.println("Given strings are anagrams");
			
			}
			
			else
			{
				System.out.println("Given strings are not anagrams");	
			}
		}

	}
	
	public static HashMap<Character,Integer> putInHashMap(String str) {
		int i;
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		//Question - Initially i thought after encountering the first character and counting the occurrences, i have to remove the any following 
		// occurrences to avoid double counting. But that did not seem to happen. how come?
		
		for(i = 0 ; i < str.length() ; i++)
		{
			char key = str.charAt(i);
			int value = count(str,str.charAt(i));
			hmap.put(key, value);
		}
				
		return hmap;
		
	}
	
	public static int count(String str,Character letter)
	{
		int count= 0;
		int j;
		for (j=0 ; j<str.length() ; j++)
		{	
			if(str.charAt(j) == letter)
			{
				count++;
			}
		}
		return count;
	}

}
