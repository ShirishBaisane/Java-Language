package DemoConcrereMethod2;

public interface ITest {
	public abstract void m1(int x);
	
	public default void m2(int y) {
		System.out.println("===Default concrete method m2(y)===");
		System.out.println("y: "+y);
	}

}
