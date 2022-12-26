package DemoConcreteMethod1;

public class DemoConcreteMethod1 {

	public static void main(String[] args) {
		IClass ob = new IClass();
		ob.m1(11);
		ITest.m2(22);
		//IClass.m2(0);//Error

	}

}
