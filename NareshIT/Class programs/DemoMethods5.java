//WAP to read 2 int values and perform arithmetic operations based on user choice

import java.util.Scanner;

class Add{
	int add(int x, int y){
		return x+y;
	}
}

class Sub{
	int sub(int x, int y){
		return x-y;
	}
}

class Mul{
	int mul(int x, int y){
		return x*y;
	}
}

class Div{
	float div(int x, int y){
		return (float)x/y;
	}
}

class Mod{
	int mod(int x, int y){
		return x%y;
	}
}

public class DemoMethods5{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("===Welcome to Arithmetic Calculator====");
		System.out.println("Enter Value1:");
		int a = s.nextInt();
		System.out.println("Enter Value2:");
		int b = s.nextInt();
		System.out.println("*Choose from the below options*");
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod\n6.Exit\n");
		abc:
		while(true){
			System.out.println("Enter a choice:");
			int choice = s.nextInt();
			switch(choice){
				
				case 1:
					Add ad = new Add();
					System.out.println("Addition: "+ad.add(a,b)+"\n");
					break;
				case 2:
					Sub sb = new Sub();
					System.out.println("Subtraction: "+sb.sub(a,b)+"\n");
					break;
				case 3:
					Mul ml = new Mul();
					System.out.println("Multiplication: "+ml.mul(a,b)+"\n");
					break;
				case 4:
					Div dv = new Div();
					System.out.println("Division: "+dv.div(a,b)+"\n");
					break;
				case 5:
					Mod md = new Mod();
					System.out.println("Modulus: "+md.mod(a,b)+"\n");
					break;
				case 6:
					break abc;
				default:
					System.out.println("Invalid choice");
			}
		}
		
		s.close();
	}
}