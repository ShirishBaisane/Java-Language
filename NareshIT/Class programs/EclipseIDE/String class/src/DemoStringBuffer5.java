//W.A.P. to read a String and check the string is Palindrome or not

import java.util.Scanner;

public class DemoStringBuffer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1 = s.nextLine();
		StringBuffer sb = new StringBuffer(str1);
		sb.reverse();
		String str2 = sb.toString();//String Return type
		
		if(str1.equals(str2)) {
			System.out.println("String are Palindrome.");
		} else {
			System.out.println("String are not Palindrome.");
		}

	}

}
