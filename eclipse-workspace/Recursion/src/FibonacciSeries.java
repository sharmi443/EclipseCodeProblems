import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FibonacciSeries {
	
	//print the fibonacci series using different methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*fibPrintList(7);
		fibPrintArray(7);
		int result = fibRecursion(7);
		System.out.println(result);*/
		fibPrintRecursion(8);

	}
	
	//using list
	public static void fibPrintList(Integer n) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		
		for (int i = 2 ; i <7 ; i++) {
			int value = list.get(i-1) + list.get(i-2);
			list.add(value);
		}
		
		Iterator<Integer> listIterator = list.iterator();
		
		while(listIterator.hasNext()) {
			System.out.print(" , ");
			System.out.print(listIterator.next());
		}
	}
	
	//using array
	public static void fibPrintArray(Integer n) {
		int count = n;
		int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;
		
		for (int i = 2 ; i <7 ; i++) {
			int value = array[i-1] + array[i-2];
			array[i] = value;
		}
		
		System.out.printf("%n");
		System.out.println(Arrays.toString(array));
		
	}
	
	public static int fibRecursion(Integer n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibRecursion(n-2) + fibRecursion(n-1);
	}
	
	public static void fibPrintRecursion(Integer n) {
		System.out.println("1");
		System.out.println("1");
		for (int i = 3 ; i <= n ; i++) {
		System.out.println(fibRecursion(i));		
		}
	}
		
}
