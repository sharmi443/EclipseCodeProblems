import java.util.HashMap;

// comparing key,value pairs among two hashmaps

public class HashMapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> hmap = new HashMap<Character,Integer>();
		hmap.put('c', 1);
		hmap.put('a', 2);
		hmap.put('t', 1);
		hmap.put('d', 3);
		
		HashMap<Character, Integer> hmap2 = new HashMap<Character,Integer>();
		hmap2.put('c', 1);
		hmap2.put('t', 1);
		hmap2.put('d', 3);
		//hmap2.put('a', 0);
		
		if(hmap.equals(hmap2))
		{
		System.out.println("Map key value pairs are equal");
		
		}
		
		else
		{
			System.out.println("Map key values pairs are not equal");	
		}
				
	}

}
