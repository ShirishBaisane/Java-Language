/*
WAP to display the revers of number from 10  to n(10+ number).
o/p:
====
11 21 31 41 51 ............ 
*/

import java.util.Scanner;

class Reverse{
	int rev(int x){
		int reverse=0;
		while(x!=0){
			int r=x%10;
			reverse = (reverse*10)+r;
			x/=10;
		}//end of loop
		return reverse;
	}//end of method
}

public class DemoLoops8Assgn{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number upto which you want to reverse the number: ");
		int num = s.nextInt();
		System.out.println("");
		Reverse ob = new Reverse();
		for(int i=11; i<=num; i++){
			System.out.print(ob.rev(i)+" ");//method_call
		}//end of loop
		
		s.close();
	}
}