package DemoInterface1;

import java.util.Scanner;

public class DemoInterface1 {

	public static void main(String[] args) {
		//IArithmetic ob = new IArithmetic();//Error
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value1: ");
		float v1 = s.nextFloat();
		System.out.println("Enter the value2: ");
		float v2 = s.nextFloat();
		
		Addition ad = new Addition();
		double v3 = ad.calculate(v1, v2);
		System.out.println("Sum: "+v3);
		
		s.close();

	}

}
