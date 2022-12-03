package DemoInheritance5;

public class CClass extends PClass {
	public static int b=10;
	public static void m2() {
		System.out.println("===CClass m2()===");
		System.out.println("The value of b: "+b);
	}
	static {
		System.out.println("===CClass static block===");
		System.out.println("The value of b: "+b);
	}

}
