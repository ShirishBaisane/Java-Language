package DemoConcreteMethod1;

public interface ITest {
	public abstract void m1(int x);
	
	public static void m2(int y) {
		System.out.println("===Static Concrete method m2(y) in Interface===");
		System.out.println("y: "+y);
	}

}
