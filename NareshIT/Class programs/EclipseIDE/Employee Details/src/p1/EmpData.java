package p1;

public class EmpData {
	public String empID, empName, empDesg;
	public EmpData(String a, String b, String c)
	{
		empID = a;
		empName = b;
		empDesg = c;
	}
	public void getEmpData() {
		System.out.println("===Employee Data===");
		System.out.println("EmpID = "+empID);
		System.out.println("EmpName = "+empName);
		System.out.println("EmpDesg = "+empDesg);
	}
}
