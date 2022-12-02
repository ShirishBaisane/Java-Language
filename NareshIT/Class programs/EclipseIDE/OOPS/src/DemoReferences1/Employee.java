package DemoReferences1;

public class Employee {
	public String eID, eName, eDesg;
	public Contact c;//Reference variable
	
	public Employee(Contact cn) {
		c = cn;
	}
	
	public void getEmployee() {
		System.out.println("===Emp Data===");
		System.out.println("EmpID: "+eID);
		System.out.println("EmpName: "+eName);
		System.out.println("EmpDesg: "+eDesg);
		c.getContact();
	}

}
