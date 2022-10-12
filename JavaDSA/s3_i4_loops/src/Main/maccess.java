package Main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		System.out.println("===Calculate Discount Amt. of products====");
		Scanner scan = new Scanner(System.in);
		double disc, val=1, sum=0, result;
		
		while(val!=0) {
			System.out.println("Enter the amount of product or press '0' to quit/exit");
			val = scan.nextDouble();
			if(val==0) {
				break;
			}
			sum = sum+val;
		}//end of loop
		System.out.println("Enter the Discount value(%): ");
		disc = scan.nextDouble();
		result = sum*(disc/100);
		System.out.println("The Discount of "+disc+"% on the total amount of "+sum+" is(Rs.): "+result);//required output
		scan.close();

	}

}
