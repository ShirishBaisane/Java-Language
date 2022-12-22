package DemoMultipleInheritance2;

public class CClass extends PClass implements ITest {
	public void m2(int y) {
		System.out.println("===CClass m2(y)===");
		System.out.println("The value of y: "+y);
	}

}
