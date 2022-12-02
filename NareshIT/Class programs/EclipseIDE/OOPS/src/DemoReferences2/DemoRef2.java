package DemoReferences2;

import java.util.Scanner;

public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		Product prod = new Product();
		
		Read r = new Read(prod);//Con_call
		r.read(s);//method_call
		
		Display d = new Display(prod);//Con_call
		d.dis();//method_call
		
		s.close();

	}

}
