package i11;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==Find the Compound Interest==");
		System.out.println("Enter the initial Principal balance: ");
		double prin = scan.nextDouble();
		System.out.println("Enter the Rate: ");
		double rate = scan.nextDouble();
		System.out.println("Enter the number of times interest applied per year: ");
		int n = scan.nextInt();
		System.out.println("Enter the Duartion(years): ");
		int t = scan.nextInt();
		double amt=prin;
		int a = n*t;
		double b = rate/(100*n);
		for(int i=1; i<=a; i++) {
			amt = amt*(1+b);
		}
		System.out.println("C.I.: "+(amt-prin));
		
		scan.close();
	}

}
