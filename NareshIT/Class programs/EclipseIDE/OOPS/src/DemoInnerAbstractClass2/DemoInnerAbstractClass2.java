package DemoInnerAbstractClass2;

public class DemoInnerAbstractClass2 {

	public static void main(String[] args) {
		ITest.AClass1 ob1 = new ITest.AClass1()
									{
										public void m1(int x) {
											System.out.println("===m1(x)===");
											System.out.println("x: "+x);
										}
									};
		ob1.m1(111);

	}

}
