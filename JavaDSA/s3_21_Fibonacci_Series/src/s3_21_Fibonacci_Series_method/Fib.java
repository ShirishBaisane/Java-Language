package s3_21_Fibonacci_Series_method;

public class Fib {
	public int fib(int n) {
		int a=0, b=1, c;//initial_variables
		if(n==0)
			return a;
		for(int i=2; i<=n; i++) {
			c = a+b;
			a = b;
			b = c;
		}//end of loop
		return b;
	}//end of method
}
