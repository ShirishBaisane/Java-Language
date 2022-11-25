//String comparison process

import java.util.*;

public class DemoString5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String-1:");
		String s1 = s.nextLine().trim();
		System.out.println("Enter String-2:");
		String s2 = s.nextLine().trim();
		
		System.out.println("===equals()===");
		boolean k = s1.equalsIgnoreCase(s2);
		if(k) {
			System.out.println("Strings are equal...");
		} else {
			System.out.println("Strings are not equal...");
		}
		
		System.out.println("===equals()===");
		int z = s1.compareToIgnoreCase(s2);
		if(z == 0) {
			System.out.println("Strings are equal...");
		} else if(z > 0) {
			System.out.println("String-1 is greater that String-2...");
		} else {
			System.out.println("String-1 is smaller that String-2...");
		}
		
		s.close();

	}

}
