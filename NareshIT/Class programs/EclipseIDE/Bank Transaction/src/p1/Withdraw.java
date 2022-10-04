package p1;

public class Withdraw {
	public void withDraw(int wDraw, Balance bal) {
		bal.balance = bal.balance - wDraw;
		System.out.println("Amount Deposited: "+wDraw);
		System.out.println("Balance Amount: "+bal.balance);
		System.out.println("Transaction Completed!!!");
	}

}
