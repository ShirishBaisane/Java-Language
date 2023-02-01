/*
 	W.A.P. to read and display Multiple Book details
 */

package main;

import java.util.*;
import test5.BookData;

public class demoArrays6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Books: ");
		int n = Integer.parseInt(s.nextLine());
		BookData bd[] = new BookData[n];
		System.out.println("Enter "+n+" books details....");
		
		for(int i=0; i<bd.length; i++) {
			System.out.println("Book no.: "+(i+1));
			System.out.println("Enter the bCode:");
			String bC = s.nextLine();
			System.out.println("Enter the bName:");
			String bN = s.nextLine();
			System.out.println("Enter the bAuthor:");
			String bA = s.nextLine();
			System.out.println("Enter the bPrice:");
			float bP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the bQty:");
			int bQ = Integer.parseInt(s.nextLine());
			bd[i] = new BookData(bC,bN,bA,bP,bQ);
		}
		
		System.out.println("===Display using old loop===");
		for(int i=0; i<bd.length; i++) {
			System.out.println(bd[i].toString());
		}
		System.out.println("\n===Display using Extended-for===");
		for(BookData k:bd) {
			System.out.println(k.toString());
		}
		System.out.println("\n===Display using Spliterator<T> (java8)===");
		Spliterator<BookData> sp = Arrays.spliterator(bd);
		sp.forEachRemaining( (z) ->
		{
			System.out.println(z.toString());
		});
		
		
		s.close();

	}

}
