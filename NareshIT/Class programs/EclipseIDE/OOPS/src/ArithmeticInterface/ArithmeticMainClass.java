package ArithmeticInterface;

import java.util.Scanner;

public class ArithmeticMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("===Welcome to Arithmetic Calculator===");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision");
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter value1:");
				int v11 = s.nextInt();
				System.out.println("Enter value2:");
				int v12 = s.nextInt();
				Addition ad = new Addition();
				double r1 = ad.calculate(v11, v12);
				System.out.println("Addition: "+r1);
				break;
			case 2:
				System.out.println("Enter value1:");
				int v21 = s.nextInt();
				System.out.println("Enter value2:");
				int v22 = s.nextInt();
				Subtraction sb = new Subtraction();
				double r2 = sb.calculate(v21, v22);
				System.out.println("Subtraction: "+r2);
				break;
			case 3:
				System.out.println("Enter value1:");
				int v31 = s.nextInt();
				System.out.println("Enter value2:");
				int v32 = s.nextInt();
				Multiplication ml = new Multiplication();
				double r3 = ml.calculate(v31, v32);
				System.out.println("Multiplcation: "+r3);
				break;
			case 4:
				System.out.println("Enter dividend:");
				int v41 = s.nextInt();
				System.out.println("Enter divisor:");
				int v42 = s.nextInt();
				Division dv = new Division();
				double r4 = dv.calculate(v41, v42);
				System.out.println("Quotient: "+r4);
				break;
			case 5:
				System.out.println("Enter dividend:");
				int v51 = s.nextInt();
				System.out.println("Enter divisor:");
				int v52 = s.nextInt();
				ModDivision md = new ModDivision();
				double r5 = md.calculate(v51, v52);
				System.out.println("Remainder: "+r5);
				break;
			default:
				System.out.println("Invalid choice.....");
		}
		
		s.close();

	}

}
