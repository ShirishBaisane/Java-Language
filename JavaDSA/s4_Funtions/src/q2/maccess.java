package q2;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find the number is Even or Odd===");
		System.out.println("Num: ");
		int num = scan.nextInt();
		
		maccess m = new maccess();
		m.check(num);
	}
	
	void check(int num) {
		if(num%2==0) {
			System.out.println("Even number.");
		}
		else {
			System.out.println("Odd number.");
		}
	}

}
