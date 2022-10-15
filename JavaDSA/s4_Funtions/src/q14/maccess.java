package q14;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===Find the Sum of first N natural numbers===");
		System.out.println("Num: ");
		int num = scan.nextInt();
		
		System.out.println("The sum of first "+num+" numbers is: "+sum(num));
		
		scan.close();

	}
	
	static int sum(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}

}
