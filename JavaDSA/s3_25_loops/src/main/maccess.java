package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find the Largest Number or press '0' to Quit");
		int i=1, large=1;
		while(i!=0) {
			System.out.println("Enter the number: ");
			i = scan.nextInt();
			if(i>large) {
				large=i;
			}
		}//end of loop
		System.out.println("Largest No: "+large);
		
		scan.close();

	}



}
