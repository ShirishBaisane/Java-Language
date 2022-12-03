package DemoInheritance9;

public class CClass extends PClass {
	public int a = 200;
	
	public void m(int x, int y) {
		super.m(x);//PClass_method_call_with_1_para
		System.out.println("The value of y: "+y);
	}
	
	public void m(int x, int y, int z) {
		this.m(x,y);
		System.out.println("The value z: "+z);
	}
	
	public void dis() {
		System.out.println("===Display Variable Data===");
		System.out.println("PClass a: "+super.a);
		System.out.println("CClass a: "+this.a);
	}

}
