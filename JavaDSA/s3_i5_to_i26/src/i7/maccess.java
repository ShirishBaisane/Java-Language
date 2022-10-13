package i7;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, pow;
		System.out.println("==Find the Power of a number==");
		System.out.println("Enter the value of the number: ");
		num = scan.nextInt();
		System.out.println("Enter the value of the power: ");
		pow = scan.nextInt();
		
		System.out.println("Power of "+pow+" of "+num+" is: "+power(num, pow));
		scan.close();
	}
	
	static int power(int n, int p) {
		int num=1;
		for(int i=0; i<p; i++) {
			num = num*n;
		}
		return num;
	}

}
