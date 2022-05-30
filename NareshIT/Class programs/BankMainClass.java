//Bank tansaction operation with checkPinNo,withdraw and deposit as methods.

import java.util.Scanner;

class Balance //SubClass
	{
	int bal = 20000;//Instance variable, memory in object
	void getBal()//Instance method, memory in object
	{
		System.out.println("Balance Amount: "+bal);
	}
}

class CheckPinNo //SubClass
	{
	boolean k = false;
	boolean verify(int pin){
		if(pin==1111 || pin==2222 || pin==3333){
			k = true;
		}//end of if
		else{
			System.out.println("Invalid pinNo!!!");
		}
		return k;
	}
	
}

class Deposit //SubClass
	{
	void deposit(int amt, Balance b){
		if(amt>0){
			System.out.println("Amount Deposited: "+amt);
			b.bal+=amt;
			b.getBal();//Method_call
			System.out.println("Transaction Completed.");
		}//end of if
	}
	
}

class WithDraw //SubClass
	{
	void withDraw(int amt, Balance b){
		if(amt<b.bal){
			System.out.println("Amount WithDrawn: "+amt);
			b.bal-=amt;
			b.getBal();//method_call
			System.out.println("Transaction Completed.");
		}//end of if
		else{
			System.out.println("Insufficient Funds");
		}
	}
}

public class BankMainClass //mainClass
{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the pinNo:");
		int pinNo = s.nextInt();
		CheckPinNo ob1 = new CheckPinNo();
		boolean k = ob1.verify(pinNo);
	
		if(k){
			System.out.println("Enter the choice:\n1.Deposit\n2.Withdraw");
			int choice = s.nextInt();
			Balance b = new Balance();//Balance object
			switch(choice){
				case 1: //Deposit
					System.out.println("Enter the amount:");
					int amt1 = s.nextInt();
					if(amt1>0 && amt1%100==0){
						Deposit dp = new Deposit();
						dp.deposit(amt1, b);//method_call
					}//end of if
					else{
						System.out.println("Invalid Amount!!!");
					}
					break;
				case 2: //WithDraw
					System.out.println("Enter the amount:");
					int amt2 = s.nextInt();
					if(amt2>0 && amt2%100==0){
						WithDraw wd = new WithDraw();
						wd.withDraw(amt2, b);//method_call
					}//end of if
					else{
						System.out.println("Invalid Amount!!!");
					}
					break;
				default:
					System.out.println("Invalid Choice");
			}//end of switch
		}//end of if
		s.close();
	}
	
}