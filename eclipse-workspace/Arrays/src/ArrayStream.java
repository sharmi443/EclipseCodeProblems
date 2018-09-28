import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStream {

	public static void main(String[] args) {
		int[] array = {0,1,2,4,5,3};
		int sum = Arrays.stream(array)
				.sum();
		
		List div2 = Arrays.stream(array).filter(e->e%2==0)
				.collect(Collectors.toList());
		
		System.out.println("Sum of elements in array : " + div2.toString());

	}

}