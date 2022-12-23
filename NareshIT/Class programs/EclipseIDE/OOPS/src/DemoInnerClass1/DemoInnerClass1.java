package DemoInnerClass1;

public class DemoInnerClass1 {

	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();//OuterClass_object
		ob1.m1();//OuterClass_method_call
		
		//Static Member InnerClass object
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();
		ob2.m2();//InnerClass_Instance_method_call
		SubClass1.SubClass2.m22();//InnerClass_Static_method_call

	}

}
