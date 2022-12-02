package DemoReferences1;

import java.util.Scanner;

public class DemoRef1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Contact c = new Contact();
		Employee e = new Employee(c);//Con_call
		System.out.println("Enter the empID: ");
		e.eID = s.nextLine();
		System.out.println("Enter the empName: ");
		e.eName = s.nextLine();
		System.out.println("Enter the empDesg: ");
		e.eDesg = s.nextLine();
		System.out.println("Enter the mailID: ");
		e.c.mailID = s.nextLine();
		System.out.println("Enter the Phone no: ");
		e.c.phNo = s.nextLong();
		
		Display d = new Display();
		d.dis(e);//method_call
		
		s.close();

	}

}
