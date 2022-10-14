package i26;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=1, sumN=0, sumE=0, sumO=0;
		System.out.println("==Sum of Negative numbers, Positive Even numbers, Positive Odd numbers==");
		while(num!=0) {
			System.out.println("Enter the number OR press '0' to quit: ");
			num = scan.nextInt();
			if(num<0) {
				sumN = sumN+num;
			}
			else if(num>0 && num%2==0) {
				sumE = sumE+num;
			}
			else  {
				sumO = sumO+num;
			}
		}
		
		System.out.println("Sum of Negative numbers is: "+sumN);
		System.out.println("Sum of Positive Even numbers is: "+sumE);
		System.out.println("Sum of Positive Odd numbers is: "+sumO);
		
		scan.close();

	}

}
