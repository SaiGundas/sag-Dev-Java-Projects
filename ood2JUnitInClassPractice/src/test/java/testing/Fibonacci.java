package testing;

public class Fibonacci {

	public static int fib(int i) {
		if(i==1) {
		return 0;
	 } 
		if( i == 2) {
		return 1;
	}
	return fib( i - 1) + fib( i - 2);
	}
}
