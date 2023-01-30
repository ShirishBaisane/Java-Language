package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class demoArrays2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of String elements:");
		int n = Integer.parseInt(s.nextLine());
		String a[] = new String[n];//Array
		System.out.println("Enter "+n+" String elements:");
		for(int i=0; i<a.length; i++) {
			a[i] = new String(s.nextLine());
		}//end of loop
		System.out.println("===Display using old loop===");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i].toString()+" ");
		}
		System.out.println("");
		System.out.println("===Display using Extended for(Java5)===");
		for(String k:a) {
			System.out.print(k.toString()+" ");
		}
		System.out.println("");
		System.out.println("===Display using Spliterator<t>(java8)===");
		Spliterator<String> sp = Arrays.spliterator(a);
		sp.forEachRemaining((z) ->
		{
			System.out.print(z.toString()+" ");
		});
		
		s.close();

	}

}
