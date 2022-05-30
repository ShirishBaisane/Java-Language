/*
WAP to display all prime numbers from 1 to n.
*/

import java.util.Scanner;

public class DemoLoops5{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("====Find Prime numbers till 'n'====");
		System.out.println("Enter the number:");
		int num = s.nextInt();
		System.out.println("The Prime numbers till "+num+" are:");
		for(int n=1; n<=num; n++){
			int count=0;
			for(int i=1; i<=n; i++){
				if(n%i==0){
					count++;
				}//end of if
			}//end of inner-loop
			if(count==2 && n!=1){
				System.out.print(n+" ");
			}//end of if
		}//end of outer-loop
		s.close();
	}
}