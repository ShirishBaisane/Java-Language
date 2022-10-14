package i24;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=1, sum=0;
		System.out.println("===Find the sum of digits of a numbers===");
		num = scan.nextInt();
		
		int n=num;
		while(n!=0) {
			int a = n%10;
			sum = sum+a;
			n = n/10;
		}
		System.out.println("The Sum of digits of "+num+" is: "+sum);
		
		scan.close();
	}

}
