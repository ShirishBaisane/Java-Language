package q8;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		maccess m = new maccess();
		System.out.println("===Find the Grade of the subject by entering marks for the respective subject===");
		
		while(true) {
			System.out.println("Marks: ");
			int num = scan.nextInt();
			if(num>=0 && num<=100) {
				m.grade(num);
				break;
			}
			else {
				System.out.println("Re-Enter valid marks....");
			}
		}
		scan.close();

	}
	//function to print the Grade
	void grade(int n) {
		if(n>=91 && n<=100) {
			System.out.println("Grade: AA");
		}
		else if(n>=81 && n<=90) {
			System.out.println("Grade: AB");
		}
		else if(n>=71 && n<=80) {
			System.out.println("Grade: BB");
		}
		else if(n>=61 && n<=70) {
			System.out.println("Grade: BC");
		}
		else if(n>=51 && n<=60) {
			System.out.println("Grade: CD");
		}
		else if(n>=41 && n<=50) {
			System.out.println("Grade: DD");
		}
		else {
			System.out.println("Grade: Fail");
		}
	}

}