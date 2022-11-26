/*
 W.A.P. to validate Student's rollNo and display the following:
 	Year of joining, College code, Branch, Number in class & Display msg(rollNo belongs to ECE)
 */

package maccess;

import java.util.Scanner;
import test.GenerateBranch;

public class DemoString11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student rollNo: ");
		String rollNo = s.nextLine();
		int len = rollNo.length();
		if(len==10) {
			GenerateBranch gb = new GenerateBranch();
			String br = gb.generate(rollNo.substring(6,8));
			if(br.equals("CSE") || br.equals("ECE") || br.equals("EEE")) {
				System.out.println("Year of joining: "+rollNo.substring(0,2));
				System.out.println("College code: "+rollNo.substring(2,6));
				System.out.println("Branch code: "+rollNo.substring(6,8));
				System.out.println("rollNo belongs to: "+br);
				System.out.println("rollNo in class: "+rollNo.substring(8));
			} else {
				System.out.println("rollNo not matched with CSE, ECE or EEE");
			}
		} else {
			System.out.println("Invalid rollNo....");
		}
		
		s.close();

	}

}
