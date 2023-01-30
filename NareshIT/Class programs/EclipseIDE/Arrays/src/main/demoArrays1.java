package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;


public class demoArrays1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Interger elements: ");
		int n = s.nextInt();
		Integer a[] = new Integer[n];//Array
		System.out.println("Enter "+n+" Integer elements: ");
		for(int i=0; i<n; i++) {
			a[i] = new Integer(s.nextInt());
		}//end of loop
		
		System.out.println("===Display using old loop===");
		for(int i=0; i<n; i++) {
			System.out.print(a[i].toString()+" ");
		}//end of loop
		
		System.out.println("\n===Display using Entended-for(java5)===");
		for(Integer k:a) {
			System.out.print(k.toString()+" ");
		}
		
		System.out.println("\n==Display using SplIterator<T>(java8)===");
		Spliterator<Integer>sp = Arrays.spliterator(a);
		sp.forEachRemaining((z) -> {
				System.out.print(z.toString()+" ");	
				});
		
		s.close();

	}

}
