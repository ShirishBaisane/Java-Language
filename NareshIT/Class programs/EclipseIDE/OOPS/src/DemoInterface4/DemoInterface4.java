package DemoInterface4;

import java.util.Scanner;

public class DemoInterface4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = s.nextInt();
		System.out.println("Enter the value of y: ");
		int y = s.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("===Choice===");
			System.out.println("1.Greater\n2.Smaller");
			System.out.println("Enter the choice: ");
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					Greater gt = new Greater();
					int r1 = gt.compareTo(x, y);
					System.out.println("Greater value is: "+r1);
					break;
				case 2: 
					Smaller sm = new Smaller();
					int r2 = sm.compareTo(x,y);
					System.out.println("Smaller value is: "+r2);
					break;
					
				default: 
					System.out.println("Invalid choice...");
			}//end of switch
		} else {
			System.out.println("Invalid choice...");
		}//end of loop
		
		s.close();

	}

}
