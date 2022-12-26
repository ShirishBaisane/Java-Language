package DemoInnerInterface1;

public class SubClass {
	public interface ITest1{
		public abstract void m1(int x);
	}//Instance member InnerInterface
	
	public static interface ITest2{
		public abstract void m2(int y);
	}//Static member InnerInterface

}//OuterClass
