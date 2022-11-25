//Q>W.A.P. tp read a string and display the count of vowels from the string.

import java.util.Scanner;

public class DemoString3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		int len = str.length();
		int count = 0;
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			switch(ch) {
				case 'a':
				case 'A':
					count++;
					break;
				
				case 'E':
				case 'e':
					count++;
					break;
					
				case 'i':
				case 'I':
					count++;
					break;
					
				case 'O':
				case 'o':
					count++;
					break;
					
				case 'u':
				case 'U':
					count++;
					break;
			}//end of switch
		}//end of loop
		
		System.out.println("Count of vowel/s: "+count);
		
		s.close();

	}

}
