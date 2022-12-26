package DemoInnerInterface2;

public class DemoInnerInterface2 {

	public static void main(String[] args) {
		ITest.ITest1 ob = (int x) ->
							{
								System.out.println("===m1(x)===");
								System.out.println("x: "+x);
							};
		ob.m1(123);

	}

}
