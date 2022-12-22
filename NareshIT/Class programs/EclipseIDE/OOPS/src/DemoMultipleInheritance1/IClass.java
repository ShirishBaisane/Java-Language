package DemoMultipleInheritance1;

public class IClass implements ITest1, ITest2{
	public void m1(int x) {
		System.out.println("===m1(x)===");
		System.out.println("The value of x: "+x);
	}
	public void m2(int y) {
		System.out.println("===m2(y)===");
		System.out.println("The value of y: "+y);
	}
	public void m3(int z) {
		System.out.println("===m3(z)===");
		System.out.println("The value of z: "+z);
	}
	
	public void dis() {
		System.out.println("===dis()===");
		System.out.println("ITest1 a: "+ITest1.a);
		System.out.println("ITest2 a: "+ITest2.a);
	}

}
