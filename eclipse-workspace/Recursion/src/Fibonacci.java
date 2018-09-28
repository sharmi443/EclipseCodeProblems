
public class Fibonacci {

	//print the nth element of the fibonacci series
	
	public static void main(String[] args) {
		int num = 7;
		int result = fib(num);
		System.out.println(result);

	}

	public static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-2) + fib(n-1);
	}
}
