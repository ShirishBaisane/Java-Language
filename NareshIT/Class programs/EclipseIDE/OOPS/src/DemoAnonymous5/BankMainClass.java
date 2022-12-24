package DemoAnonymous5;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
			while(true) {
				System.out.println("Enter PinNo: ");
				int pinNo = s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);
				if(k) {
					System.out.println("===Choice===\n1.WithDraw\n2.Deposit");
					System.out.println("Enter choice:");
					int choice = s.nextInt();
					switch(choice) {
						case 1:
							System.out.println("Enter the amt: ");
							int a1 = s.nextInt();
							if(a1>0 && a1%100==0) {
								//Anonymous InnerClass as Implementation class
								Transaction wd = new Transaction()
												{
													public void process(int amt) {
														if(amt<b.bal) {
															System.out.println("Withdraw Amt: "+amt);
															b.bal-=amt;
															b.getBalance();
															System.out.println("Transaction completed!!!");
														} else {
															System.out.println("Insufficient funds...");
														}
													}
												};
												wd.process(a1);
							} else {
								System.out.println("Invalid Amt....");
							}
							break abc;
						case 2:
							System.out.println("Enter the amt: ");
							int a2 = s.nextInt();
							if(a2>0 && a2%100==0) {
								//Anonymous InnerClass as Implementation class
								Transaction dp = new Transaction()
												{
													public void process(int amt) {															
														System.out.println("Deposit Amt: "+amt);
														b.bal+=amt;
														b.getBalance();
														System.out.println("Transaction completed!!!");
													}
												};
												dp.process(a2);
							} else {
								System.out.println("Invalid Amt....");
							}
							break abc;
						default:
							System.out.println("Invaid choice...");
							break abc;
					}
				} else {
					System.out.println("Invalid pinNo!!!");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry!!! Transaction Blocked!!!");
					break;
				}
			}
		s.close();

	}

}
