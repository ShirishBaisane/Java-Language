/*
WAP to read a number check number is Prime number or not?
*/

import java.util.Scanner;

public class DemoLoops4{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check if it is PrimeNo or not:");
		int num = s.nextInt();
		int count=0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				count++;
			}
		}//end of loop
		if(count==2){
			System.out.println(num+" is a Prime Number.");
		} else {
			System.out.println("Not a Prime Number!");
		}//end of if-else
		
		s.close();
	}
}//mainClass