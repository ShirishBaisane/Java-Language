//W.A.P. to read a String and check the string is Palindrome or not.(without using in-built reverse())

import java.util.*;

public class StringBufferAssn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1 = s.nextLine();
		
		StringBuffer sb = new StringBuffer();
		for(int i=str1.length()-1; i>=0; i--) {
			char ch = str1.charAt(i);
			sb.append(ch);
		}
		String str2 = sb.toString();
		
		if(str1.equals(str2)) {
			System.out.println("String is Palindrome.");
		} else {
			System.out.println("String is not Palindrome.");
		}
		
		s.close();

	}

}
