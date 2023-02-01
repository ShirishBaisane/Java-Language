package main;

import java.util.*;

import test.Product;

public class demoArrays3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Products:");
		int n = Integer.parseInt(s.nextLine());
		Product p[] = new Product[n];//Arrays
		
		System.out.println("Enter the details of "+n+" Products:");
		for(int i=0; i<p.length; i++) {
			System.out.println("Product "+(i+1));
			System.out.println("Enter the PCode: ");
			String pC = s.nextLine();
			System.out.println("Enter the PName: ");
			String pN = s.nextLine();
			System.out.println("Enter the PPrice: ");
			float pP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the PQty: ");
			int pQ = Integer.parseInt(s.nextLine());
			p[i] = new Product(pC, pN, pP, pQ);
		}//end of loop
		
		System.out.println("===Display using Old loop===");
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].toString()+" ");
		}
		
		System.out.println("===Display using Extended for(Java5)===");
		for(Product k:p) {
			System.out.println(k.toString()+" ");
		}
		
		System.out.println("===Display using Spliterator<T>(Java8)===");
		Spliterator<Product> sp = Arrays.spliterator(p);
		sp.forEachRemaining((z) ->
		{
			System.out.println(z.toString()+" ");
		}
		);
		
		s.close();

	}

}
