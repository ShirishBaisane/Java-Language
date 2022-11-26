/*
  W.A.P. to read a string and perform the following operations:
  -> Sum of numbers.
  -> Count of others.
 */

import java.util.Scanner;

public class DemoStringAssn1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int len = str.length();
		int sum=0, count=0;
		
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			int k = ch;
			if(k>=48 && k<=57) {
				int x = k-48;
				sum += x;
			} else {
				count++;
			}
		}
		
		System.out.println("Sum of numbers in the string: "+sum);
		System.out.println("Count of other elements than numbers in the String: "+count);
		
		s.close();

	}

}