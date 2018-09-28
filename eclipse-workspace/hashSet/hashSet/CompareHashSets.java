package hashSet;

import java.util.HashSet;
import java.util.Iterator;

//  Write a Java program to compare two sets and retain elements which are same on both sets.

public class CompareHashSets {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		HashSet<Integer> firstSet = new HashSet<Integer>();
		firstSet.add(5);
		firstSet.add(3);
		firstSet.add(4);
		firstSet.add(9);
		firstSet.add(6);
		
		HashSet<Integer> secondSet = new HashSet<Integer>();
		secondSet.add(3);
		secondSet.add(8);
		secondSet.add(1);
		secondSet.add(5);
		secondSet.add(0);
		secondSet.add(7);
		
		System.out.println("elements in first set :");
		System.out.println(firstSet);
		
	
		System.out.println("elements in second set : ");
		System.out.println(secondSet);
			
	
		Integer tmp ;
		HashSet<Integer> finalFirstSet = new HashSet<Integer>();
		
		Iterator<Integer> fs = firstSet.iterator();
	     while(fs.hasNext()){
	    	
	        if(!secondSet.contains(fs.next())) {
	        	tmp = fs.next();
	        	firstSet.remove(tmp);
	        }
	     }
	       /* else
	        {
	        
	        	planning to move the matching element to another set. And then Compare elements of this set to original set and remove differences.
	            we want to wait till the very end to make sure there is not match for a particular element	
	        
	        	finalFirstSet.add(fs.next());	
	        	
	        }
	        
	     }
    
	     Iterator<Integer> ss = secondSet.iterator();
	     while(ss.hasNext()) {
	    	 int b = ss.next();
	    	 if (!finalFirstSet.contains(ss.next()))
	    	 {
	    		 secondSet.remove(b);
	    	 }
	     }*/
		
	     System.out.println("elements in first set after compare : \n");
	     System.out.println(firstSet);
	
			
		System.out.println("elements in second set after compare : \n");
		System.out.println(secondSet);
				
			
}
}
