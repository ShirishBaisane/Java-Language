package i20;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Find the LCM of 2 numbers===");
		System.out.println("Enter the number a: ");
		int a = scan.nextInt();
		System.out.println("Enter the number b: ");
		int b = scan.nextInt();
		
		System.out.println("LCM of "+a+" and "+b+" is: "+lcm(a,b));
		scan.close();
	}
	
	static int lcm(int a, int b)
	{
		int result;
		if(a>b) {
			result = a;
		}
		else {
			result = b;
		}
		
		while(true) {
			if(result%a==0 && result%b==0) {
				break;
			}
			result++;
		}
		return result;
	}

}
