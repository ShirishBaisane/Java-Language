/*
 W.A.P. to read a string and count the following:
 ->Count of vowels
 ->Count of consonants
 ->count of numbers
 */

import java.util.*;

public class DemoString9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		int len = str.length();
		
		int v=0, n=0, l=0;
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			switch(ch) {
				case 'a':
				case 'A': 
					v++;
					break;
				case 'e':
				case 'E': 
					v++;
					break;
				case 'i':
				case 'I': 
					v++;
					break;
				case 'o':
				case 'O': 
					v++;
					break;
				case 'u':
				case 'U': 
					v++;
					break;
			}//end of switch for counting vowels
			int k = (char)ch;
			if((k>=65 && k<=90) || (k>=97 && k<=122)) {
				l++;
			}//counting consonants
			if(k>=48 & k<=57) {
				n++;
			}
		}//end of string-loop
		System.out.println("Count of consonants: "+(l-v));
		System.out.println("Count of Vowels: "+v);
		System.out.println("Count of Numbers: "+n);
		
		s.close();

	}

}
