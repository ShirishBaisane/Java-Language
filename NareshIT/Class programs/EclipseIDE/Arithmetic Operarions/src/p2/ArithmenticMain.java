package p2;

import java.util.Scanner;

import p1.Addition;
import p1.Division;
import p1.ModDivision;
import p1.Multiplication;
import p1.Subtraction;

public class ArithmenticMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		System.out.print("Enter Num1: ");
		num1 = s.nextInt();
		System.out.println("Enter Num2: ");
		num2 = s.nextInt();
		System.out.println("===Enter the choice of Arithmetic operation===\n1.Addition\n2.Subtration\n3.Multiplication\n4.Division\n5.ModulusDivision(Remainder)\n:");
		int choice = s.nextInt();
		switch(choice) {
			case 1:
				Addition ad = new Addition();
				int result1 = ad.add(num1, num2);
				System.out.println("Addition = "+result1);
				break;
			case 2:
				Subtraction sb = new Subtraction();
				int result2 = sb.sub(num1, num2);
				System.out.println("Subtraction = "+result2);
				break;
			case 3:
				Multiplication ml = new Multiplication();
				int result4 = ml.mul(num1, num2);
				System.out.println("Multiplication = "+result4);
				break;
			case 4:
				Division dv = new Division();
				float result3 = dv.div(num1, num2);
				System.out.println("Division = "+result3);
				break;
			case 5:
				ModDivision md = new ModDivision();
				int result5 = md.mod(num1, num2);
				System.out.println("ModDivision = "+result5);
				break;
			default:
				System.out.println("Invalid Choice....");
		}
		
		s.close();

	}

}
