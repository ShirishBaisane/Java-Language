package DemoReferences3;

import java.util.Scanner;

public class Read {
	public Student stu;//reference_variable
	
	public Read(Student st) {
		stu=st;
	}
	
	public void read(Scanner s) {
		System.out.println("Enter the Student's Name:");
		stu.name = s.nextLine();
		System.out.println("Enter the Student's Branch:");
		stu.branch = s.nextLine();
		System.out.println("Enter the Student's RollNo:");
		stu.rollNo = s.nextLine();
		System.out.println("Enter the House no.:");
		stu.ad.hNo = s.nextLine();
		System.out.println("Enter the Street Name:");
		stu.ad.sName = s.nextLine();
		System.out.println("Enter the City:");
		stu.ad.sCity = s.nextLine();
		System.out.println("Enter the PinCode:");
		stu.ad.pinCode = Integer.parseInt(s.nextLine());
		System.out.println("Enter the Student's mailID:");
		stu.c.mailId = s.nextLine();
		System.out.println("Enter the Student's phone no.:");
		stu.c.phNo = s.nextLong();
	}

}
