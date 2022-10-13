package i5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double dist=0;
		System.out.println("==Find the distance between 2 pionts (on x-axis, including -ve value)==");
		System.out.println("Enter the value for point A: ");
		double a = scan.nextDouble();
		System.out.println("Enter the value for point B: ");
		double b = scan.nextDouble();
		
		if(a>b) {
			dist = a-b;
		}
		else {
			dist = b-a;
		}
		
		System.out.println("Distance: "+dist);
		scan.close();
	}

}
