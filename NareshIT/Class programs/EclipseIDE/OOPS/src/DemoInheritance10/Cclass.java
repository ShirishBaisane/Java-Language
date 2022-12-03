package DemoInheritance10;

public class Cclass extends Pclass {
	public Cclass(int a, int b, int c) {
		super(a,b);//Pclass_con_call_with_1_para
		System.out.println("the value c: "+c);
	}
	
	public Cclass(int a, int b, int c, int d) {
		this(a,b,c);//Same_call_con_call_with_3_para
		System.out.println("the valu d: "+d);
	}

}
