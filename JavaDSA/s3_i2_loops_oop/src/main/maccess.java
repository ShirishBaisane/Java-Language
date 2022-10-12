package main;

import java.util.Scanner;

import BillDetais.Details;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bN, bU, cR, pR;
		System.out.println("Enter Bill Number: ");
		bN = scan.nextInt();
		System.out.println("Enter Billing Unit: ");
		bU = scan.nextInt();
		System.out.println("Enter Current Reading: ");
		cR = scan.nextInt();
		System.out.println("Enter Previous Reading: ");
		pR = scan.nextInt();
		
		//Creating object using Constructor with parameter
		Details det = new Details(bN, bU, cR, pR);
		
		det.getTBL();//getter_method_call
		det.getABL();//getter_method_call
		
		System.out.println("");
		
		scan.close();

	}

}
