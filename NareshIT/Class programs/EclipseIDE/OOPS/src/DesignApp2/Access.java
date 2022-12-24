package DesignApp2;

public class Access {
	public static ITest getRef() {
		//Anonymous InnerClass as Implementation class
		ITest ob = new ITest()
					{
						public void m(int x) {
							System.out.println("===InnerClass m(x)===");
							System.out.println("x: "+x);
						}
					};
		return ob;
	}

}
