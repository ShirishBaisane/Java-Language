package DemoInnerClass3;

public class DemoInnerClass3 {

	public static void main(String[] args) {
		SubClass1 ob1 = new SubClass1();//OuterClass object
		ob1.m1();//OutClass_Instance_method_call
		SubClass1.m11();//OuterClass_Static_method_call
	}

}
