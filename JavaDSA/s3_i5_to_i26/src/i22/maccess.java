package i22;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Check if the number is Perfect number of not==");
		long num = scan.nextInt();
		
		long sum=0;
		//to find the sum of proper divisor
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum =sum+i;
			}
		}
		if(num==sum) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a Perfect number");
		}
		
		scan.close();
	}

}
