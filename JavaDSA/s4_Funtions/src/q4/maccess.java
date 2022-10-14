package q4;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find the Addition of 2 numbers using funtion===");
		System.out.println("Num1: ");
		int num1 = scan.nextInt();
		System.out.println("Num2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Addition: "+add(num1, num2));
		
		scan.close();

	}
	
	static int add(int n1, int n2) {
		return n1+n2;
	}

}
