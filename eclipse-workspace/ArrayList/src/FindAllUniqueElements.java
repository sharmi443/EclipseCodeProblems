import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// find all elements that occur only once

public class FindAllUniqueElements {
	
	public static void main(String[] args) {
		
		//UniqueElementStack();
	
		Integer[] array = {0,1,1,2,8,3,0};
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		
		//UniqueElementArray(array);
		UniqueElementList(list);
	
	}
	
	public static void UniqueElementArray(Integer[] array){
		
		List<Integer> resultlist = new ArrayList<>();
		int size = array.length;
		
		for ( int i = 0 ; i<size; i++) {
				int dup = 0;
				int j ;
			for (j = i+1 ; j< size; j++) {
				if (array[j] != array[i]) {
					continue ;
				} else {
					//break out of inner for loop and move to next iteration of outer for loop
					System.out.println("Inside else when i is : " + i + " and j is : " + j);
					dup = 1;
					break;
				}
			}		
			
			if(dup == 0) {

				System.out.println("Inside dup  when i is : " + i + " and j is : " + j);
				resultlist.add(array[i]);
			}
		}	
				
		System.out.println(resultlist);
		Integer[] resultArray = resultlist.toArray(new Integer[resultlist.size()]);
		System.out.println("Arrays to string : " + Arrays.toString(resultArray));
		
	}
	
	public static void UniqueElementList(List<Integer> list){
		
		List<Integer> resultlist = new ArrayList<>(list);
		int size = list.size();
		
		for (int i = 0 ; i< size ; i++) {
			for (int j = i+1 ; j < size ; j++) {
				if (list.get(j) == list.get(i)) {
					Integer remove = list.get(i);
					resultlist.removeAll(Collections.singleton(remove));
					break;
				}
			}
		}
		
		
		System.out.println("List : " + resultlist);
	}
	
	public static void UniqueElementStack() {
		
		Integer[] array = {0,1,1,2,3,0};
		Stack<Integer> stack = new Stack<>();
		
		int size = array.length;
		for (int i = 0 ; i<size ; i++) {
			if(stack.contains(array[i])) {
				stack.remove(array[i]);
			} else {
				stack.push(array[i]);
			}
		}
		
		System.out.println("Stack : " + stack);
		
		
	}

}
