package DemoInheritance2;

import java.util.Scanner;

public class DemoInheritance2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Display d = new Display();
		d.read(s);
		d.dis();
		
		s.close();

	}

}
