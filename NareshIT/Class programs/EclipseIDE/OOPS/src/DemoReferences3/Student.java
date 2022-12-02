package DemoReferences3;

public class Student {
	public String name, branch, rollNo;
	public Address ad;//reference_variable
	public Contact c;//reference_variable
	
	public Student(Address addr, Contact cont) {
		ad = addr;
		c = cont;
	}//Constructor
	
	public void getStudent() {
		System.out.println("===Student Data===");
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("RollNo: "+rollNo);
		ad.getAddress();//method_call_from_Address
		c.getContact();//method_call_from_Conatct
	}

}
