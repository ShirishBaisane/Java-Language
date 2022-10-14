package q3;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===Find out if a person is eligible to vote===");
		System.out.println("Enter the age of the person: ");
		int age = scan.nextInt();
		
		boolean p = check(age);
		if(p==true) {
			System.out.println("The person is eligible for voting.");
		}
		else {
			System.out.println("The person is not eligible for voting.");
		}
		scan.close();

	}
	//function to verify age
	static boolean check(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
