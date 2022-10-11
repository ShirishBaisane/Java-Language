package main;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//Scanner_object created
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		maccess m = new maccess();
		System.out.println("");
		m.factors(num);//object_method_call
	
		scan.close();

	}
	
	void factors(int num) {
		while(num!=1)
		{
			for(int i=2; i<=num; i++)
			{
				while(num%i==0)
				{
					System.out.print(i+"\t");
					num = num/i;
				}//end of inner while
			}//end of for
		}//end of outer while
	}

}
