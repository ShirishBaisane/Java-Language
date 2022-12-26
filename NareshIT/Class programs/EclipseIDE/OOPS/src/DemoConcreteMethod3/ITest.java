package DemoConcreteMethod3;

public interface ITest {
	public abstract void m1(int x);
	
	private void m2(int y) {
		System.out.println("===Non-static private concrete method m2(y)===");
		System.out.println("y: "+y);
	}
	
	private static void m3(int z) {
		System.out.println("===Static private concrete method m3(z)===");
		System.out.println("z: "+z);
	}
	
	public default void access(int z, int y) {
		this.m2(y);
		ITest.m3(z);
	}

}
