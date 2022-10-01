package p2;

import java.util.Scanner;
import p1.*;

public class EmpMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter EmployeeID :");
		String eID = s.nextLine();
		System.out.println("Enter Employee Name :");
		String eName = s.nextLine();
		System.out.println("Enter Employee Designation :");
		String eDesg = s.nextLine();
		EmpData eD = new EmpData(eID, eName, eDesg);
		
		System.out.println("Enter House/Flat No :");
		String hNo = s.nextLine();
		System.out.println("Enter Street Name :");
		String sN = s.nextLine();
		System.out.println("Enter City :");
		String city = s.nextLine();
		System.out.println("Enter PinCode :");
		int pCode  = Integer.parseInt(s.nextLine());
		EmpAddress eA = new EmpAddress(hNo, sN, city, pCode);
		
		System.out.println("Enter Email ID :");
		String mID = s.nextLine();
		System.out.println("Enter Mobile Number :");
		long mobileNo  = Long.parseLong(s.nextLine());
		EmpContact eC = new EmpContact(mID, mobileNo);
		
		System.out.println("Enter Basic Salary :");
		int bSal  = Integer.parseInt(s.nextLine());
		EmpSalary eS = new EmpSalary();
		
		eD.getEmpData();
		eA.getAddress();
		eC.getEmpContact();
		eS.calculateDisplay(bSal);
		
		s.close();
		
	}

}
