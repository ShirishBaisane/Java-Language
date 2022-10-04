package p1;

public class Deposit {
	public void deposit(int depo, Balance bal) {
		bal.balance = bal.balance + depo;
		System.out.println("Amount Deposited: "+depo);
		System.out.println("Balance Amount: "+bal.balance);
		System.out.println("Transaction Completed!!!");
	}
}
