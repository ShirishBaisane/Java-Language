/*
WAP to display numbers from 1 to n by skipping Prime numbers.
*/

import java.util.Scanner;

public class DemoLoops7Assgn{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = s.nextInt();
		System.out.println("List of numbers which are not Prime numbers:");
		for(int i=1; i<=num; i++){
			int count=0;
			for(int n=1; n<=i; n++){
				if(i%n==0){
					count++;
				}//end of if
			}//end of inner loop
			if(count!=2 && i!=1){
				System.out.print(i+" ");
			}//end of if
		}//end of outer-loop
		
		s.close();
	}
}