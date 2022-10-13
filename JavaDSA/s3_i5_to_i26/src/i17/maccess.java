package i17;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2=0;
		System.out.println("==Check if the number is Palindrome==");
		System.out.println("Enter the number: ");
		num1 = scan.nextInt();
		
		int n = num1;
		while(n!=0) {
			int a = n%10;
			num2 = (num2*10)+a;
			n = n/10;
		}
		
		if(num1==num2) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
		scan.close();
	}

}
