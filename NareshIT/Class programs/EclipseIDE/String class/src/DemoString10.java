//W.A.P. to read a String and display the sum of numbers in a given String.

import java.util.*;

public class DemoString10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		int len = str.length(), sum=0;
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			int k = ch;//generating ASCII value
			if(k>=48 && k<=57) {
				char ch2 = (char)k;//convert ASCII value to char
				System.out.print(ch2+" ");
				String s1 = String.valueOf(ch2);//convert char into String
				int z = Integer.parseInt(s1);//convert String into int
				sum += z;
			}
		}//end of loop
		System.out.println("\nSum of numbers: "+sum);
		s.close();

	}

}
