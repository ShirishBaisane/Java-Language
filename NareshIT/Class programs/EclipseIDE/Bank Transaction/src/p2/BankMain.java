package p2;

import java.util.Scanner;

import p1.Balance;
import p1.CheckPinNo;
import p1.Deposit;
import p1.Withdraw;

public class BankMain {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("===WelCome to Bank Transaction===");
		 System.out.println("Enter your Pin number: ");
		 int pinNo = s.nextInt();
		 CheckPinNo cpn = new CheckPinNo();
		 boolean k = cpn.verify(pinNo);
		 if(k) {
			 System.out.println("===Enter the Choice===\n1.Deposit\n2.Withdraw\n3.Check Balance\n:");
			 int choice = s.nextInt();
			 switch(choice) {
			 	case 1:
			 		System.out.println("Enter the amount to Deposit: ");
			 		int dep = s.nextInt();
			 		Deposit depo = new Deposit();
			 		Balance bal1 = new Balance();
			 		depo.deposit(dep, bal1);
			 		break;
			 	case 2:
			 		System.out.println("Enter the amount to Withdraw: ");
			 		int wDraw = s.nextInt();
			 		Withdraw wd = new Withdraw();
			 		Balance bal2 = new Balance();
			 		wd.withDraw(wDraw, bal2);
			 		System.out.println("");
			 		break;
			 	case 3:
			 		Balance bal3 = new Balance();
			 		bal3.getBalance();
			 		break;
			 	default:
			 		System.out.println("Invalid Choice....Repeat the transaction!!!");
			 }
		 }
		 else {
			 System.out.println("Invalid Pin number.....!!!");
		 }
		 
		 s.close();
	}

}
