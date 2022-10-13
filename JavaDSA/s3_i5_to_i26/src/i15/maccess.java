package i15;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n, r, ncr, npr;
		System.out.println("==Find the Combinations(nCr) and Permutaions(nPr)==");
		System.out.println("Enter the number of items: ");
		n= scan.nextInt();
		System.out.println("Enter the number of choice: ");
		r = scan.nextInt();
		
		ncr = factorial(n)/(factorial((n-r))*factorial(r));
		npr = factorial(n)/factorial((n-r));
		
		System.out.println("nCr: "+ncr);
		System.out.println("nPr: "+npr);
		
		scan.close();

	}
	
	static long factorial(long n)
	{
		long fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}//end of for loop
		return fact;
	}//end of method

}
