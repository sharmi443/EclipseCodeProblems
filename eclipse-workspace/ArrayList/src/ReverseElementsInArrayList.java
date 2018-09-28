import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseElementsInArrayList {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<Integer>();
		
		numList.add(5);
		numList.add(4);
		numList.add(1);
		numList.add(2);
		numList.add(8);
		
		int n = numList.size();
	
	
			for(int j = 0 ; j < (n/2) ; j++) {
				swap(numList ,j,n-j-1);
			
			}
		
		
			Iterator<Integer> sortedList = numList.iterator();
			while(sortedList.hasNext()) {
				System.out.println(sortedList.next());
			}
		
	}
	
	private static void swap(List<Integer> list,Integer index1, Integer index2) {
		// TODO Auto-generated method stub
		int value1,value2 ;
		
		value1 = list.get(index1);
		value2 = list.get(index2);
		list.set(index1,value2);
		list.set(index2,value1);
		
		
	}

}
