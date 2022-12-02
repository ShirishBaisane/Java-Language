package DemoReferences3;

import java.util.Scanner;

public class DemoRef3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Address ad = new Address();
		Contact c = new Contact();
		Student stu = new Student(ad,c);
		Read r = new Read(stu);
		Display d = new Display(stu);
		
		r.read(s);
		d.dis();
		
		s.close();

	}

}
