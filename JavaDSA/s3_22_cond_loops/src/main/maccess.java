package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Scanner_object created
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		int p = prod(num);//Static_method_call
		int s = sum(num);//Static_method_call
		System.out.println("The Product is: "+p);
		System.out.println("The Sum is: "+s);
		int sub = p-s;
		System.out.println("The Difference between Product and Sum is: "+sub);//Result
		scan.close();
	}
	static int prod(int n)
	{
		int i=n, p=1;
		while(i!=0) {
			int mod = i%10;
			p = p*mod;
			i = i/10;
		}
		return p;
	}//end od mothod
	static int sum(int n)
	{
		int i=n, s=0;
		while(i!=0) {
			int mod = i%10;
			s = s+mod;
			i = i/10;
		}
		return s;
	}//end of method

}
