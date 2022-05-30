//Bank tansaction operation with checkPinNo,withdraw and deposit as methods.

import java.util.Scanner;

class Balance{
	int bal = 20000;
	void getBal(){
		System.out.println("Balance Amount: "+bal);
	}
}

class CheckPinNo{
	boolean k = false;
	boolean verify(int pin){
		if(pin==1111 || pin==2222 || pin==3333){
			k = true;
		}
		else{
			System.out.println("Invalid pinNo!!!");
		}
		return k;
	}
	
}

class Deposit{
	void deposit(int amt, Balance b){
		if(amt>0 && amt%100==0){
			System.out.println("Amount Deposited: "+amt);
			b.bal+=amt;
			b.getBal();
			System.out.println("Transaction Completed.");
		}
		else{
			System.out.println("Invalid Amount!!!");
		}
	}
	
}

class WithDraw{
	void withDraw(int amt, Balance b){
		if(amt<b.bal && amt>0 && amt%100==0){
			System.out.println("Amount WithDrawn: "+amt);
			b.bal-=amt;
			b.getBal();
			System.out.println("Transaction Completed.");
		}
		else{
			System.out.println("Invalid Amount!!!");
		}
	}
}

public class BankMainClass{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the pinNo:");
		int pinNo = s.nextInt();
		CheckPinNo ob1 = new CheckPinNo();
		boolean k = ob1.verify(pinNo);
	
		if(k){
			System.out.println("Enter the choice:\n1.Deposit\n2.Withdraw");
			int choice = s.nextInt();
			Balance b = new Balance();
			switch(choice){
				case 1:
					System.out.println("Enter the amount:");
					int amt1 = s.nextInt();
					Deposit dp = new Deposit();
					dp.deposit(amt1, b);
					break;
				case 2:
					System.out.println("Enter the amount:");
					int amt2 = s.nextInt();
					WithDraw wd = new WithDraw();
					wd.withDraw(amt2, b);
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}
		s.close();
	}
	
}