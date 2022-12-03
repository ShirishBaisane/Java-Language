package DemoInheritance5;

public class DemoInheritance5 {

	public static void main(String[] args) {
		System.out.println("===Display using CClass_name===");
		CClass.m1();//PClass_method_call
		CClass.m2();//CClass_method_call
		
		System.out.println("======");
		CClass ob = new CClass();
		ob.m1();
		ob.m2();

	}

}
