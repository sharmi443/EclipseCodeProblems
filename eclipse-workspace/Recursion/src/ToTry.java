import java.util.Arrays;

public class ToTry {

	public static void main(String[] args) {
		int n = 12345 ;
		String temp = Integer.toString(n);
		
		//System.out.println(temp.substring(1,2));
		
		int size = temp.length();
		String[] digits = new String[size];
		for (int i = 0 ; i< size; i++) {
			digits[i] = temp.substring(i,i+1);
		}
		System.out.println(Arrays.toString(digits));

	}

}
