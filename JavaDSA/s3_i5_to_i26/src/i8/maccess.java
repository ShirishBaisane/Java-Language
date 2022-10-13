package i8;

import java.util.Scanner;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double dep1, dep2;
		System.out.println("==Depriciation as an Asset==");
		System.out.println("Enter the choice:\n1.Straight line depreciation\n2.Declining balance method");
		int choice = scan.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter 'Cost of Asset':");
				double coa =  scan.nextDouble();
				System.out.println("Enter 'Salvage value':");
				double sv =  scan.nextDouble();
				System.out.println("Enter 'Useful life':");
				int life =  scan.nextInt();
				for(int i=1; life!=0; i++) {
					dep1 = (coa-sv)/life;
					System.out.println("Depreciation for year"+i+" is:"+dep1);
					coa = coa-dep1;
					life--;
				}
				System.out.println("value of asset after STL depreciation: "+coa);
				break;
			case 2:
				System.out.println("Enter 'Current book value':");
				double cbv =  scan.nextDouble();
				System.out.println("Enter 'Depreciation rate':");
				double dr =  scan.nextDouble();
				System.out.println("Enter 'Useful life':");
				int life1 =  scan.nextInt();
				for(int i=1; life1!=0; i++) {
					dep2 = cbv*(dr/100);
					System.out.println("Depreciation for year"+i+" is:"+dep2);
					cbv =cbv-dep2;
					life1--;
				}
				System.out.println("value of asset after DBM depreciation: "+cbv);
				break;
			default:
				System.out.println("Invalid choice");
		}
		
		System.out.println("");
		scan.close();

	}

}
