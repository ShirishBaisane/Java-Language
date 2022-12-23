package DemoInnerClass2;

public class DemoInnerClass2 {

	public static void main(String[] args) {
		SubClass11 ob1 = new SubClass11();
		ob1.m1();
		
		SubClass11.SubClass22 ob2 = ob1.new SubClass22();//Instance_member_InnerClass_object
		ob2.m2();//InnerClass_Instance_method_call
		//SubClass11.SubClass22.m22();

	}

}
