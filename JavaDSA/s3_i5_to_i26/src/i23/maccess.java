package i23;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Find if the year is Leap year or not===");
		System.out.println("Enter the year: ");
		int yr = scan.nextInt();
		
		if(yr%400==0) {
			System.out.println("Leap year");
		}
		else if(yr%100==0) {
			System.out.println("Not a Leap year");
		}
		else if(yr%4==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
		scan.close();
	}

}
