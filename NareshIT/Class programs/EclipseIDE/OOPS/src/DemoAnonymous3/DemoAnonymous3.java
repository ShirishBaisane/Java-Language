package DemoAnonymous3;

import java.util.Scanner;

public class DemoAnonymous3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		if(x>=0 && y>=0) {
			System.out.println("===Choice===");
			System.out.println("1.Find Greater value\n2.Find Smaller value");
			System.out.println("Enter the choice:");
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					IComparable gr = new IComparable()
									{
										public int compareTo(int x, int y) {
											if(x>y) return x;
											return y;
										}
									};
									int r1 = gr.compareTo(x, y);
									System.out.println("Greater value: "+r1);
					break;
				case 2:
					IComparable sm = new IComparable()
									{
										public int compareTo(int x, int y) {
											if(x<y) return x;
											return y;
										}
									};
									int r2 = sm.compareTo(x, y);
									System.out.println("Greater value: "+r2);
					break;
				default:
					System.out.println("Invalid choice...");
			}
			
		}else {
			System.out.println("Invalid input...enter positive values only!!!");
		}
		
		s.close();

	}

}
