package q13;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find the Prime numbers between the range===");
		System.out.println("Enter starting point: ");
		int a = scan.nextInt();
		System.out.println("Enter ending point: ");
		int b = scan.nextInt();
		
		for(int i = a; i<=b; i++) {
			if(isPrime(i)) {
				System.out.println("The number "+i+" is a Prime number");
			}
		}
		
		scan.close();

	}
	
	//Function to check if the number is Prime or not
		static boolean isPrime(int n) {
			boolean p = false;
			int count =0;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				p = true;
			}
			return p;
		}

}
