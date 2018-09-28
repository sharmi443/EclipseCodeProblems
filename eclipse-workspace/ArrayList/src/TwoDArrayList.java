import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
      
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();
        
        for(int i = 0 ; i<inputCount ; i++) {
            int lineCount = sc.nextInt();
            List<Integer> innerList = new ArrayList<Integer>();        
            
            for(int j = 0 ; j <lineCount ; j ++) {
                int listvalue = sc.nextInt();  
                innerList.set(j,listvalue);
            }
            outerList.set(i,innerList);
        }
        
        int expCount = sc.nextInt();
        int outerIndex;
        int innerIndex;
        for(int k = 0 ; k < expCount ; k++) {
            outerIndex = sc.nextInt();
            innerIndex = sc.nextInt();
            List<Integer> tempList = new ArrayList<Integer>();
            tempList = outerList.get(outerIndex);
            
            try {
                 int ans = tempList.get(innerIndex);
                 System.out.println(ans); 
            }
            
           catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }        
        }
        
        
        
    }
}