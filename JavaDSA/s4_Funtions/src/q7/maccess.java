package q7;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find if the numbers is Prime or not===");
		System.out.println("Num: ");
		int num = scan.nextInt();
		
		boolean p = isPrime(num);
		if(p==true) {
			System.out.println("The number "+num+" is a Prime number");
		}
		else {
			System.out.println("The number "+num+" is not a Prime number");
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
