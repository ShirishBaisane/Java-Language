package DemoInterface2;

public class IClass implements ITest {
	public void m1(int x) {
		System.out.println("===Implemented method m1(x)===");
		System.out.println("The value x: "+x);
	}//Implemented_method
	public void m2(int y) {
		System.out.println("===Implemented method m2(y)===");
		System.out.println("The value y: "+y);
	}//implemented_method
	
	public void dis (int z) {
		System.out.println("===Non-Implemented method dis(z)===");
		System.out.println("The value z: "+z);
	}

}
