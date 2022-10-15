package q10;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		maccess m = new maccess();
		int num1;
		System.out.println("==Check if the number is Palindrome==");
		System.out.println("Enter the number: ");
		num1 = scan.nextInt();
		
		int num2 = m.palindrome(num1);
		
		if(num1==num2) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		scan.close();

	}
	
	int palindrome(int n) {
		int num2=0;
		while(n!=0) {
			int a = n%10;
			num2 = (num2*10)+a;
			n = n/10;
		}
		return num2;
	}

}
