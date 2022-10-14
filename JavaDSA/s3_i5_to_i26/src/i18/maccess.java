package i18;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==Find the Future Investment Value==");
		System.out.println("Enter the initial Investment Value(Rs.): ");
		double prin = scan.nextDouble();
		System.out.println("Enter the expected rate of return on investment(%): ");
		double rate = scan.nextDouble();
		System.out.println("Enter the Duartion(years): ");
		int t = scan.nextInt();
		
		double amt=prin;		
		for(int i=1; i<=t; i++) {
			amt = amt*(1+(rate/100));
		}
		System.out.println("Future Investment Value is(Rs.): "+amt);
		
		scan.close();

	}

}
