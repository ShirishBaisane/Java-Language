package DemoInheritance1;

public class CClass extends PClass {
	public int b=20;
	public void m2() {
		System.out.println("===PClass m2()===");
		System.out.println("The value of b: "+b);
	}
	{
		System.out.println("===PClass Instance Block===");
		System.out.println("The value of b: "+b);
	}

}
