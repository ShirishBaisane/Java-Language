package DemoInnerAbstractClass3;

public class DemoInnerAbstractClass3 {

	public static void main(String[] args) {
		AClass ob = new AClass(){};
		AClass.AClass1 ob1 = ob.new AClass1()
									{
										public void m1(int x) {
											System.out.println("===m1(x)===");
											System.out.println("x: "+x);
										}
									};
		ob1.m1(111);

		AClass.AClass2 ob2 = new AClass.AClass2()
									{
										public void m2(int y) {
											System.out.println("===m2(y)===");
											System.out.println("y: "+y);
										}
									};
		ob2.m2(222);
		
	}

}
