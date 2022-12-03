package DemoInheritance11;

public class PClass {
	public static void m1(int x)//hided method
	{
		System.out.println("===PClass m1(x)===");
		System.out.println("The value x: "+x);
	}
	
	public static void m2(int x, int y)//hided method
	{
		System.out.println("===PClass m2(x)===");
		System.out.println("The value x: "+x);
		System.out.println("The value y: "+y);
	}

}
