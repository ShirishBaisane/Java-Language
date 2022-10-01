package p1;

public class EmpAddress {
	public String hNo, sName, city;
	public int pincode;
	public EmpAddress(String a, String b, String c, int d)
	{
		hNo = a;
		sName = b;
		city = c;
		pincode = d;
	}
	public void getAddress() {
		System.out.println("===Employee Address===");
		System.out.println("House/Flat No. = "+hNo);
		System.out.println("Street Name = "+sName);
		System.out.println("City = "+city);
		System.out.println("PinCode = "+pincode);
	}
}
