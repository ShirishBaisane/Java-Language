package DemoInnerClass4;

public interface ITest {
	public static class SubClass2{
		public void m2(int x) {
			System.out.println("===m2(x)===");
			System.out.println("x: "+x);
		}
	}//Static member InnerClass

}//OuterInterface
