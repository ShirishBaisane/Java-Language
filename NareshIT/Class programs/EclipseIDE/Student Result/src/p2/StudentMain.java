package p2;

import java.util.Scanner;
import p1.*;

public class StudentMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner object connected to OS-I/O Buffer
		//Student details
		System.out.println("Enter the Student's name: ");
		String stuName = s.nextLine();
		System.out.println("Enter Roll no.: ");
		String rollNo = s.nextLine();
		System.out.println("Enter the Branch: ");
		String branch = s.nextLine();
		
		//Enter the marks
		System.out.println("");
		System.out.println("===Enter 5 subjects marks===");
		System.out.println("Enter the Sub1 marks: ");
		int s1  = s.nextInt();
		System.out.println("Enter the Sub2 marks: ");
		int s2  = s.nextInt();
		System.out.println("Enter the Sub3 marks: ");
		int s3  = s.nextInt();
		System.out.println("Enter the Sub4 marks: ");
		int s4  = s.nextInt();
		System.out.println("Enter the Sub5 marks: ");
		int s5  = s.nextInt();
		
		//MainLogic
		if((s1>=0 && s1<=100)&&(s2>=0 && s2<=100)&&(s3>=0 && s3<=100)&&(s4>=0 && s4<=100)&&(s5>=0 && s5<=100)) {
			boolean p=false;
			if(s1<=39||s2<=39||s3<=39||s4<=39||s5<=39) {
				p=true;
			}//end of simple if
			
			int totMarks = s1+s2+s3+s4+s5;
			StudentPercentage sp = new StudentPercentage();
			float per = sp.calculate(totMarks);//method_call
			System.out.println("Percentage: "+per);
			StudentResults sr = new StudentResults();
			String result = sr.calculate(per, p);
			
			//Printing details
			System.out.println("");
			System.out.println("");
			System.out.println("===StudentResultDetails===");
			System.out.println("Name : "+stuName);
			System.out.println("Roll no.: "+rollNo);
			System.out.println("Branch: "+branch);
			System.out.println("Total marks: "+totMarks);
			System.out.println("Percentage: "+per);
			System.out.println("Result: "+result);
						
		}//end id if
		else {
			System.out.println("Invalid Marks......");
		}
		
		s.close();
	}
}
