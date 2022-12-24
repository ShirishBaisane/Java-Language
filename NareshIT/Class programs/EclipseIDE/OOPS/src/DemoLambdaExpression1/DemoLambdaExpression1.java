package DemoLambdaExpression1;

import java.util.Scanner;

public class DemoLambdaExpression1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int v1 = s.nextInt();
		System.out.println("Enter the value of y:");
		int v2 = s.nextInt();
		if(v1>=0 && v2>=0) {
			System.out.println("===Choice===\n1.Greater\n2.Smaller");
			System.out.println("Enter the choice:");
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					//LambdaExpression
					IComparable gt = (int x, int y) ->
									{
										if(x>y) return x;
										else return y;
									};
					int r1 = gt.compareTo(v1,v2);
					System.out.println("Greater value: "+r1);
					break;
				case 2:
					//LambdaExpression
					IComparable sm = (int x, int y) ->
									{
										if(x<y) return x;
										return y; 
									};
					int r2 = sm.compareTo(v1, v2);
					System.out.println("Smaller value r2: "+r2);
					break;
				default:
					System.out.println("Invalid choice...");
			}
		} else {
			System.out.println("Enter positive values");
		}
		
		s.close();

	}

}
