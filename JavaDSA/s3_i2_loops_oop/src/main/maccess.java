package main;

import java.util.Scanner;

import BillDetais.Details;

public class maccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bU=0, cR, pR;
		int count=0;
		long bN=0;
		boolean p = true;
		
		while(p==true) {
			System.out.println("Enter Bill Number: ");
			bN = scan.nextInt();
			long bn = bN;
			while(bn!=0) {
				bn = bn/10;
				count++;
			}
			if(count==10) {
				p=false;
			}
			else {
				count=0;
			}
			
		}
		
		p = true;
		count=0;
		while(p==true) {
			System.out.println("Enter Billing Unit: ");
			bU = scan.nextInt();
			long bu = bU;
			while(bu!=0) {
				bu = bu/10;
				count++;
			}
			if(count==4) {
				p=false;
			}
			else {
				count=0;
			}
			
		}
		
		
		System.out.println("Enter Current Reading: ");
		cR = scan.nextInt();
		
		
		System.out.println("Enter Previous Reading: ");
		pR = scan.nextInt();
		
		//Creating object using Constructor with parameter
		Details det = new Details(bN, bU, cR, pR);
		
		System.out.println("====Electricity Bill before due Date====");
		det.getTBL();//getter_method_call
		System.out.println("====Electricity Bill after due Date====");
		det.getABL();//getter_method_call
		
		System.out.println("");
		
		scan.close();

	}

}
