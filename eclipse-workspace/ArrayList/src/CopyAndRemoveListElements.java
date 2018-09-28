import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyAndRemoveListElements {

	public static void main(String[] args) {
		
		RemoveElementsFromList();	
		RemoveElementsFromArray();
		
	}
	
public static void RemoveElementsFromList() {
		
	List<Integer> originalList = new ArrayList<>();
		
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(3);
	
	List<Integer> copiedList = new ArrayList<>(originalList);
	
		System.out.println("originalList : " + originalList);
		System.out.println("copiedList after copy action : " + copiedList);
		
		Integer remove = 3 ;
		
		//using while loop to remove the elements
		
				/*while (list.contains(remove)) {
					list.remove(remove);
					}*/
				
		//using collections.singleton
				
		originalList.removeAll(Collections.singleton(remove));
				
		System.out.println("originalList after remove action : " + originalList);
		System.out.println("copiedList after remove action: " + copiedList);
				
	}
	
	
	public static void RemoveElementsFromArray() {
		
		Integer[] intArray = {1,2,3,3};
		
		Integer array[] = new Integer[] {1,2,3};
		
		//Operations on the list wrapper are propagated to the original array.
		List<Integer> list = Arrays.asList(intArray);
		
		
		//The structure of this new ArrayList is completely independent of the original array.
		List<Integer> arrayList = new ArrayList<>(Arrays.asList(intArray));
		arrayList.removeAll(Arrays.asList(1,3));	
		
		Integer[] resultArray = arrayList.toArray(new Integer[arrayList.size()]);
		
		System.out.println("Printing elements from list after removal : " + arrayList);
		
		System.out.println("Printing elements after removal and converting Array list to array : " + Arrays.toString(resultArray));
		
	}

}