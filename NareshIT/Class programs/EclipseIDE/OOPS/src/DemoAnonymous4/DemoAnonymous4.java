package DemoAnonymous4;

import java.util.Scanner;

public class DemoAnonymous4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("***Welcome to Arithmetic calculator***");
		System.out.println("Enter value1: ");
		int v1 = s.nextInt();
		System.out.println("Enter value2: ");
		int v2 = s.nextInt();
		
		System.out.println("===Choice===\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision");
		System.out.println("Enter the choice: ");
		int choice = s.nextInt();
		switch(choice) {
			case 1:
				IArithmetic ad = new IArithmetic()
								{
									public double calculate(int x, int y) {
										return x+y;
									}
								};
								double r1 = ad.calculate(v1, v2);
								System.out.println("Addition: "+r1);
								break;
			case 2:
				IArithmetic sb = new IArithmetic()
								{
									public double calculate(int x, int y) {
										return x-y;
									}
								};
								double r2 = sb.calculate(v1, v2);
								System.out.println("Subtraction: "+r2);
								break;
			case 3:
				IArithmetic ml = new IArithmetic()
								{
									public double calculate(int x, int y) {
										return x*y;
									}
								};
								double r3 = ml.calculate(v1, v2);
								System.out.println("Multiplication: "+r3);
								break;
			case 4:
				IArithmetic dv = new IArithmetic()
								{
									public double calculate(int x, int y) {
										return x/y;
									}
								};
								double r4 = dv.calculate(v1, v2);
								System.out.println("Division: "+r4);
								break;
			case 5:
				IArithmetic md = new IArithmetic()
								{
									public double calculate(int x, int y) {
										return x%y;
									}
								};
								double r5 = md.calculate(v1, v2);
								System.out.println("ModDivision: "+r5);
								break;
			default:
				System.out.println("Invalid choice....");
			
		}
		
		s.close();	
	}

}
