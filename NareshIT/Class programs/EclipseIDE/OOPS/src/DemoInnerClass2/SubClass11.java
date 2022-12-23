package DemoInnerClass2;

public class SubClass11 {
	public int a=10;
	public static int b=20;
	
	public void m1() {
		System.out.println("===OuterClass method m1()===");
		System.out.println("The value a: "+1);
		System.out.println("The value b "+b);
	}
	
	public class SubClass22{
		public void m2() {
			System.out.println("===InnerClass Instance method m2()===");
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
		/*
		public static void m22() {
			System.out.println("===Inner =Class static method m22()===");
			//System.out.println("The value a: "+a);//Error
			System.out.println("The value b: "+b);
		}
		*/
	}//Instance_member_InnerClass

}//OuterClass
