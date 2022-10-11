package main;

import java.util.Scanner;
import s3_21_Fibonacci_Series_method.Fib;

public class maccess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner_object creation
		System.out.println("Enter the element index of Fibonacci Series:\n");
		int num = s.nextInt();
		Fib fbs = new Fib(); //object_creation
		System.out.println("Element no."+num+" is:"+fbs.fib(num));//method_call
		s.close();
	}

}
