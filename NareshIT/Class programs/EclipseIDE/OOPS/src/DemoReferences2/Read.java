package DemoReferences2;

import java.util.Scanner;

public class Read {
	public Product p;//Reference_variable
	
	public Read(Product prod) {
		p=prod;
	}
	
	public void read(Scanner s) {
		System.out.println("Enter the PCode: ");
		p.pCode = s.nextLine();
		System.out.println("Enter the PName: ");
		p.pName = s.nextLine();
		System.out.println("Enter the PPrice: ");
		p.pPrice = s.nextFloat();
		System.out.println("Enter the PQty: ");
		p.pQty = s.nextInt();
	}

}
