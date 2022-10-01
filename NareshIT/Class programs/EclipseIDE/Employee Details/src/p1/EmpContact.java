package p1;

public class EmpContact {
	public String mailID;
	public long phNo;
	public EmpContact(String a, long b)
	{
		mailID = a;
		phNo = b;
	}
	public void getEmpContact() {
		System.out.println("===Employee Contact Details===");
		System.out.println("Email ID = "+mailID);
		System.out.println("Mobile number = "+phNo);
	}
}
