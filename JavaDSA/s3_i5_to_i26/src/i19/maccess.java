package i19;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Find the HCF of 2 numbers===");
		System.out.println("Enter the number a: ");
		int a = scan.nextInt();
		System.out.println("Enter the number b: ");
		int b = scan.nextInt();
		
		System.out.println("HCF of "+a+" and "+b+" is: "+hcf(a,b));
		scan.close();
	}
	
	static int hcf(int a, int b)
	{
		int result;
		if(a>b) {
			result = b;
		}
		else {
			result = a;
		}
		while(result!=0) {
			if(a%result==0 && b%result==0) {
				break;
			}
			result--;
		}
		return result;
	}

}
