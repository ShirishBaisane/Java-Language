package DemoMethodReferences;

public class DemoMethodReference {

	public static void main(String[] args) {
		ITest ob1 = Display::new;//reference to constructor
		ob1.dis(123);//Constructor body is executed
		
		Display d = new Display(100);//Con_call
		ITest ob2 = d::m1;//reference to Instance method
		ob2.dis(124);//Instance method body is executed
		
		ITest ob3 = Display::m2;//reference to Static method
		ob3.dis(125);//Static method body is executed

	}

}
