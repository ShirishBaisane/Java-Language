package BankTransactionInterface;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int count =0;
		abc:
			while(true) {
				System.out.println("Enter the PinNo:");
				int pNo = s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pNo);
				if(k) {
					System.out.println("===Choice===");
					System.out.println("1.WithDraw\n2.Deposit");
					System.out.println("Enter the Choice:");
					int choice = s.nextInt();
					switch(choice) {
						case 1:
							System.out.println("Enter the Amt.:");
							int a1 = s.nextInt();
							if(a1>0 && a1%100==0) {
								WithDraw wd = new WithDraw();
								wd.process(a1);
							} else {
								System.out.println("Invalid Amt...");
							}
							break abc;//stop the while loop
						case 2:
							System.out.println("Enter the Amt.:");
							int a2 = s.nextInt();
							if(a2>0 && a2%100==0) {
								Deposit dp = new Deposit();
								dp.process(a2);
							} else {
								System.out.println("Invalid Amt...");
							}
							break abc;//stop the while loop
						default:
							System.out.println("Invalid choice...");
					}//end of switch
				} else {
					System.out.println("Invalid PinNo...");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry! Transaction Blocked!");
					break;//stop the loop
				}
			}//end of loop
		
		s.close();

	}

}
