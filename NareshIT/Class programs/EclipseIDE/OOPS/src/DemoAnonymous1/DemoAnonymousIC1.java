package DemoAnonymous1;

public class DemoAnonymousIC1 {

	public static void main(String[] args) {
		System.out.println("===Anonymous InnerClass as Class extension===");
		PClass ob = new PClass()
				{
					public void m1(int x) {
						System.out.println("===CClass m1(x)===");
						System.out.println("x: "+x);
					}//Overriding_method
					public void m3(int z) {
						System.out.println("===CClass m3(z)====");
						System.out.println("z: "+z);
					}
				};
		ob.m1(234);
		ob.m2(345);
		//ob.m3(456);//Error

	}

}
