package i21;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Check if the alphabet is Vowel or Consonant===");
		System.out.println("Enter the alphabet: ");
		char ch = scan.next().trim().charAt(0);
		int num = ch;
		if((num>=65 && num <=88) && (num>=65 && num <=88)) {
			if(ch=='a' || ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
		
			System.out.println("Vowel");
			}
			else {
			System.out.println("Consonant");
			}
		}
		else {
			System.out.println("Invalid input");
		}
		scan.close();
	}

}
