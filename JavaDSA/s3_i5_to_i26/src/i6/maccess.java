package i6;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double comm, perc;
		System.out.println("==Calculate Commission Percentage==");
		System.out.println("Enter the Market price: ");
		double mP = scan.nextDouble();
		System.out.println("Enter the Selling price: ");
		double sP = scan.nextDouble();
		
		if(mP<sP) {
			comm = sP-mP;
			perc = (comm/mP)*100;
			System.out.println("Commission percentage : "+perc);
		}
		else {
			comm = mP-sP;
			perc = (comm/mP)*100;
			System.out.println("Commission percentage : "+perc);
		}
		
		scan.close();
	}
}
