/*
WAP to read a number and display the reverse the given number.
*/

import java.util.Scanner;

public class DemoLoops6{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		System.out.println("Reverse of the number is:");
		/*while(num!=0){
			int x = num%10;
			System.out.print(x);
			num/=10;
		}//end of loop
		*/
		int rev=0;
		while(num!=0){
			int x = num%10;
			rev = (rev*10)+x;
			num/=10;
		}//end of loop
		System.out.println(rev);
		s.close();
	}
}