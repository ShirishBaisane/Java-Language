package DemoInheritance8;

import java.util.Scanner;

public class DemoInheritance8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Addition ad = new Addition();
		System.out.println("===Choice===");
		System.out.println("1.add(int,int)\n2.add(int,int,int)\n3.add(int,float)");
		System.out.println("Enter the choice: ");
		int choice = s.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter the value1:");
				int v1 = s.nextInt();
				System.out.println("Enter the value2:");
				int v2 = s.nextInt();
				ad.add(v1, v2);
				break;
			case 2:
				System.out.println("Enter the value1:");
				int v11 = s.nextInt();
				System.out.println("Enter the value2:");
				int v12 = s.nextInt();
				System.out.println("Enter the value3:");
				int v13 = s.nextInt();
				ad.add(v11, v12, v13);
				break;
			case 3:
				System.out.println("Enter the value1:");
				int v21 = s.nextInt();
				System.out.println("Enter the value2:");
				float v22 = s.nextFloat();
				ad.add(v21, v22);
				break;
			default:
				System.out.println("Invalid choice....");
		}
		
		s.close();
	}

}
