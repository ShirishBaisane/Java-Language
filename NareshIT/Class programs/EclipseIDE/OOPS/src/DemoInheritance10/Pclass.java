package DemoInheritance10;

public class Pclass {
	public Pclass(int a) {
		System.out.println("The value of a: "+a);
	}
	public Pclass(int a, int b) {
		this(a);//Same class con_call_with_1_para
		System.out.println("The value b: "+b);
	}

}
