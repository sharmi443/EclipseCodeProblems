import java.util.ArrayList;
import java.util.List;

//Give a list of n integers and range r, find the greatest number in each subArray of size r.
//Example array of size 7 , find greatest in subarray of size 3.

public class SubArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		//int[] a = {1,-2,4,-5,1};
		
		
		list.add(23);
		list.add(16);
		list.add(18);
		list.add(2);
		list.add(7);
		list.add(0);
		list.add(4);
		
		int arraySize = list.size();
		int range = 3;
		
		for(int i = 0; i < (arraySize- range + 1); i++) {
			int temp = list.get(i);
			for(int j = i+1 ; j < (i + range) ; j++) {
				if(temp > list.get(j)) {
					temp = temp;
				} else {
					temp = list.get(j);
				}
			}
			System.out.println(temp);
		}
		
	}

}
