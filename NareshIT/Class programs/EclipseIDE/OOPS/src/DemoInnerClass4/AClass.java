package DemoInnerClass4;

public abstract class AClass {
	public class SubClass22{
		public void m22(int y) {
			System.out.println("===m22(y)===");
			System.out.println("y: "+y);
		}
	}//Instance member InnerClass
	
	public static class SubClass33{
		public void m33(int z) {
			System.out.println("===m33(z)===");
			System.out.println("z: "+z);
		}
	}//Static member InnerClass

}//OuterAbstractClass
