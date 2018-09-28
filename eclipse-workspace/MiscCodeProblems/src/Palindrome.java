import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args) {
		int pal = 10368301;
		String[] input = ReturnArray(pal);
		System.out.println(Arrays.toString(input));
		int n = input.length;
		int i,counter = 0;
		for (i = 0 ; i< n/2 ; i++) {
			if(!input[i].equals(input[n-1-i])) {
				System.out.println(input[i] + " and " + input[(n-1-i)]);
				System.out.println("Not a Palindrome");
				break;
			} else {
				counter = 1 ;
				continue;
			}
		}
		if(i == n/2 && counter == 1) {
			System.out.println("Palindrome");
		}

	}
	
	public static String[] ReturnArray(int pal) {
		
		String temp = Integer.toString(pal);
		
		int size = temp.length();
		
		String[] digits = new String[size];
		for (int i = 0 ; i< size; i++) {
			digits[i] = temp.substring(i,i+1);
		}
		
		return digits;
	}

}
