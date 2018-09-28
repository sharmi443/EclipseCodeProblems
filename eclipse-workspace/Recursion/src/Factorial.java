
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int result = fact(1);
		System.out.println(result);
	}
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		} else {
			return n*(fact(n-1));
		}
	}
}
