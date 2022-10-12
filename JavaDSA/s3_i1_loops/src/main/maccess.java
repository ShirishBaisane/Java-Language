package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		int  num, fact;//variables declaration
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.: ");
		num = scan.nextInt();
		fact = factorial(num);//static_method call
		System.out.println("Factorial of "+num+" is: "+fact);
		
		scan.close();
	}
	
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}//end of for loop
		return fact;
	}//end of method

}
