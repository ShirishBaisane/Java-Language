package DemoLambdaExpression3;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count=0;
		abc:
			while(true) {
				System.out.println("Enter the PinNo.:");
				int pinNo = s.nextInt();
				CheckPinNo cpn = new CheckPinNo();
				boolean k = cpn.verify(pinNo);
				if(k) {
					System.out.println("==Choice==\n1.WithDraw\n2.Deposit");
					System.out.println("Enter the choice: ");
					int choice = s.nextInt();
					switch(choice) {
						case 1:
							System.out.println("Enter the Amt.:");
							int amt1 = s.nextInt();
							if(amt1>0 && amt1%100==0) {
								//LambdaExpression
								Transaction wd = (int amt) ->
												{
													if(amt1<Transaction.b.bal) {
														System.out.println("Withdraw Ant.: "+amt1);
														Transaction.b.bal -= amt1;
														Transaction.b.getBalance();
														System.out.println("transaction completed!!!");
													} else {
														System.out.println("Insufficient funds...");
													}
												};
								wd.process(amt1);
							} else {
								System.out.println("Invalid Amt....");
							}
							break abc;
						case 2:
							System.out.println("Enter the Amt.: ");
							int amt2 = s.nextInt();
							if(amt2>0 && amt2%100==0) {
								//LambdaExpression
								Transaction dp = (int amt) ->
												{
													System.out.println("Amt. Deposited: "+amt2);
													Transaction.b.bal += amt2;
													Transaction.b.getBalance();
													System.out.println("Transaction Completed!!!");
												};
								dp.process(amt2);
							} else{
								System.out.println("Invalid Amt...");
							}
							break abc;
						default:
							System.out.println("invalid choice...");
							break abc;
					}
				} else {
					System.out.println("Invalid PinCode!!!");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry!!! Transaction Blocked!!!");
				}
			}
		
		s.close();

	}

}
