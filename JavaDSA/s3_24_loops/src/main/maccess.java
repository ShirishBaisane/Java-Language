package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ADD or press '0' to Quit");
		int i=1, sum=0;
		while(i!=0) {
			System.out.println("Enter the number: ");
			i = scan.nextInt();
			sum = sum+i;
		}//end of loop
		System.out.println("Sum: "+sum);
		
		scan.close();

	}

}
