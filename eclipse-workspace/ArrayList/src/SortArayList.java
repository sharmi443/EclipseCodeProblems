import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<Integer>();
				
		numList.add(5);
		numList.add(4);
		numList.add(1);
		numList.add(2);
		numList.add(8);
		
		int n = numList.size();
		
		for (int i = 0 ; i<(n-1) ; i++) {
			for(int j = 0 ; j < (n-i-1) ; j++) {
			if(numList.get(j) > numList.get(j+1)) {
				swap(numList ,j,j+1);
			}
		}
		
		}
		
		//printing elements from the sorted list
		
		Iterator<Integer> sortedList = numList.iterator();
		while(sortedList.hasNext()) {
			System.out.println(sortedList.next());
		}
	
		//Using sort method
		Collections.sort(numList);
		//System.out.println(numList);
		
		
		//ARRAYS
		
		int[] intArray = new int[]{ 5,4,1,2,8}; 
			
		int size = numList.size();
		
		for (int i = 0 ; i<(size-1) ; i++) {
			for(int j = 0 ; j < (size-i-1) ; j++) {
			if(intArray[j] > intArray[j+1]) {
				swapArray(intArray ,i,i+1);
			}
		}
		
		}
		
		//printing elements from the sorted list
		
		/*for(int a = 0 ; a < size ; a ++) {
			System.out.println("for Arrays : ");
			System.out.println(intArray[a]);
		}*/
	}
	
	private static void swap(List<Integer> list,Integer index1, Integer index2) {
		// TODO Auto-generated method stub
		int value1,value2 ;
		
		value1 = list.get(index1);
		value2 = list.get(index2);
		list.set(index1,value2);
		list.set(index2,value1);
		
		
	}

	private static void swapArray(int[] list,Integer index1, Integer index2) {
		// TODO Auto-generated method stub
		int value1,value2 ;
		
		value1 = list[index1];
		value2 = list[index2];
		list[index1] = value1;
		list[index2] = value2;
			
	}
	

	
}
