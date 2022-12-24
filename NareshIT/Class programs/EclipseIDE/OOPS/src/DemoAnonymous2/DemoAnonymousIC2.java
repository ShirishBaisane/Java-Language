package DemoAnonymous2;

public class DemoAnonymousIC2 {
	public static void main(String []args) {
		System.out.println("===Anonymous InnerClass as implementation class===");
		ITest ob = new ITest()
				{
					public void m1(int x) {
						System.out.println("===m1(x)===");
						System.out.println("x: "+x);
					}
					public void m2(int y) {
						System.out.println("===m2(y)===");
						System.out.println("y: "+y);
					}
				};
		ob.m1(23);
		//ob.m2(34);//Error
	
	}
}
