package DemoMethodReferences;

public class Display {
	public Display(int x) {
		System.out.println("===Constructor Body===");
		System.out.println("x: "+x);
	}
	
	public void m1(int y) {
		System.out.println("===Instance method body===");
		System.out.println("y: "+y);
	}
	
	public static void m2(int z) {
		System.out.println("===Static method body===");
		System.out.println("z: "+z);
	}

}
