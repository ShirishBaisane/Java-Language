/*
WAP to read and display UserDetails by using Construtor_with-para, setter() & getter().
*/

import java.util.Scanner;

class CTest4{
	String uName, pWord, fName, lName, mailID;
	long phoneNo;
	CTest4(){}
	
	CTest4(String uN, String pW, String fN, String lN, String eM, long pN){
		uName=uN;
		pWord=pW;
		fName=fN;
		lName=lN;
		mailID=eM;
		phoneNo=pN;
		
		System.out.println("");
		System.out.println("===Constructor===");
		System.out.println("User details:");
		System.out.println("=====================");
		System.out.println("UserName: "+uName);
		System.out.println("Password: "+pWord);
		System.out.println("First Name: "+fName);
		System.out.println("Last Name: "+lName);
		System.out.println("EmailId: "+mailID);
		System.out.println("Phone number: "+phoneNo);
		
	}//constructor_with_parameter
	
	void setUserDetails(String uN, String pW, String fN, String lN, String eM, long pN){
		uName=uN;
		pWord=pW;
		fName=fN;
		lName=lN;
		mailID=eM;
		phoneNo=pN;
	}//setter()
	
	void getUserDetails(){
		System.out.println("User details:");
		System.out.println("=====================");
		System.out.println("UserName: "+uName);
		System.out.println("Password: "+pWord);
		System.out.println("First Name: "+fName);
		System.out.println("Last Name: "+lName);
		System.out.println("EmailId: "+mailID);
		System.out.println("Phone number: "+phoneNo);
	}//getter()[can also have rerurn type]
	
}//SubClass

class DemoCon4{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the details:");
		System.out.println("=====================");
		System.out.println("UserName: ");
		String uN = s.nextLine();
		System.out.println("Password: ");
		String pW = s.nextLine();
		System.out.println("First Name: ");
		String fN = s.nextLine();
		System.out.println("Last Name: ");
		String lN = s.nextLine();
		System.out.println("EmailId: ");
		String eM = s.nextLine();
		System.out.println("Phone number: ");
		long pN = Long.parseLong(s.nextLine());
		
		System.out.println("");
		System.out.println("Choose from the option below to display Details:\n1.Constructor\n2.setter()\n3.Object Reference\n");
		System.out.println("");
		System.out.println("Enter the choice:");
		int choice = Integer.parseInt(s.nextLine());
		System.out.println("");
		switch(choice){
				case 1:
					CTest4 ob1 = new CTest4(uN,pW,fN,lN,eM,pN);//Constructor_call_with_parameter
					break;
				case 2:
					CTest4 ob2 = new CTest4();//Constructor_call_without_parameter
					ob2.setUserDetails(uN,pW,fN,lN,eM,pN);//setter()_call
					ob2.getUserDetails();//getter()_call
					break;
				case 3:
					CTest4 ob3 = new CTest4();//Constructor_call_without_parameter
					ob3.uName=uN;
					ob3.pWord=pW;
					ob3.fName=fN;
					ob3.lName=lN;
					ob3.mailID=eM;
					ob3.phoneNo=pN;
					ob3.getUserDetails();//getter()_call
					break;
				default:
					System.out.println("Invalid Choice!!!");
			}//end of switch
		s.close();
	}
}//MainClass