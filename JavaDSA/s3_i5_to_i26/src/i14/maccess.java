package i14;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, result=0, count=0;
		System.out.println("==Find the Armstrong number==");
		System.out.println("Enter the number: ");
		num = scan.nextInt();
		int n = num;
		while(n!=0) {
			n = n/10;
			count++;
		}
		n = num;
		while(n!=0) {
			int x= n%10;
			result = result + power(x, count);
			n = n/10;
		}
		
		if(result==num) {
			System.out.println(num+" is a Armstrong number.");
		}
		else {
			System.out.println(num+" is not a Armstrong number.");
		}
		
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
