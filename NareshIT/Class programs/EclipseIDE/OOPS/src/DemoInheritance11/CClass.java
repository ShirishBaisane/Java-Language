package DemoInheritance11;

public class CClass extends PClass {
	public static void m1(int x)
	{
		System.out.println("===CClass m1(x)===");
		System.out.println("The value x: "+x);
	}//Static_method
	
	public static void m2(int x, int y)
	{
		System.out.println("===CClass m2(x)===");
		System.out.println("The value x: "+x);
		System.out.println("The value y: "+y);
	}//Static_method
	
	public void dis(int x, int y) {
		super.m1(x);
		super.m2(x, y);
		this.m1(x);
		this.m2(x, y);
	}//Instance_method


}
