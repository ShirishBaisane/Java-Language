package DemoInnerClass3;

public class SubClass1 {
	public int a = 10;
	public static int b = 20;
	
	public void m1() {
		class SubClass2{
			public void m2() {
				System.out.println("===Instance m2()===");
				System.out.println("a: "+a);
				System.out.println("b: "+b);
			}
			/*
			public static void m22() {
				System.out.println("===Static m2()===");
				//System.out.println("a: "+a);//Error
				System.out.println("b: "+b);
			}
			*/
		}//Local member InnerClass
		SubClass2 ob2 = new SubClass2();//InnerClass_object
		ob2.m2();
		//SubClass2.m22();
	}//Instance_method
	
	public static void m11() {
		class SubClass22{
			public void m3() {
				System.out.println("===Instance m2()===");
				//System.out.println("a: "+a);//Error
				System.out.println("b: "+b);
			}
			/*
			public static void m33() {
				System.out.println("===Static m2()===");
				//System.out.println("a: "+a);//Error
				System.out.println("b: "+b);
			}
			*/
		}//Local member InnerClass
		SubClass22 ob22 = new SubClass22();
		ob22.m3();//Instance method_call
		//SubClass22.m33();//Static method_call
	}//Static_method

}//OuterClass