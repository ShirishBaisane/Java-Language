package q12;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Check if the numbers are Pythagorus Triplets ot Not===");
		System.out.println("side A: ");
		int num1 = scan.nextInt();
		System.out.println("side B: ");
		int num2 = scan.nextInt();
		System.out.println("Hypotenious: ");
		int num3 = scan.nextInt();
		
		boolean p = check(num1, num2, num3);
		if(p) {
			System.out.println("The numbers "+num1+", "+num2+" & "+num3+" are Pythagorus Triplets");
		}
		else {
			System.out.println("The numbers "+num1+", "+num2+" & "+num3+" are not Pythagorus Triplets");
		}
		
		scan.close();

	}
	
	static boolean check(int n1, int n2, int n3) {
		int a = (n1*n1)+(n2*n2);
		int b = (n3*n3);
		if(a==b) {
			return true;
		}
		else {
			return false;
		}
	}

}
